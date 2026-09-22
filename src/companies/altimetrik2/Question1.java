package interview.altimetrik2;

public class Question1 {

	public static void main(String[] args) {
		
		StackClass sc = new StackClass();
		String str = "Bishwajit";
		
		for (char s : str.toCharArray()) {
			sc.push(s);
		}
		StringBuilder sb = new StringBuilder(); 
		while (true) {
			char ch = sc.pop();
			if (ch == ' ') {
				break;
			}
			sb.append(ch);
		}
		System.out.println(sb.toString());
	}
}


class StackClass {
	int top = -1;
	int MAXSIZE = 1000;
	char arr[] = new char[MAXSIZE];

	void push(char str) {
		if (top == MAXSIZE) {
			System.out.println("STACK IS FULL");
			return;
		}
		arr[++top] = str;
	}

	char pop() {
		if (top == -1) {
			System.out.println("STACK IS EMPTY");
			return ' ';
		}
		return arr[top--];
	}

}