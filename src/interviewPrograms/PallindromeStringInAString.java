package interviewPrograms;

/**
 * @author Bishwajit.
 *
 */
public class PallindromeStringInAString {

	public static void main(String[] args) {
		String inputString = "Hello";
		System.out.println("INPUT STRING :: " + inputString);

		printAllPallindrome(inputString);
	}

	private static void printAllPallindrome(String str) {
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (checkPallindrome(str.substring(i, j + 1))) {
					System.out.print(str.substring(i, j + 1) + " ");
				}
			}
		}
	}

	private static boolean checkPallindrome(String str) {

		for (int i = 0; i <= str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
