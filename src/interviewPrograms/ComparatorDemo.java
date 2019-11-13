/**
 * 
 */
package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Bishwajit.
 * Multiple Sorting Sequence.
 * Doesn't affect the original class.
 * It uses compare() Method.
 * Comparator is present java.util package.
 * It uses Collection.sort(List, <T>) 
 *
 */
public class ComparatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<Student>();

		listStudent.add(new Student("Bishwajit", 20, "CSE"));
		listStudent.add(new Student("Rahul", 46, "CSE"));
		listStudent.add(new Student("Anushree", 13, "CSE"));

		// sorting by Name.
		System.out.println("Sorting By Name::");
		Collections.sort(listStudent, new NameComparator());
		display(listStudent);
		System.out.println();

		// sorting by Roll Number.
		System.out.println("Sorting By Roll Number::");
		Collections.sort(listStudent, new RollNumberComparator());
		display(listStudent);
		System.out.println();
		
		// Reverse Order of Roll Number
		System.out.println("Reverse Sorting By Roll Number::");
		Collections.reverse(listStudent);
		display(listStudent);
	}

	static void display(List<Student> list) {
		for (Student student : list) {
			System.out.println(student.getName() + " " + student.getRollNumber() + " " + student.getDept());
		}
	}

}

class Student {
	private String name;
	private int rollNumber;
	private String dept;

	/**
	 * @param name
	 * @param rollNumber
	 * @param dept
	 */
	public Student(String name, int rollNumber, String dept) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.dept = dept;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rollNumber
	 */
	public int getRollNumber() {
		return rollNumber;
	}

	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
}

class RollNumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getRollNumber() == student2.getRollNumber()) {
			return 0;
		} else if (student1.getRollNumber() > student2.getRollNumber()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getName().compareTo(student2.getName());
	}

}