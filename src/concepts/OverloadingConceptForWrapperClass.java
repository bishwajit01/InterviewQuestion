package concepts;

/**
 * @author Bishwajit.
 *
 */
public class OverloadingConceptForWrapperClass {

	public static void main(String[] args) {
		OverloadingConceptForWrapperClass obj = new OverloadingConceptForWrapperClass();
		obj.foo(null); // String
		//obj.fun(null); // Compile Time Error
	}

	public void foo(String s) {
		System.out.println("String Called");
	}

	public void foo(Object o) {
		System.out.println("Object Called.");
	}

	public void fun(String s) {
		System.out.println("String Called.");
	}

	public void fun(Integer i) {
		System.out.println("Integer Called.");
	}
}
