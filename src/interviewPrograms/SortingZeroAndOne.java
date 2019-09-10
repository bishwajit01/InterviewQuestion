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
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
