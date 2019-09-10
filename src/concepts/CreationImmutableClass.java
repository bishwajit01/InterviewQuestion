/**
 * 
 */
package concepts;

/**
 * @author Bishwajit.
 *
 */
// Make class final.
// all methods as private.
// no setter getter for the member variables.
// member variable must be accessible only through constructor.

public final class CreationImmutableClass {
	private int number;
	private byte[] name;

	public CreationImmutableClass() {
		// TODO Auto-generated constructor stub
	}

	public CreationImmutableClass(int number) {
		this.number = number;
	}

	public CreationImmutableClass(byte[] name) {
		this.name = name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
