package interview.sap;

import java.util.Arrays;
import java.util.List;


/**
 * Dynamic Programming number of stairs and ways
 * 
 * @author bishwajit.vikram
 *
 */
public class Question3 {

	public static void main(String[] args) {
		System.out.println((new Question3().getClass().getSimpleName()));

		int numberOfSteps = 4;
		List<Integer> maxNumberOfStepsToSkip = Arrays.asList(1, 2, 3);

		int numberOfWays = numberOfSteps(numberOfSteps, maxNumberOfStepsToSkip);
		System.out.println("Number of ways: " + numberOfWays);
	}

	private static int numberOfSteps(int n, List<Integer> m) {

		int[] dp = new int[n + 1];
		dp[0] = 1;

		for (int i = 0; i <= n; i++) {
			for (int step : m) {
				if (i - step >= 0) {
					dp[i] += dp[i - step];
				}
			}

		}

		return dp[n];
	}

}
