package interview.sap;

import java.util.List;
import java.util.Random;
import java.util.Stack;

/**
 * Balanced Expression
 * Balanced
 * {[{}{}]}[()]
 * {{}{}}
 * []{}()
 * 
 * 
 * Unbalanced
 * {()}[)
 * {(})
 * 
 * 
 * @author bishwajit.vikram
 *
 */
public class Question4 {

	public static final String STR_1 = "{[{}{}]}[()]";
	public static final String STR_2 = "{{}{}}";
	public static final String STR_3 = "[]{}()";
	public static final String STR_4 = "{()}[)";
	public static final String STR_5 = "{(})";

	public static void main(String[] args) {
		
		String str = List.of(STR_1, STR_2, STR_3, STR_4, STR_5).get(new Random().nextInt(5));
		
		boolean balanced = isBalanced(str);
		
		System.out.println(str + " " + balanced);
		
	}

	private static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		
		for (char ch : str.toCharArray()) {
			
			if(ch == '{' || ch == '(' || ch == '[') {
				stack.push(ch);
			} else if(ch == '}' || ch == ')' || ch == ']') {
				
				if (stack.isEmpty()) {
					return false;
				}
				
				char top = stack.pop();
				
				if ((ch == ')' && top != '(') ||
					(ch == '}' && top != '{') ||
					(ch == ']' && top != '[')) {
					return false;	
				}
			}
		}
		return stack.isEmpty();
	}
}
