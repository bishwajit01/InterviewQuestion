package interview.stackoverflow;

public class EncodeString {

	public static void main(String[] args) {
		maf("aaBbbbccc");
	}

	private static void maf(String str) {
		// TODO Auto-generated method stub
		str = str.toLowerCase();
		int count = 1;
		String code = "";

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				code = code + count + str.charAt(i);
				count = 1;
			}
			System.out.println(str.charAt(i) + " ---> " + code);
		}
		System.out.println("\n\n\n\n\n\n" + code);
	}
}
