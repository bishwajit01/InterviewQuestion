package concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author Bishwajit.
 * 
 *         Fail Fast :: Gives Concurrent Modification Exception.
 *
 */
public class FailFastImplementation {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(5);

		doingFailFastWithoutException(list);
	}

	private static void doingFailFastWithoutException(List<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			int value = itr.next();
			if (value == 3) {
				itr.remove();
			}
		}
		System.out.println(list);

		itr = list.iterator();
		while (itr.hasNext()) {
			int val = itr.next(); 
			if (val == 2) {
				list.add(20);
			}
		}
		System.out.println(list);
	}
}
