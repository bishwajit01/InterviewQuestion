package interview.sap;

import java.util.Arrays;

import interview.algorithms.QuickSortAlgorithm;

/**
 * 
 * @author bishwajit.vikram
 *
 *
 *         Input: nums = [-4, -1, 0, 3, 10] Output: [0, 1, 9, 16, 100]
 * 
 *         The output should be sorted and square of each element.
 */
public class Question2 {

	public static void main(String[] args) {
		System.out.println(new Question3().getClass().getSimpleName());
		
		int[] arr = new int[] { -4, -1, 0, 3, 10 };

		for (int i = 0; i < arr.length; i++) {
			arr[i] *= arr[i];
		}

		/*
		 * bubbleSortedArray(arr); display(arr);
		 */

		/*
		 * sortUsingInternalJavaLibrary(arr); display(arr);
		 */

		// Using QuickSort
		new QuickSortAlgorithm().sortArray(arr);
		display(arr);
	}

	private static void sortUsingInternalJavaLibrary(int arr[]) {
		// square of each array element.
		int arrLength = arr.length;
		for (int i = 0; i < arrLength; i++) {
			arr[i] *= arr[i];
		}
		Arrays.sort(arr);
	}

	private static void bubbleSortedArray(int[] arr) {
		// square of each array element.
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= arr[i];
		}

		// sorting array
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	private static void display(int[] arr) {
		Arrays.stream(arr).forEach(System.out::println);
	}
}
