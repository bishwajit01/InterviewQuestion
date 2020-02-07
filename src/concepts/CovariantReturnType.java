/**
 * 
 */
package concepts;

/**
 * @author Bishwajit.
 *
 */
public class CovariantReturnType {

	public static void main(String[] args) {
		// Overriding Concept
		CType c = new DType();
		AType a = c.getFoo();
	}

}

class AType {
}

class BType extends AType {
}

// "Class B is narrower than class A"
// Classes demonstrating method overriding:

class CType {
	AType getFoo() {
		System.out.println("CType");
		return new AType();
	}
}

class DType extends CType {
//Overriding getFoo() in parent class C
	BType getFoo() {
		System.out.println("DType");
		return new BType();
	}
}