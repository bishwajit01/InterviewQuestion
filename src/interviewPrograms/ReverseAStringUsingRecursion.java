package interviewPrograms;

/**
 * @author Bishwajit.
 *
 */
public class ReverseAStringUsingRecursion {

	public static void main(String[] args) {
		String s = "Reverse";
		System.out.println("Original String :: " + s);

		// Reverse String Using Recursion
		System.out.print("Reverse of String: ");
		reverseString(s);
	}

	private static void reverseString(String string) {
		if (null == string || string.length() <= 1) {
			System.out.println(string);
		} else {
			System.out.print(string.charAt(string.length() - 1));
			reverseString(string.substring(0, string.length() - 1));
		}
	}

}
