package concepts;

/**
 * 
 * @author Bishwajit.
 *
 */
public class ExceptionHandlingConcept {
	public static void main(String[] args) throws Throwable {

		ParentA ob = new ChildA();
		ob.funny();
		// ob.display();

	}
}

class ParentA {
	void funny() throws Throwable {
		System.out.println("A class funny calling");
	}

	protected int display() {
		System.out.println("Child class funny calling");
		return 1;
	}

}

class ChildA extends ParentA {
	void funny() throws Exception {
		System.out.println("Child class funny calling");
	}

	public int display() {
		System.out.println("Child display calling");
		return 1;
	}
}
