package interview.barclays;

public class Exam {

	public static void main(String[] args) {

		Exam e1 = new Exam();
		Exam e2 = new Exam();
		Exam e3 = e1;

		System.out.println(e1 == e3); // true
		System.out.println(e1 == e2); // false
		System.out.println(e1.equals(e2)); //false
		System.out.println(e1.equals(e3)); //true

	}
}
