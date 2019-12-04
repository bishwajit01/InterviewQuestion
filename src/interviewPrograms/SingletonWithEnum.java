package interviewPrograms;

/**
 * @author Bishwajit.
 * 
 * A 100% Singleton can only be achieved only by enum. 
 * This is because if we serialize the enum, we lose the value of enum.
 *
 */
public class SingletonWithEnum {

	public static void main(String[] args) {
		
		// Creating the first instance.
		SingletonEnum singleton1 = SingletonEnum.INSTANCE;
		singleton1.setValue(2);
		System.out.println(singleton1.getValue());

		// Creating the first instance.
		SingletonEnum singleton2 = SingletonEnum.INSTANCE;
		System.out.println(singleton2.getValue());
		
		System.out.println();
		System.out.println("Printing the VALUE ");
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
		System.out.println("Printing the HASHCODE ");
		System.out.println("hashCode ::" + singleton1.hashCode());
		System.out.println("hashCode ::" + singleton2.hashCode());

		System.out.println("");
		System.out.println("Printing the value inside of Singleton");
		singleton1.setValue(10);
		System.out.println("First Singleton Value :: " + singleton1.getValue());
		System.out.println("Second Singleton Value :: " + singleton2.getValue());

	}

}

enum SingletonEnum {
	INSTANCE;
	int value;

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