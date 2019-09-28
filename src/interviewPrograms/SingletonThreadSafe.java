package interviewPrograms;

/**
 * @author Bishwajit.
 * 
 *         Pros :: 
 *         1. Lazy initialization is possible.
 *         2. Thread Safe.
 * 
 *         Cons. 
 *         1. Since it is synchronized, it is slow.
 *
 */
public class SingletonThreadSafe {

	public static void main(String[] args) {
		SingletonTS obj1 = SingletonTS.getObject();
		SingletonTS obj2 = SingletonTS.getObject();

		// Modifying the value of 1st object.
		obj1.num += 20;

		// After modifying value of 1st object
		System.out.println("Value of 1st objcet :: " + obj1.num);
		System.out.println("Value of 2nd objcet :: " + obj2.num);
	}

}

class SingletonTS {
	static SingletonTS singletonTS;
	int num;

	private SingletonTS() {
		this.num = 10;
	}

	synchronized public static SingletonTS getObject() {
		if (null == singletonTS) {
			return new SingletonTS();
		}
		return singletonTS;
	}
}
