package interviewPrograms;

/**
 * @author Bishwajit.
 *
 */
public class SortingZeroOneTwo {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 2, 2, 2, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0 };
		System.out.println("LENGTH of array:: " + arr.length);

		// Displaying original data.
		System.out.print("Original Data :: ");
		display(arr);

		// Displaying Sorted data.
		sortingOfZeroOneTwo(arr);

	}

	private static void sortingOfZeroOneTwo(int[] ar) {
		int length = ar.length;
		int left = 0, right = length - 1;
		int arr[] = new int[length];
		for (int i : ar) {
			if (i == 0) {
				arr[left++] = i;
			}
			if (i == 2) {
				arr[right--] = i;
			}
		}
		for (int i : ar) {
			if (i == 1) {
				arr[left++] = i;
			}
		}
		System.out.print("Sorted Data   :: ");
		display(arr);
	}

	private static void display(int[] arr) {
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
