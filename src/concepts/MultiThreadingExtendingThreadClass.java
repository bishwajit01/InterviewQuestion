package concepts;

/**
 * @author Bishwajit.
 *
 */
public class MultiThreadingExtendingThreadClass extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadingExtendingThreadClass thread = new MultiThreadingExtendingThreadClass();
		System.out.println("Started");
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.err.println("INSIDE CATCH");
			e.printStackTrace();
		}
		System.out.println("Completed");
	}

	public void run() {
		System.out.println("Inside run Method");
	}

}
