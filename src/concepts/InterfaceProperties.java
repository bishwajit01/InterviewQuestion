package concepts;

/**
 * @author Bishwajit.
 * 
 * Interface Properties
 * 1. We can’t create instance of interface but we can make 
 * 	  reference of it that refers to the Object of its implementing class.
 * 2. One Interface can extends other Interface or Interfaces.
 * 3. A class that implements interface must implements all the methods in interface.
 * 4. It is used to achieve total abstraction.
 * 5. Abstract classes may contain non-final variables,
 * 	  whereas variables in interface are final, public and static.
 * 6. All the methods are public and abstract and field are final, public and static. 
 * 7. Cannot have the same method name in a interface.
 * 8. Even static or default with the same name is not valid.
 * 9. All Constant defined in an interface are implicitly public, static, and final.
 * 10. All abstract, default, and static methods in an interface are implicitly public.
 * 11. Private methods will improve code re-usability inside interfaces and 
 * 	   will provide choice to expose only our intended methods implementations to users.
 * 12. Private Methods are only accessible within the same interface.
 * 13. Private Methods cannot be accessed or inherited from some other interface or class.
 * 14. Private non-static methods cannot be used inside private static methods.
 * 15. Private method can be used only inside interface and other static and non-static interface methods.
 * 16. Private interface method cannot be abstract and no private and abstract modifiers together. 
 * 17. Default methods enable us to add new functionality to existing interfaces 
 *     without breaking older implementation of these interfaces.
 * 18. We can have an interface and a class inside a interface.
 * 19. You can implement interface inside an interface.
 * 20. Class can implements same interface inside which it is written.
 */
public class InterfaceProperties implements InterfaceFeatures1, InterfaceFeatures1.SubInterfaceFeatures1 {

	public static void main(String[] args) {
		InterfaceProperties interfaceProperties = new InterfaceProperties();

		// Calling the variables.
		System.out.println("value = " + InterfaceFeatures1.a + " > " + interfaceProperties.a);

		// Calling Implemented method.
		interfaceProperties.foo1IF1();

		// Calling Default Methods.
		interfaceProperties.foo2IF1();

		// Calling static methods.
		InterfaceFeatures1.foo3IF1();

		// Calling sub Class Variables
		InterfaceProperties.SubInterfaceFeaturesClass1 subClass1 = new InterfaceProperties.SubInterfaceFeaturesClass1();
		System.out.println("Accessing subclass variable::" + subClass1.x);

		// Calling sub Class Methods.
		subClass1.foo6IF1();
		subClass1.foo7IF1();

		// Calling sub Class Variables
		InterfaceProperties.SubInterfaceFeaturesClass2 subClass2 = new InterfaceProperties.SubInterfaceFeaturesClass2();

		// Calling Sub Class Methods
		subClass2.foo1IF1();
		subClass2.foo2IF1();
		subClass2.foo8IF1();
	}

	@Override
	public void foo1IF1() {
		System.out.println("Implmentated InterfaceFeatures1");
	}

	@Override
	public void foo8IF1() {
		System.out.println("Implemented InterfaceFeatures1.SubInterfaceFeatures1");
	}

}

interface InterfaceFeatures1 {

	// private int a; // Compile Time Error

	int a = 3;

	void foo1IF1();

	// Compile Time Error
	/* default void foo() { System.out.println("Foo"); } */

	// Compile Time Error
	/* static void foo() { System.out.println("Foo"); } */

	default void foo2IF1() {
		System.out.println("Foo2");
		System.out.println("Value  :: " + foo4IF1());
		System.out.println("Value  :: " + foo5IF1());
	}

	static void foo3IF1() {
		System.out.println("Foo3");
		System.out.println("Value  :: " + foo5IF1());
	}

	private int foo4IF1() {
		System.out.println("Foo4");
		return a;
	}

	private static int foo5IF1() {
		System.out.println("Foo5");
		return (a + 1);
	}

	class SubInterfaceFeaturesClass1 {
		int x = 10;

		public void foo6IF1() {
			System.out.println("SubInterfaceFeaturesClass1 foo6 :: " + x);
		}

		public static void foo7IF1() {
			SubInterfaceFeaturesClass1 obj = new SubInterfaceFeaturesClass1();
			System.out.println("SubInterfaceFeaturesClass1 foo7 :: " + obj.x);
		}
	}

	interface SubInterfaceFeatures1 {
		public void foo8IF1();
	}

	class SubInterfaceFeaturesClass2 implements SubInterfaceFeatures1, InterfaceFeatures1 {
		int y = 10;

		@Override
		public void foo1IF1() {
			System.out.println("inside SubInterfaceFeaturesClass2 foo1IF1");

		}

		@Override
		public void foo8IF1() {
			System.out.println("inside SubInterfaceFeaturesClass2 foo8IF1");
		}

	}
}
