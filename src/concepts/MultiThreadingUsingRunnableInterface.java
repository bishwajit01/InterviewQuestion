package concepts;

/**
 * @author Bishwajit.
 *
 */
public class MultiThreadingUsingRunnableInterface implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new MultiThreadingUsingRunnableInterface());
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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Run Method");
	}

}
