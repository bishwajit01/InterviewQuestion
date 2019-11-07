package concepts;

/**
 * @author Bishwajit.
 *
 */
public class MultipleReturnStatement {

	public static void main(String[] args) {
		// 3 will be returned, whether Exception is there or not.		
		System.out.println("Returned value :: " + returningInt());
	}

	public static int returningInt() {
		try  {
			return 1/0;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}

	}

}
