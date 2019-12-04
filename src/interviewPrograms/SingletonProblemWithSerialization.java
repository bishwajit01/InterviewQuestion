package interviewPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Bishwajit.
 * 
 * Singleton class be broken by using two mechanism
 * 1. Serialization and De-Serialization.
 * 2. Cloneable.
 * 3. Reflection
 * 
 * However, it can be prevented by using readResolve().
 *
 */
public class SingletonProblemWithSerialization {

	public static void main(String[] args) {
		SingletonSample1 singleton1 = SingletonSample1.getInstance();
		singleton1.setValue(1);

		// Serialization
		FileOutputStream fileOut;
		ObjectOutputStream out;
		try {
			fileOut = new FileOutputStream("C:\\Work\\out.ser");
			out = new ObjectOutputStream(fileOut);
			out.writeObject(singleton1);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		singleton1.setValue(2);

		// De-Serialization.

		SingletonSample1 singleton2 = null;

		try {
			FileInputStream fileIn = new FileInputStream("C:\\Work\\out.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			singleton2 = (SingletonSample1) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("singletons.SingletonEnum class not found");
			c.printStackTrace();
		}

		System.out.println("Printing the VALUE");
		System.out.println("SINGLETON 1:: " + singleton1);
		System.out.println("SINGLETON 2:: " + singleton2);

		System.out.println("");
		if (singleton1 == singleton2) {
			System.out.println("No new object created.");
		} else if (null == singleton1 || null == singleton2) {
			System.out.println("Either of the value is null");
		} else {
			System.out.println("New object is created.");
		}
		
		System.out.println("");
		System.out.println("Printing the HASHCODE :: ");
		System.out.println("hashCode ::" + singleton1.hashCode());
		System.out.println("hashCode ::" + singleton2.hashCode());

		System.out.println("\n");
		System.out.println("Printing the value inside of Singleton");
		System.out.println("First Singleton Value :: " + singleton1.getValue());
		System.out.println("Second Singleton Value :: " + singleton2.getValue());
	}

}

class SingletonSample1 implements Serializable {

	private static final long serialVersionUID = 1L;

	static SingletonSample1 singleton;
	private int value;
	
	// Private Constructor.
	private SingletonSample1() {

	}

	public static SingletonSample1 getInstance() {
		if (singleton == null)
			return new SingletonSample1();
		return new SingletonSample1();
	}

	// To make 100 % Singleton we have to use readResolve in the Singleton Class.

	/*
	 * protected Object readResolve() { return singleton; }
	 */

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
}
