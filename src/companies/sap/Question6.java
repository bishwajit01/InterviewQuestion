package interview.sap;

/**
 * 
 * @author bishwajit.vikram
 *
 *         Given a String find the first non-repeating character. 
 *         Input: ABCDBAGHC
 *
 *         Output: D
 */
public class Question6 {

	public static void main(String[] args) {

		String str = "ABCDBAGHC";
		System.out.println("First Non Repeating character: " + findFirstNonRepeatingCharacter(str));
	}

	public static char findFirstNonRepeatingCharacter(String str) {

		for (int i = 0; i < str.length(); i++) {
			boolean found = false;

			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					found = true;
					break;
				}
			}
			if (!found) {
				return str.charAt(i);
			}
		}

		return '$';
	}
}
