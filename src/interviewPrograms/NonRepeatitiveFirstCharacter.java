package interviewPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Bishwajit.
 *
 */
public class NonRepeatitiveFirstCharacter {
	public static void main(String[] args) {
		String string = "abcdabcde";
		List<String> list = Arrays.asList(string.split(""));
		for (String s : list) {
			if (Collections.frequency(list, s) == 1) {
				System.out.println(s);
				break;
			}
		}
	}
}
