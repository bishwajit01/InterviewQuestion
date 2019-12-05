package concepts;

/**
 * @author Bishwajit.
 * 
 *         JAVA is STRICTLY pass by VALUE.
 *
 */
public class JavaPassByValueOrReference {

	public static void main(String[] args) {

		TestValueReference obj = new TestValueReference(5);
		System.out.println("Original Value :: " + obj.num);

		// Reference is passed to changed the value.
		passByReferenceChange(obj);
		System.out.println("New Value when trying to change using passByReference :: " + obj.num); //5

		passByValueChange(obj);
		System.out.println("New Value when trying to change using passByValue :: " + obj.num); //10
	}

	private static void passByValueChange(TestValueReference obj) {
		obj.num = 10;
	}

	private static void passByReferenceChange(TestValueReference obj) {
		obj = new TestValueReference();
	}

}

class TestValueReference {
	int num;

	public TestValueReference(int id) {
		this.num = id;
	}

	public TestValueReference() {
		this.num = 0;
	}

}