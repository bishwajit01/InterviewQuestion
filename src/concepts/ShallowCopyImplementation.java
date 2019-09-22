/**
 * 
 */
package concepts;

/**
 * @author Bishwajit.
 *
 */
public class ShallowCopyImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int values[] = { 3, 4, 5 };
		ShallowCopy obj = new ShallowCopy(values);
		obj.show();

		// Modifying values.
		values[0] = 12;
		obj.show();
	}

}

class ShallowCopy {
	private int[] data;

	public ShallowCopy(int[] ar) {
		// TODO Auto-generated constructor stub
		this.data = ar;
	}

	public void show() {
		for (int i : data) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
