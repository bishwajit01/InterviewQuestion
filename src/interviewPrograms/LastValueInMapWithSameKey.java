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
		String first = map.put("Vikram", "Bishwajit");
		String second = map.put("Vikram", "java");
		String third = map.put("Vikram", "Computer");

		System.out.println("First Time  :: " + first);
		System.out.println("Second Time :: " + second);
		System.out.println("Third Time  :: " + third);
	}

}
