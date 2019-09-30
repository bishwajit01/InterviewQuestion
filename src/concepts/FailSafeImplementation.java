package concepts;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Bishwajit.
 * 
 *         Any structural modification done to the iterator affects the copied
 *         collection, not original collection.
 *
 */
public class FailSafeImplementation {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			int num = itr.next();
			System.out.print(num + " ");
			if (num == 8) {
				// This will not print, hence it has created separate copy.
				list.add(14);
			}
		}
		System.out.println();
		System.out.println(list);
	}

}
