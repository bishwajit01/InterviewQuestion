package concepts;

/**
 * OverRiding Concepts
 * @author Bishwajit.
 *
 */
class Parent {
	protected void fun() {
		System.out.println("Parent.fun");
	}
	public void area(Integer a) {
		System.out.println("Parent.Integer");
	}
}

/**
 * 
 * @author Bishwajit.
 *
 */
public class OverRiding extends Parent {

	public void fun() {
		System.out.println("Child.fun");
	}

	public void foo() throws Exception {
		System.out.println("Child.fun");
		int a = 10 / 0;
	}
	
	public void area(String a) {
		System.out.println("Parent.Integer");
	}

	public static void main(String[] args) throws Exception {
		Parent obj1 = new OverRiding();
		OverRiding obj2 = new OverRiding();

		obj1.fun();
		obj2.fun();

//		obj1.foo(); // it won't allow.
		obj2.foo(); // we have to Handle Exception here.
		
//		obj2.area(null); // it wont allow. It will give error as ambiguous.
		obj1.area(null);
	}

}
