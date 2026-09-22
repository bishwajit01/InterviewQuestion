package interview.altimetrik2;

import java.util.HashSet;
import java.util.Set;

public class Question2 {

	static class Node {
		int data;
		Node addr;

		public Node(int data) {
			this.data = data;
			addr = null;
		}
	}	 

	public static void main(String[] args) {

		Node root = new Node(1);
		root.addr = new Node(2);
		root.addr.addr = new Node(3);
		root.addr.addr.addr = new Node(4);
		root.addr.addr.addr.addr = new Node(5);
		//LOOP
//		root.addr.addr.addr = root.addr;

		boolean b = detectLoop(root);
		if (b)
			System.out.println("Loop FOUND");
		else
			System.out.println("Loop NOT FOUND");

	}

	static boolean detectLoop(Node n) {
		Set<Node> setNode = new HashSet<>();
		boolean loop = false;

		while (n != null) {
			if (setNode.contains(n)) {
				loop = true;
				break;
			}
			setNode.add(n);
			n = n.addr;

		}
		System.out.println(loop);
		return loop;
	}
}
