package interviewPrograms;

/**
 * @author Bishwajit.
 *
 */
public class HashMapImplementation {

	public static void main(String[] args) {
		HashMapCustom<Employee1, Integer> myMap = new HashMapCustom<Employee1, Integer>();
		myMap.put(new Employee1("1", "A", "3000"), 12);
		myMap.put(new Employee1("2", "B", "3800"), 16);
		myMap.put(new Employee1("3", "C", "3700"), 17);
		myMap.put(new Employee1("4", "D", "3500"), 11);

		// displaying my custom HashMap
		myMap.display();

		// Displaying values with corresponding keys.
		System.out.println("\n\nDisplay values corresponding to keys");
		int i = myMap.get(new Employee1("1", "A", "3000"));
		System.out.println("value corresponding to employee with id=1' : " + i);

		// Removing the employees
		myMap.remove(new Employee1("1", "A", "3000"));

		// Displaying map after removing the employee.
		System.out.println("\nAfter removing Employee Displaying the Custom Map");
		myMap.display();

	}

}

class Employee1 {
	private String id;
	private String name;
	private String sal;

	public Employee1(String id, String name, String sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee[id=" + id + ", name=" + name + ", sal=" + sal + "] ";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Employee1 emp = (Employee1) obj;
		return emp.id.equals(this.id) && emp.name.equals(this.name) && emp.sal.equals(this.sal);
	}

	@Override
	public int hashCode() {
		return this.id.hashCode() + this.name.hashCode() + this.sal.hashCode();
	}
}

class HashMapCustom<K, V> {

	private Entry<K, V>[] table;
	private int capacity = 4;

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	public HashMapCustom() {
		table = new Entry[capacity];
	}

	public void put(K newKey, V newValue) {

		if (newKey == null) {
			return;
		}

		int hash = hash(newKey);

		Entry<K, V> newEntry = new Entry<K, V>(newKey, newValue, null);
		if (table[hash] == null) {
			table[hash] = newEntry;
		} else {
			Entry<K, V> prev = null;
			Entry<K, V> current = table[hash];
			while (current != null) {
				if (current.key.equals(newKey)) {
					if (prev == null) {
						newEntry.next = current.next;
						table[hash] = newEntry;
						return;
					} else {
						newEntry.next = current.next;
						prev.next = newEntry;
						return;
					}
				}
				prev = current;
				current = current.next;
			}
			prev.next = newEntry;
		}

	}

	public V get(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		} else {
			Entry<K, V> temp = table[hash];
			while (temp != null) {
				if (temp.key.equals(key)) {
					return temp.value;
				}
			}
			return null;
		}
	}

	public boolean remove(K deleteKey) {
		int hash = hash(deleteKey);
		if (table[hash] == null) {
			return false;
		} else {
			Entry<K, V> prev = null;
			Entry<K, V> curr = table[hash];
			while (curr != null) {
				if (curr.key.equals(deleteKey)) {
					if (prev == null) {
						table[hash] = table[hash].next;
						return true;
					} else {
						prev.next = curr.next;
						return true;
					}
				}
				prev = curr;
				curr = curr.next;
			}
			return false;
		}
	}

	public void display() {
		for (int i = 0; i < capacity; i++) {
			if (table[i] != null) {
				Entry<K, V> entry = table[i];
				while (entry != null) {
					System.out.print("{" + entry.key + "=" + entry.value + "}" + "   ");
					entry = entry.next;
				}
			}
		}
	}

	private int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}
}