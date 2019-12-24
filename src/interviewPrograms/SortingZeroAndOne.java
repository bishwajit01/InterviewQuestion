package interviewPrograms;

/**
 * Sorting 0 and 1 Efficiently.
 * 
 * @author Bishwajit.
 *
 */
public class SortingZeroAndOne {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0 };
		System.out.println("LENGTH of array:: " + arr.length);

		// Using Counting Sorting.
		sortingUsingCounting(arr);
		// Sorting Using Placing
		sortingUsingPlacing(arr);
	}

	// Sorting using Counting.
	private static void sortingUsingCounting(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count += 1;
			}
		}
		System.out.println("Number of Zero:: " + count);
		System.out.println("Number of One:: " + (arr.length - count));
		for (int i = 0; i < arr.length; i++, count--) {
			if (count >= 0) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}
		display(arr);
	}

	// Sorting Using Placing.
	private static void sortingUsingPlacing(int[] arr) {
		int length = arr.length;
		int ar[] = new int[length];
		int left = 0, right = length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				ar[left++] = 0;
			} else {
				ar[right--] = 1;
			}
		}
		display(ar);
	}

	// Displaying the array.
	static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
