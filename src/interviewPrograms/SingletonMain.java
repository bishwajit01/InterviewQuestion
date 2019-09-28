package interviewPrograms;

/**
 * @author Bishwajit.
 * 
 *         Pros:: 
 *         1. Object is created only if it is needed.
 *         2. Exception Handling is possible.
 * 
 *         Cons::
 *         1. Every time a null check has to be done.
 *         2. Instance can't be accessed directly. It's not thread safe.
 *
 */
public class SingletonMain {
	public static void main(String[] args) {
		Singleton object1 = Singleton.getInstance();
		Singleton object2 = Singleton.getInstance();
		object1.num += 12;
		System.out.println("Value of Object 1 : " + object1.num);
		System.out.println("Value of Object 2 : " + object2.num);
	}

}

class Singleton {
	static Singleton singleton = null;
	int num = 0;

	private Singleton() {
		this.num = 24;
	}

	static public Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
