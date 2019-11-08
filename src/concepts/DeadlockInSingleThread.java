package concepts;

/**
 * @author Bishwajit.
 *
 */
public class DeadlockInSingleThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("DeadLock Started :: ");
			Thread.currentThread().join();
			System.out.println("This Statement wont execute");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
