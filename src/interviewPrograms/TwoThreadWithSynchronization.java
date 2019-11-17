package interviewPrograms;

/**
 * @author Bishwajit.
 *
 */
public class TwoThreadWithSynchronization {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> count());
		Thread t2 = new Thread(() -> count());
		t1.start();
		t2.start();
	}

	public static void count() {

		// Synchronized (TwoThreadWithSynchronization.class) {
		for (int i = 1; i <= 200; i++) {
			System.out.print(i + " ");
		}
		// }
	}
}
