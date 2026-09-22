package interview.altimetrik;

import java.util.stream.Stream;

public class Question2 {

	public static String[] string = { "Believe", "for", "good", "Believe", "for", "trust", "Believe", "forsake",
			"Believe", "Believe", "in", "you", "youtube", "Google", "for", "learning", "virtual", "data" };

	public static void main(String[] args) {

		Stream.of(string).distinct().forEach(v -> System.out.println(v));
	}
}
