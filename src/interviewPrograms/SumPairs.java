package interviewPrograms;

import java.util.Arrays;

/**
 * @author Bishwajit.
 *
 */
public class SumPairs {

	public static void main(String[] args) {
		int ar[] = { 1, 5, 7, -1, 5 };
		int sum = 6;
		
		// Displaying the original Array.
		System.out.print("Array :: ");
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("\nSum ::  " + sum);

		// Complexities = O(N^2).
		getPairsSum(ar, sum);

		// Complexities = O(N).
		getPairsSumInNTime(ar, sum);

		Arrays.sort(ar);
	}

	private static void getPairsSum(int[] ar, int sum) {
		System.out.print("Pairs = ");
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if ((ar[i] + ar[j]) == sum) {
					System.out.print("[" + ar[i] + ", " + ar[j] + "] ");
				}
			}
		}
		System.out.println();
	}

	private static void getPairsSumInNTime(int[] ar, int sum) {

	}

}
