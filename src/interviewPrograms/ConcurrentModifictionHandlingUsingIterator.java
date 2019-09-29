package interviewPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Bishwajit.
 *
 */
public class ConcurrentModifictionHandlingUsingIterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		// USING ITERATOR
		usingIterator(list);

		// USING FOR LOOP
		usingFor(list);
	}

	private static void usingFor(List<Integer> list) {
		System.out.print("USING FOR LOOP :: ");
		for (int i : list) {
			System.out.print(i + " ");
			// Concurrent Modification Exception Encountered
			list.add(0);
		}

		System.out.println();

	}

	private static void usingIterator(List<Integer> list) {
		System.out.print("USING ITERATOR :: ");
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			int value = itr.next();
			// Concurrent Modification Exception Escaped
			if (value == 3) {
				itr.remove();
			} else {
				System.out.print(value + " ");
			}
		}
		System.out.println();
	}

}
