/**
 * 
 */
package interviewPrograms;

/**
 * @author Bishwajit.
 *
 */
public class TernaryOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 13;
		int c = 7;
		int result = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
		System.out.println(result);
	}

}
