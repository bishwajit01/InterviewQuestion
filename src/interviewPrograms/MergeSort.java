/**
 * 
 */
package interviewPrograms;

/**
 * @author Bishwajit.
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 10, 2, 30, 4, 50 };
		System.out.print("Unsorted  >> ");
		display(arr);
		// sorting
		sort(arr, 0, arr.length - 1);
		System.out.print("sorted  >> ");
		display(arr);
	}

	static void sort(int arr[], int l, int r) {
		if (l < r) {
			// middle element
			int m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	static void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		// creating temporary array
		int[] left = new int[n1];
		int[] right = new int[n2];

		// adding element in temporary array
		for (int i = 0; i < n1; ++i) {
			left[i] = arr[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			right[j] = arr[m + 1 + j];
		}

		// Inital index of first array, second array and merged array.
		int i = 0, j = 0, k = l;

		// merging temp array
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		// copying remaining elements.
		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

	// displaying the array.
	static void display(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

}
