package interviewPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bishwajit.
 *
 */
public class ReverseEachWordInString {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter any Sentence:");
		String s = null;
		String ar[];
		String reverseSentence = "";
		String reverse =  "";
		try {
			s = br.readLine();
			ar = s.split(" ");
			for (int i = 0; i < ar.length; i++) {
				reverse = reverseWord(ar[i]);
				reverseSentence +=  reverse + " ";
			}
		} catch (IOException e) {
			System.out.println("Exception Occured" + e.toString());
		}
		System.out.println("Original Sentence :: " + s);
		System.out.println("Reverse each word in Sentence :: " + reverseSentence.trim());
	}

	private static String reverseWord(String string) {
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse += string.charAt(i);
		}
		return reverse;
	}

}
