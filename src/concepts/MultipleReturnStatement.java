package concepts;

/**
 * @author Bishwajit.
 *
 */
public class MultipleReturnStatement {

	public static void main(String[] args) {

		// 3 will be returned, whether Exception is there or not.
		System.out.println("Returned value when Exception :: " + returnStatement1());
		System.out.println("Returned value when no Exception :: " + returnStatement2());
		
		// it wont execute
		System.out.println("Returned value when you dont want finally to execute :: " + returnStatement3());
	}

	public static int returnStatement1() {
		try {
			System.out.println("Try");
			return 1 / 0;
		} catch (Exception e) {
			System.out.println("Catch");
			return 2;
		} finally {
			System.out.println("Finally");
			return 3;
		}
	}

	public static int returnStatement2() {
		try {
			System.out.println("Try");
			return 1;
		} catch (Exception e) {
			System.out.println("Catch");
			return 2;
		} finally {
			System.out.println("Finally");
			return 3;
		}
	}

	public static int returnStatement3() {
		try {
			System.out.println("Try");
			System.exit(0);
			return 1;
		} catch (Exception e) {
			System.out.println("Catch");
			return 2;
		} finally {
			System.out.println("Finally");
			return 3;
		}

	}

}
