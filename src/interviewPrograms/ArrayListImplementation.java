package interviewPrograms;

import java.util.Arrays;

/**
 * @author Bishwajit.
 *
 */
public class ArrayListImplementation {

	public static void main(String[] args) {
		ArrayListCustom<Employee4> list = new ArrayListCustom<Employee4>();

		// Adding Employee Object to Custom Array List.
		list.add(new Employee4("1", "Bishwajit", "20000"));
		list.add(new Employee4("2", "Vikram", "30000"));
		list.add(new Employee4("3", "Anushree", "40000"));
		list.add(new Employee4("4", "Kashyap", "50000"));
		list.add(new Employee4("5", "Rahul", "2000"));
		list.add(new Employee4("6", "Singh", "40000"));

		// Displaying the List
		list.display();

		System.out.println("Element at index in custom ArrayList > " + 1 + " = " + list.get(1));

		// Remove element from custom ArrayList
		System.out.println("element removed from index " + 1 + " = " + list.remove(1));

		// Displaying the List
		list.display();
	}

}

class Employee4 {

	private String id;
	private String name;
	private String salary;

	public Employee4(String id, String name, String salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return id.hashCode() + name.hashCode() + salary.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		Employee4 emp = (Employee4) obj;
		return emp.id.equals(id) && emp.name.equals(name) && emp.salary.equals(salary);
	}

	@Override
	public String toString() {
		return "[id = " + id + ", name = " + name + ", salary = " + salary + "]";
	}
}

class ArrayListCustom<E> {
	private static final int INITIAL_CAPACITY = 10;
	private int size = 0;
	private Object elementData[] = {};

	public ArrayListCustom() {
		elementData = new Object[INITIAL_CAPACITY];
	}

	public void add(E e) {
		if (size == elementData.length) {
			ensureCapacity();
		}
		elementData[size++] = e;
	}

	public E get(int index) {
		if (index < 0 && index >= size) {
			throw new IndexOutOfBoundsException("Index :: " + index + ", size :: " + index);
		}
		return (E) elementData[index];
	}

	public Object remove(int index) {
		if (index < 0 && index >= size) {
			throw new IndexOutOfBoundsException("Index :: " + index + ", size :: " + index);
		}
		Object removeElement = elementData[index];
		for (int i = index; i < size; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;
		return removeElement;
	}

	private void ensureCapacity() {
		int newIncreaseCapacity = elementData.length * 2;
		elementData = Arrays.copyOf(elementData, newIncreaseCapacity);
	}

	public void display() {
		System.out.print("Displaying list : ");
		for (int i = 0; i < size; i++) {
			System.out.print(elementData[i] + " ");
		}
		System.out.println();
	}
}