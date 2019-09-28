package interviewPrograms;

/**
 * @author Bishwajit.
 * 
 *         Pros: 
 *         1. Lazy initialization is possible.
 *         2.Thread Safe.
 *         3. Performance Reduced since it is synchronized.
 * 
 *         Cons: 
 *         1. First time, it affects the performance.
 *
 */
public class SingletonLazyInitializationDoubleCheck {

	public static void main(String[] args) {
		SingletonLIDC obj1 = SingletonLIDC.getObject();
		SingletonLIDC obj2 = SingletonLIDC.getObject();

		// Modifying the value of 1st object.
		obj1.num += 20;

		// After modifying value of 1st object
		System.out.println("Value returned from 1st object :: " + obj1.num);
		System.out.println("Value returned from 1st object :: " + obj2.num);
	}

}

class SingletonLIDC {
	static SingletonLIDC singletonLIDC;
	int num;

	private SingletonLIDC() {
		this.num = 10;
	}

	public static SingletonLIDC getObject() {
		if (null == singletonLIDC) {
			synchronized (SingletonLIDC.class) {
				if (null == singletonLIDC) {
					return new SingletonLIDC();
				}
			}

		}
		return singletonLIDC;
	}
}
