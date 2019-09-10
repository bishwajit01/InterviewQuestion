/**
 * 
 */
package interviewPrograms;

/**
 * 
 * @author Bishwajit.
 *
 */
interface Diamond1 {
	default void show() {
		System.out.println("Diamond1");
	}
}

/**
 * 
 * @author Bishwajit.
 *
 */
interface Diamond2 {
	default void show() {
		System.out.println("Diamond2");
	}
}

/**
 * @author Bishwajit
 *
 */
public class HandlingDimondProblem implements Diamond1, Diamond2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HandlingDimondProblem().show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Diamond1.super.show();
		Diamond2.super.show();
	}

}
