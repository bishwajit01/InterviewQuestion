package interview.jpmorgan;

public class Question1 {

	public static void main(String[] args) {
		
		creatingStringsAndCheckingHashCode();
		creatingStringsViaNewObjectAndCheckingHashCode();
	}

	private static void creatingStringsAndCheckingHashCode() {
		String s1 = "ABC";
		String s2 = "ABC";

		System.out.println(s1.hashCode() + " \t " + s2.hashCode());
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

	private static void creatingStringsViaNewObjectAndCheckingHashCode() {
		String s1 = "ABCD";
		String s2 = new String("ABCD");

		System.out.println(s1.hashCode() + " \t " + s2.hashCode());
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
