package interview.nokia;

public class Question1 {

	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
		System.out.println("from swap method i = " + i + ", j = " + j);
	}

	public static void main(String[] args) {
		int i1 = 1;
		int j1 = 2;
		swap(i1, j1);
		System.out.println("from main method i = " + i1 + ", j = " + j1);
	}

}
