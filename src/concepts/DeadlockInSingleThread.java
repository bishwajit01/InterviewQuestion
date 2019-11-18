package concepts;

/**
 * @author Bishwajit.
 *
 */
public class DeadlockInSingleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("DeadLock Started :: ");
			System.out.println("Thread Id :: " + Thread.currentThread().getId());
			System.out.println("Thread Name :: " + Thread.currentThread().getName());
			Thread.currentThread().join();
			System.out.println("This Statement wont execute");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
