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

		str[2] = "Geeks Classes are coming soon";

		// It returns an empty instance of Optional class
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		// System.out.println(empty.get());// Exception:: No Such Element Present

		// It returns a non-empty Optional
		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);
		System.out.println(value.get());
	}

}
