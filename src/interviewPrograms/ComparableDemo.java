/**
 * 
 */
package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Bishwajit.
 * Comparable is Single Sorting.
 * It uses compareTo method.
 * It affect the original class. It modifies the data of the original class.
 */
public class ComparableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<Student>();

		listStudent.add(new Student("A", 49, 90000L));
		listStudent.add(new Student("B", 34, 24000L));
		listStudent.add(new Student("C", 30, 56000L));
		listStudent.add(new Student("D", 35, 69000L));

		Collections.sort(listStudent);

		for (Student student : listStudent) {
			System.out.println(student.getName() + " " + student.getAge() + " " + student.getSal());
		}
	}

}

final class Student implements Comparable<Student> {
	private String name;
	private int age;
	private long sal;

	public Student(String name, int age, long sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the sal
	 */
	public long getSal() {
		return sal;
	}

	/**
	 * @param dsl the sal to set
	 */
	public void setSal(long sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return this.age - student.age;
	}

}
