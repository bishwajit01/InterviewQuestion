package interview.altimetrik;

import java.util.HashMap;
import java.util.Map;

public class Question3 {

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
		
		System.out.println(map);
	}

}
