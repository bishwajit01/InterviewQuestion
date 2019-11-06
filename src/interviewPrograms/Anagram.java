package interviewPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Bishwajit.
 *
 */
public class Anagram {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter the 1st String ::");
		String s1 = br.readLine();
		System.out.print("\nEnter the 2nd String ::");
		String s2 = br.readLine();
		boolean anagram = isAnagram(s1, s2);
		System.out.println("Anagram :: " + anagram);
	}

	private static boolean isAnagram(String s1, String s2) {
		List<String> listString1 = Arrays.asList(s1.toLowerCase().replaceAll("\\s", "").split(""));
		Collections.sort(listString1);
		List<String> listString2 = Arrays.asList(s2.toLowerCase().replaceAll("\\s", "").split(""));
		Collections.sort(listString2);
		return listString1.equals(listString2) ? true : false;
	}

}
