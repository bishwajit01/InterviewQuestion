package interviewPrograms;

/**
 * 
 * @author Bishwajit.
 *
 */
public class CustomException {
	static int a;

	public static void main(String[] args) {
		try {
			divide();
		} catch (MyCustomException e) {
			System.out.println("My exception :" + e);
		}
	}

	public static void divide() throws MyCustomException {
		try {
			a = 20 / 0;
		} catch (Exception e) {
			throw new MyCustomException(e.toString());
		} catch (Throwable e) {
			throw new MyCustomException(e.toString());
		}
	}
}

class MyCustomException extends Exception {

	private static final long serialVersionUID = 1L;

	public MyCustomException(String s) {
		super(s);
	}
}
