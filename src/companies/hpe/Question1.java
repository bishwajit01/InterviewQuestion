package interview.hpe;

public class Question1 {
	
	public static void main(String[] args) {
		
		pattern1();
		pattern2();
		
	}
	
	private static void pattern2() {
		String s = "MALAYALAM";
		StringBuilder str = new StringBuilder(s);
		
		if (str.reverse().toString().equals(s))
			System.out.println("PALLINDROME");
		else
			System.out.println("NOT A PALLINDROME");
	}

	private static void pattern1() {
		String str = "MALAYALAM";
		StringBuilder rev = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			rev.append(str.charAt(i));
		}

		if (rev.toString().equals(str))
			System.out.println("PALLINDROME");
		else
			System.out.println("NOT A PALLINDROME");
	}
}
