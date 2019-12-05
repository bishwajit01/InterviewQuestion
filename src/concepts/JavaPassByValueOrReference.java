package concepts;

/**
 * @author Bishwajit.
 * 
 *         JAVA is STRICTLY pass by VALUE.
 *
 */
public class JavaPassByValueOrReference {

	public static void main(String[] args) {

		Test obj = new Test(5);
		System.out.println("Original Value :: " + obj.num);

		// Reference is passed to changed the value.
		passByReferenceChange(obj);
		System.out.println("New Value when trying to change using passByReference :: " + obj.num); //5

		passByValueChange(obj);
		System.out.println("New Value when trying to change using passByValue :: " + obj.num); //10
	}

	private static void passByValueChange(Test obj) {
		obj.num = 10;
	}

	private static void passByReferenceChange(Test obj) {
		obj = new Test();
	}

}

class Test {
	int num;

	public Test(int id) {
		this.num = id;
	}

	public Test() {
		this.num = 0;
	}

}