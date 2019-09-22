/**
 * 
 */
package concepts;

/**
 * @author Bishwajit.
 *
 */
public class DeepCopyImplementation {

	public static void main(String[] args) {

		int values[] = { 3, 4, 5 };
		DeepCopy obj = new DeepCopy(values);
		obj.show();
		
		// Modifying Values.
		values[0] = 21;
		obj.show();
	}

}

class DeepCopy {
	int[] data;

	public DeepCopy(int[] ar) {
		data = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			this.data[i] = ar[i];
		}
	}

	public void show() {
		for (int i : data) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
