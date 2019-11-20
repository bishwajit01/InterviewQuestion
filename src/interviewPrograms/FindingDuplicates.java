package interviewPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Bishwajit.
 *
 */
public class FindingDuplicates {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 6, 7, 3, 5, 7, 8, 3, 2, 4, 6, 1 };

		// JAVA 8
		duplicateWithJava8(arr);

		int size = arr.length;
		System.out.println();
		duplicateWithN(arr, size);

	}

	// Duplicates in O(n) time
	public static void duplicateWithN(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			if (arr[Math.abs(arr[i])] >= 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				System.out.println(Math.abs(arr[i]) + " ");
			}
		}
	}

	// Duplicates in O(1) time
	public static void duplicateWith1(int arr[], int size) {

	}

	// Finding Duplicate using Streams
	public static void duplicateWithJava8(int ar[]) {
		List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
		System.out.print("Repeated Number::");
		list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet())
				.forEach(System.out::print);
	}
}
