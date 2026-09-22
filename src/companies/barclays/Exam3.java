package interview.barclays;


public class Exam3 {
	

	static int[] specialNumbers = {4, 5, 44, 45};
	
	public static void main(String[] args) {
		int min = minSpecialNumbers(2);
		System.out.println(min);
		System.out.println(Integer.MAX_VALUE == 2147483647);
	}
	
	public static int minSpecialNumbers(int n) {
		int[] dp = new int[n + 1];
		for (int i = 1; i <= n; i++) dp[i] = Integer.MAX_VALUE;
		dp[0] = 0;
		for (int i = 1; i <= n; i++) {
			for (int num : specialNumbers) {
				if (i - num >= 0 && dp[i - num] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[i - num] + 1);
				}
			}
		}
		return dp[n];
	}

}
