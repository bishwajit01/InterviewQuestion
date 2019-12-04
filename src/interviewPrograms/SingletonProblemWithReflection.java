package interviewPrograms;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Bishwajit.
 * Singleton class be broken by using two mechanism
 * 1. Serialization and De-Serialization.
 * 2. Cloneable.
 * 3. Reflection
 *
 */
public class SingletonProblemWithReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		// First Instance
		SingletonSample2 singleton1 = SingletonSample2.getInstance();
		
		// Breaking Singleton using Reflection.
		Constructor constructor = singleton1.getClass().getDeclaredConstructor(new Class[0]);
		constructor.setAccessible(true);
		
		// Second Instance
		SingletonSample2 singleton2 = (SingletonSample2) constructor.newInstance();
		
		singleton1.setValue(1);
		singleton2.setValue(2);
		
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
		System.out.println("Printing the value inside of Singleton");
		System.out.println("First Singleton Value :: " + singleton1.getValue());
		System.out.println("Second Singleton Value :: " + singleton2.getValue());

	}

}

class SingletonSample2 {

	private static SingletonSample2 singleton;
	private int value;

	private SingletonSample2() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonSample2 getInstance() {
		if (null == singleton) {
			singleton = new SingletonSample2();
		}
		return new SingletonSample2();
	}

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