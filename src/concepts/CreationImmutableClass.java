/**
 * 
 */
package concepts;

/**
 * @author Bishwajit.
 *
 */
/** 
 * Make class final.
 * All methods as private.
 * No setter, Only getter for the member variables.
 * Member variable must be accessible only through constructor.
 * Initialize all the fields via a constructor performing deep copy.
 */
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
