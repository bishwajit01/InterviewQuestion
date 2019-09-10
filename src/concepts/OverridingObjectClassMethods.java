/**
 * 
 */
package concepts;

/**
 * @author Bishwajit.
 *
 */
public class OverridingObjectClassMethods {
	private String name;
	private int age = 27;

	public OverridingObjectClassMethods() {
		age += 10;
	}

	/**
	 * 
	 * @param name String.
	 */
	public OverridingObjectClassMethods(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Overriding :: toString");
		OverridingObjectClassMethods obj1 = new OverridingObjectClassMethods("Vikram");
		System.out.println(obj1);

		System.out.println("\nOverriding :: hashcode");
		OverridingObjectClassMethods obj2 = new OverridingObjectClassMethods();
		System.out.println(obj2);

		System.out.println("\nOverriding :: eqauls");
		
		
		System.out.println("\nOverriding :: getClass");
		OverridingObjectClassMethods obj4 = new OverridingObjectClassMethods();
		Class c = obj4.getClass();
		System.out.println(c.getName() + " -> " + c.getSimpleName());

		// finalize method call
		System.out.println("\nOverriding :: finalize");
		obj2 = null;
		System.gc();
		System.out.println("End");
	}

	@Override
	public String toString() {
		return "my  name is: " + name + " " + age;
	}

	@Override
	public int hashCode() {
		return age;
	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
}
