package concepts;

/**
 * @author Bishwajit.
 *
 */
public class ThisAndSuperTogether {
	
	public ThisAndSuperTogether() {
		super();
		// This and super cannot be called together.
//		this();	// Compile Time Error.
	}
}
