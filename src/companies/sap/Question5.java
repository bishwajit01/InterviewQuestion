package interview.sap;

/**
 * 
 * @author bishwajit.vikram
 *
 *         Given an Integer array
 *         Input: {-2, 1, -3, 4, -1, 2, 1, -5, 4}
 * 
 *         Find a continuous sub array within it has the largest sum
 *         Output: {4, -1, 2, 1}
 */

public class Question5 {
	
	public static void main(String[] args) {
		int[] num = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		
		System.out.println("Max Sum: " + maxSum(num));
	}
	
	public static int maxSum(int[] num) {

		int res = num[0];
		int maxEnding = num[0];

		for (int i = 0; i < num.length; i++) {
			maxEnding = Math.max(maxEnding + num[i], num[i]);
			res = Math.max(res, maxEnding);
		}

		return res;
	}

}
