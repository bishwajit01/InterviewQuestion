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
 * It affect the original class.
 * It modifies the data of the original class.
 */
public class ComparableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> listEmployee = new ArrayList<Employee>();

		listEmployee.add(new Employee("Ram", 49, 90000L));
		listEmployee.add(new Employee("Vikram", 34, 24000L));
		listEmployee.add(new Employee("Khirod", 30, 56000L));
		listEmployee.add(new Employee("Harish", 35, 69000L));

		Collections.sort(listEmployee);

		for (Employee employee : listEmployee) {
			System.out.println(employee.getName() + " " + employee.getAge() + " " + employee.getSal());
		}
	}

}

final class Employee implements Comparable<Employee> {
	private String name;
	private int age;
	private long sal;

	public Employee(String name, int age, long sal) {
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
	public int compareTo(Employee employee) {
		// TODO Auto-generated method stub
		return this.age - employee.age;
	}

}
