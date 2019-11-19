package concepts;

/**
 * @author Bishwajit.
 *
 */
public class DeadlockUsingTwoThread {
	static String first = "Vikram";
	static String second = "Bishwajit";

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			synchronized (first) {
				System.out.println("Has Locked Thread 1");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.err.println("ERROR");
				}
				System.out.println("Thread 1: Waiting for ObjectLock 2");
				synchronized (second) {
					System.out.println("Thread 1 -> No DeadLock");
				}
			}
		});
		Thread t2 = new Thread(() -> {
			synchronized (second) {
				System.out.println("Has Locked Thread 2");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.err.println("ERROR");
				}
				System.out.println("Thread 2: Waiting for ObjectLock 2");
				synchronized (first) {
					System.out.println("Thread 2 -> No Deadlock");
				}
			}
		});
		t1.start();
		t2.start();
	}

}
