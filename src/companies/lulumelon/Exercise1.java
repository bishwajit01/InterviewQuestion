package interview.lulumelon;

import java.util.stream.Stream;

public class Exercise1 {
	
	public static void main(String[] args) {
		System.out.println("----");
		Stream.of(1 ,2, 3).peek(i -> System.out.println("x"));
		System.out.println("----");
	}

}
