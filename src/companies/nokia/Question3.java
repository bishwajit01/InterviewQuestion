package interview.nokia;

public class Question3 {

	public static void main(String[] args) {
		int returnedValue = new Calculate() {

			@Override
			int multiply(int a, int b) {
				return a * b;
			}
		}.multiply(12, 3);

		System.out.println(returnedValue);
	}
}

abstract class Calculate {
	abstract int multiply(int a, int b);
}