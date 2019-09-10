/**
 * 
 */
package concepts;

/**
 * @author Bishwajit.
 *
 */
public class OverloadingTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Overloading with different signature");
		System.out.println(new OverloadingTypes().sum(3));
		System.out.println(new OverloadingTypes().sum(3, 7));
		
		System.out.println("Static Method");
		System.out.println(foo("a"));
		System.out.println(foo("a", 1));
	}

	public static void main(String[] args, String[] args1) {
		System.out.println("2nd main");// This wont execute, as this one is the not matching signature.
	}

	/**
	 * 
	 * @param x int.
	 * @param y int.
	 * @return int.
	 */
	private int sum(int x, int y) {
		return (x + y);
	}

	/**
	 * 
	 * @param y
	 * @return
	 */
	int sum(int y) {
		return y;
	}

	/**
	 * 
	 * @param y
	 * @return
	 */
	double sum(double y) {
		return (double) y;
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	static String foo(String str) {
		return str;
	}

	/**
	 * 
	 * @param str
	 * @param a
	 * @return
	 */
	static int foo(String str, int a) {
		return a;
	}
}
