package interview.nokia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		
		List<String> fixedList = Arrays.asList("Apple", "Banana", "Carrot", "Grape");
		List<String> listFruit = new ArrayList<>(fixedList);
		
		for (String fruit : listFruit) {
			if (fruit.contains("e")) {
				listFruit.remove(fruit);
			}
		}
	}

}
