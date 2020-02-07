package concepts;

/**
 * 
 * @author Bishwajit.
 *
 */
public class OverridingConcept1 {
	public static void main(String[] args) {
		Parent1 p = new Child1();
		p.eat();
		p.show();
		// p.sing();//Compile-Time Error, since it is not available in Parent Class

		// Up-Casting
		Parent1 pp = new Child1();
		Child1 c = (Child1) pp;
		c.eat();

	}
}

class Parent1 {
	void show() {
		System.out.println("Parent.Show");
	}

	void eat() {
		System.out.println("Parent.Eat");
	}

}

class Child1 extends Parent1 {
	void show() {
		System.out.println("Child.Show");
	}

	void sing() {
		System.out.println("Child.Sing");
	}
}