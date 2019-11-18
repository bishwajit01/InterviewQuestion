package concepts;

/**
 * @author Bishwajit.
 *
 */
public class ThreadingConcept {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> System.out.println("Thread 1"));
		t1.run(); // Normal Object.
		t1.start(); // Thread object, We should use Thread.start().

		Runnable runnable1 = () -> System.out.println("Runnable Interface");
		Thread t2 = new Thread(runnable1);
		t2.start();

		// Calling a method inside a Lambda
		Runnable runnable2 = () -> {
			display();
		};
		Thread t3 = new Thread(runnable2);
		Thread t4 = new Thread(() -> display());
		Thread t5 = new Thread(() -> display());
		t3.start();
		t3.join(); // Join
		t4.start();
		t5.start();

		Thread t6 = new Thread(() -> display());
		System.out.println("Thread Id ::" + t6.getId());
		System.out.println("Thread Name :: " + t6.getName());
		System.out.println("Thread Priority :: " + t6.getPriority());
		t6.setName("Vikram");
		System.out.println("Thread Name after resetting the name :: " + t6.getName());
		t6.start();

		Thread t7 = new Thread(() -> System.out.println("Thread Name ->" + Thread.currentThread().getName()));
		t7.start();

		Thread t8 = new Thread(() -> display());
		Thread t9 = new Thread(() -> display());
		t8.setDaemon(true);
		t8.start();
		t9.start();

		Runtime r = Runtime.getRuntime();
		System.out.println("Processor Available :: " + r.availableProcessors());
		System.out.println("Free Memory :: " + r.freeMemory());
		System.out.println("Max Memory :: " + r.maxMemory());
		System.out.println("Total Memory :: " + r.totalMemory());
		// System.out.println("Version :: " + r.version());

	}

	public static void display() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Deamon Thread :: " + Thread.currentThread().getName());
		} else {
			for (int i = 1; i <= 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.err.println("Error");
				}
				System.out.print(i + " ");
			}
		}
	}

}
