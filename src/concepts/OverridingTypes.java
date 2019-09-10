package concepts;

/**
 * 
 * @author Bishwajit.
 *
 */
class A {
	public void foo1() {
		System.out.println("Foo1_A");
	}

	protected void foo2() {
		System.out.println("Foo2_A");
	}

	public static void foo3() {
		System.out.println("Foo3_A");
	}

	public void foo4() {
		System.out.println("Foo4_A");
	}
}

/**
 * 
 * @author Bishwajit.
 *
 */
class B extends A {
	public void foo1() {
		System.out.println("Foo1_B");
	}

	public void foo2() {
		System.out.println("Foo2_B");
	}

	public static void foo3() {
		System.out.println("Foo3_B");
	}
	
	public void foo4() {
		super.foo4();
		System.out.println("Foo4_B");
	}
}

/**
 * 
 * @author Bishwajit.
 *
 */
public class OverridingTypes {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b1 = new B();
		
		//Up Casting
		if(a2 instanceof B)  {
			B b2 = (B) a2;
			System.out.println("Up Type Casting");
		}

		System.out.println("First");
		a1.foo1();
		a2.foo1();
		b1.foo1();

		System.out.println("\n Overriding and Access-Modifiers ");
		a1.foo2();
		a2.foo2();
		b1.foo2();
		
		System.out.println("\n Static methods can not be overridden(Method Overriding vs Method Hiding)");
		a1.foo3();
		a2.foo3(); // Method Hiding
		b1.foo3();
		
		System.out.println("\n Invoking overridden method from sub-class.");
		a1.foo4();
		a2.foo4();
		b1.foo4();
	}

}
