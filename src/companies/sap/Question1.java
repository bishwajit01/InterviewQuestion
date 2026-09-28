package interview.sap;

/**
 * Leetcode 123. Best Time to Buy and Sell Stock.
 * 
 * @author bishwajit.vikram
 *
 */
public class Question1 {

	public static void main(String[] args) {
		System.out.println(new Question3().getClass().getSimpleName());

		int[] prices1 = { 3, 3, 5, 0, 0, 3, 1, 4 };
		int[] prices2 = { 1, 2, 3, 4, 5 };
		int[] prices3 = { 7, 6, 4, 3, 1 };

		System.out.println("Total Profit = " + computeTradeBestApproach(prices1));
		System.out.println("Total Profit = " + computeTradeBestApproach(prices2));
		System.out.println("Total Profit = " + computeTradeApproach2(prices3));

	}

	// Best approach
	private static int computeTradeBestApproach(int[] prices) {

		if (prices == null || prices.length == 0)
			return 0;

		int buy1 = Integer.MAX_VALUE, buy2 = Integer.MAX_VALUE;
		int sell1 = 0, sell2 = 0;

		for (int price : prices) {
			buy1 = Math.min(buy1, price); // lowest price for first buy
			sell1 = Math.max(sell1, price - buy1); // max profit after first sell
			buy2 = Math.min(buy2, price - sell1); // lowest effective price for second buy
			sell2 = Math.max(sell2, price - buy2); // max profit after second sell
		}
		return sell2;
	}

	// Another Approach
	public static int computeTradeApproach2(int[] prices) {
		if (prices == null || prices.length == 0)
			return 0;
		int n = prices.length;
		int[] left = new int[n]; // max profit if only one transaction in [0..i]
		int[] right = new int[n]; // max profit if only one transaction in [i..n-1]

		int minPrice = prices[0];
		for (int i = 1; i < n; i++) {
			minPrice = Math.min(minPrice, prices[i]);
			left[i] = Math.max(left[i - 1], prices[i] - minPrice);
		}

		int maxPrice = prices[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			maxPrice = Math.max(maxPrice, prices[i]);
			right[i] = Math.max(right[i + 1], maxPrice - prices[i]);
		}

		int maxProfit = 0;
		for (int i = 0; i < n; i++) {
			maxProfit = Math.max(maxProfit, left[i] + right[i]);
		}
		return maxProfit;
	}
}
