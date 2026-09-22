package interview.elililly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		System.out.println(duplicateSum(Arrays.asList(new Integer[] { 1, 2, 5, 6, 8, 1, 5, 1 })));
		System.out.println(duplicateSum(Arrays.asList(new Integer[] { 2, 4, 2, 3, 4, 4 })));
	}

	public static List<Integer> duplicateSum(List<Integer> originalList) {
		Set<Integer> set = new HashSet<Integer>(originalList);
		List<Integer> list = new ArrayList<>();

		set.stream().forEach(v -> {
			int frequency = Collections.frequency(originalList, v);
			if (frequency > 1) {
				list.add(v * frequency);
			}
		});
		
		return list;
	}

}
