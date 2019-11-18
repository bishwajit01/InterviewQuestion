package interviewPrograms;

/**
 * @author Bishwajit.
 *
 */
public class EvenAndOddNumberMultiThreading {

	public static void main(String[] args) {

		// By using two Different Class
		byUsingTwoDifferentClass();

		// Using Lambda
		byUsingLambdaExpression();
	}

	private static void byUsingLambdaExpression() {
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			}
		});
		t1.start();
		t2.start();
	}

	private static void byUsingTwoDifferentClass() {
		Odd odd = new Odd();
		odd.start();
		Even even = new Even();
		even.start();
	}

}

class Odd extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}

class Even extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}