package concepts;

/**
 * @author Bishwajit.
 *
 */

// If there is Same method in Abstract class and Interface.
// It will give Compile time error.
public class SameMethodInAbstractAndInterface extends AbstractClass implements InterfaceClass {

	public static void main(String[] args) {

		// We cannot create Object of Abstract Class or Interface.
		// We can create an Reference of Abstract Class or Interface.
		// Else it will give Compile Time Error.
		// AbstractClass objAbstract = new AbstractClass();

	}

	@Override
	void laughAgain() {
		// TODO Auto-generated method stub

	}

	// Compile Time error to implement the unimplemented Method.
}

// Abstract Class.
abstract class AbstractClass {

	// We can create Constructor for abstract class.
	public AbstractClass() {
		// Default COnstructor.
	}

	// Commenting out the code to remove error.
	// void laugh() {
	// System.out.println("HAHA");
	// }

	void laughOne() {
		System.out.println("HAHA");
	}

	abstract void laughAgain();
}

// Interface.
interface InterfaceClass {

	// Commenting out the code to remove error.
	// public void laugh();
}