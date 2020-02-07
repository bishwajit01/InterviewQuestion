/**
 * 
 */
package interviewPrograms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bishwajit.
 *
 */
public class LastValueInMapWithSameKey {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		Object first = map.put("Vikram", "Bishwajit");
		Object second = map.put("Vikram", "java");
		Object third = map.put("Vikram", "Computer");

		System.out.println(">>" + first);
		System.out.println(">>" + second);
		System.out.println(">>" + third);
	}

}
