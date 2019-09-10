/**
 * 
 */
package interviewPrograms;

/**
 * @author Bishwajit.
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
		// TODO Auto-generated constructor stub
		this.num = 24;
	}

	static public Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
