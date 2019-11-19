package concepts;

import java.util.Optional;

/**
 * @author Bishwajit.
 *
 */
public class OptionalDemo {

	public static void main(String[] args) {
		String[] str = new String[10];

		// System.out.println(str[6].toLowerCase()); // Gives Null Pointer.

		Optional<String> optional = Optional.ofNullable(str[5]);
		if (optional.isPresent()) {
			System.out.println(str[6].toLowerCase());
		} else {
			System.out.println("The value is null.");
		}
	}

}
