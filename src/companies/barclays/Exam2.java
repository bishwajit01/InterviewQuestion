package interview.barclays;

public class Exam2 {
	
	public static void main(String[] args) {
		Exam2 e1 = new Exam2();
		e1 .code("Object ");
		e1.write(555);
		
		
		
		System.out.println("abc".equals("ABC"));
		
	}
	
	public void code(String s) {
		System.out.println("A");
	}

	public void write(Object s) {
		System.out.println("Language");
	}
	
}
