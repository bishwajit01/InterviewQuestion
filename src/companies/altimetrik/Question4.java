package interview.altimetrik;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question4 {

	public static String[] string = { "Believe", "for", "good", "Believe", "for", "trust", "Believe", "forsake",
			"Believe", "Believe", "in", "you", "youtube", "Google", "for", "learning", "virtual", "data" };

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		for (String str : string) {
			if (null != map.get(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}

		System.out.print("Original  :: ");
		System.out.println(map);
		sortMapBasedOnValuesInAscendingOrder(map);
		sortMapBasedOnValuesInDecendingOrder(map);
	}

	public static void sortMapBasedOnValuesInAscendingOrder(Map<String, Integer> m) {
		Map<String, Integer> tempMap = new LinkedHashMap<String, Integer>();
		m.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEachOrdered(x -> tempMap.put(x.getKey(), x.getValue()));
		System.out.print("Sorting Based on Values in Ascending Order  :: ");
		System.out.println(tempMap);
	}

	public static void sortMapBasedOnValuesInDecendingOrder(Map<String, Integer> m) {
		Map<String, Integer> tempMap = new LinkedHashMap<String, Integer>();
		m.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> tempMap.put(x.getKey(), x.getValue()));
		System.out.print("Sorting Based on Values in Decending Order  :: ");
		System.out.println(tempMap);
	}

}
