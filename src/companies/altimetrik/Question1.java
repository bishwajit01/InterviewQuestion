package interview.altimetrik;

import java.util.stream.Stream;

public class Question1 {

	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).skip(5).forEach(v -> System.out.println(v));
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).skip(5).forEach(System.out::println);
	}

}
