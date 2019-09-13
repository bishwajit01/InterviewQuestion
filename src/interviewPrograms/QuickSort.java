package interviewPrograms;

/**
 * @author Bishwajit.
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 2, 30, 4, 50 };
		System.out.print("Unsorted Array::\t");
		display(arr);
		sort(arr, 0, arr.length - 1);
		System.out.print("Sorted  Array ::\t");
		display(arr);
	}

	static void sort(int ar[], int low, int high) {
		if (low < high) {
			//calling partition method
			int p = partition(ar, low, high);
			sort(ar, low, p - 1);
			sort(ar, p + 1, high);
		}
	}

	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	static void display(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

}
