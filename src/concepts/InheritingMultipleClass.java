package concepts;

/**
 * @author Bishwajit.
 *
 */
public class InheritingMultipleClass {

	public static void main(String[] args) {
		ID d = new ID();
		d.a(); // DA
		d.d(); // D
	}

}

class IA {
	public void a() {
		System.out.println("A");
	}
}

class IB extends IA {
	public void b() {
		System.out.println("B");
	}

	public void a() {
		System.out.println("BA");
	}
}

class IC extends IB {
	public void c() {
		System.out.println("C");
	}

	public void a() {
		System.out.println("CA");
	}
}

class ID extends IC {
	public void d() {
		System.out.println("D");
	}

	public void a() {
		System.out.println("DA");
	}
}