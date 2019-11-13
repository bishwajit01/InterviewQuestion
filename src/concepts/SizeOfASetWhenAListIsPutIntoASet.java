package concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Bishwajit.
 *
 */
public class SizeOfASetWhenAListIsPutIntoASet {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("H");
		list.add("E");
		list.add("L");
		list.add("L");
		list.add("O");
		list.add("a");
		
		System.out.println("Elements of a list :: " + list);
		System.out.println("Size of List :: " + list.size()); // size -> 5
		
		// Casting a list to a Set.
		Set<String> set = new HashSet<String>(list);
		
		System.out.println("Elements of a set :: " + set); // Value will be in Ascending Ordered.
		System.out.println("Size of set :: " + set.size()); // size -> 4
	}

}
