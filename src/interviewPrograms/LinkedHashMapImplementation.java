package interviewPrograms;

/**
 * @author Bishwajit.
 *
 */
public class LinkedHashMapImplementation {

	public static void main(String[] args) {
		LinkedHashMapCustom<String, Integer> map = new LinkedHashMapCustom<String, Integer>();
		map.put("A", 11);
		map.put("B", 21);
		map.put("C", 31);
		map.put("D", 41);
		map.put("E", 51);

		// Display
		System.out.print("Map :: ");
		map.display();

		// Displaying Corresponding Values
		System.out.println("Display values corresponding to keys.");
		System.out.println("value corresponding to key A = " + map.get("A"));
		System.out.println("value corresponding to key B = " + map.get("B"));
		System.out.println("value corresponding to key C = " + map.get("C"));
		System.out.println("value corresponding to key D = " + map.get("D"));
		System.out.println("value corresponding to key E = " + map.get("E"));

		// Removing the Elements
		map.remove("C");
		System.out.print("Map after removing the key C :: ");
		map.display(); // Displaying after removing the elements.

		// WRT to Employee
		LinkedHashMapCustom<Employee2, Integer> employeeMap = new LinkedHashMapCustom<Employee2, Integer>();
		employeeMap.put(new Employee2("1", "Bishwajit", "20000"), 101);
		employeeMap.put(new Employee2("2", "Vikram", "30000"), 102);
		employeeMap.put(new Employee2("3", "Anushree", "40000"), 103);
		employeeMap.put(new Employee2("4", "Kashyap", "50000"), 104);

		// Display
		System.out.print("Employee Map :: ");
		employeeMap.display();

		// Displaying Corresponding Values
		Employee2 emp = new Employee2("1", "Bishwajit", "20000");
		System.out.println("Display values corresponding to keys.");
		System.out.println("value corresponding to Employee 1 = " + employeeMap.get(emp));

		// Removing the Elements from employeeMap
		employeeMap.remove(emp);
		System.out.print("Map after removing the key Employee 1 :: ");
		employeeMap.display(); // Displaying after removing the elements.
	}

}

class Employee2 {
	private String id;
	private String name;
	private String salary;

	public Employee2(String id, String name, String salary) {
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
		if (this.getClass() != obj.getClass())
			return false;
		Employee2 emp = (Employee2) obj;
		return emp.id.equals(this.id) && emp.name.equals(this.name) && emp.salary.equals(this.salary);

	}

	@Override
	public String toString() {
		return "Employee[id=" + id + ", name=" + name + ", sal=" + salary + "] ";
	}

}

class LinkedHashMapCustom<K, V> {
	private Entry<K, V>[] table;
	private int capacity = 4;
	private Entry<K, V> header;
	private Entry<K, V> last;

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;
		Entry<K, V> before, after;

		public Entry(K key, V value, Entry<K, V> next) {
			super();
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	public LinkedHashMapCustom() {
		table = new Entry[capacity];
	}

	public void put(K newKey, V newValue) {
		if (newKey == null) {
			return;
		}
		int hash = hash(newKey);
		Entry<K, V> newEntry = new Entry<K, V>(newKey, newValue, null);
		maintainOrderAfterInsert(newEntry);
		if (table[hash] == null) {
			table[hash] = newEntry;
		} else {
			Entry<K, V> prev = null;
			Entry<K, V> curr = table[hash];
			while (curr != null) {
				if (curr.key.equals(newKey)) {
					if (prev == null) {
						newEntry.next = curr.next;
						table[hash] = newEntry;
						return;
					} else {
						newEntry.next = curr.next;
						prev.next = newEntry;
						return;
					}
				}
				prev = curr;
				curr = curr.next;
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
				temp = temp.next;
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
					maintainOrderAfterDeletion(curr);
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

	private void maintainOrderAfterInsert(Entry<K, V> newEntry) {
		if (header == null) {
			header = newEntry;
			last = newEntry;
			return;
		}
		if (header.key.equals(newEntry.key)) {
			deleteFirst();
			insertFirst(newEntry);
			return;
		}
		if (last.key.equals(newEntry.key)) {
			deleteLast();
			insertLast(newEntry);
			return;
		}
		Entry<K, V> beforeDeleteEntry = deleteSpecificEntry(newEntry);
		if (beforeDeleteEntry == null) {
			insertLast(newEntry);
		} else {
			insertAfter(newEntry, beforeDeleteEntry);
		}
	}

	private void maintainOrderAfterDeletion(Entry<K, V> deleteEntry) {
		if (header.key.equals(deleteEntry.key)) {
			deleteFirst();
			return;
		}
		if (last.key.equals(deleteEntry.key)) {
			deleteLast();
			return;
		}
		deleteSpecificEntry(deleteEntry);
	}

	private void insertFirst(Entry<K, V> newEntry) {
		if (header == null) {
			header = newEntry;
			last = newEntry;
			return;
		}
		newEntry.after = header;
		header.before = newEntry;
		header = newEntry;
	}

	private void insertLast(Entry<K, V> newEntry) {
		if (header == null) {
			header = newEntry;
			last = newEntry;
			return;
		}
		last.after = newEntry;
		newEntry.before = last;
		last = newEntry;

	}

	private void deleteFirst() {
		if (header == last) {
			header = last = null;
			return;
		}
		header = header.after;
		header.before = null;
	}

	private void deleteLast() {
		if (header == last) {
			header = last = null;
			return;
		}
		last = last.before;
		last.after = null;
	}

	private void insertAfter(Entry<K, V> newEntry, Entry<K, V> beforeDeleteEntry) {
		Entry<K, V> curr = header;
		while (curr != beforeDeleteEntry) {
			curr = curr.next;
		}
		newEntry.after = beforeDeleteEntry.after;
		beforeDeleteEntry.after.before = newEntry;
		newEntry.before = beforeDeleteEntry;
		beforeDeleteEntry.after = newEntry;
	}

	private Entry<K, V> deleteSpecificEntry(Entry<K, V> newEntry) {
		Entry<K, V> curr = header;
		while (!curr.key.equals(newEntry.key)) {
			if (curr.after == null) {
				return null;
			}
			curr = curr.after;
		}
		Entry<K, V> beforeDeleteEntry = curr.before;
		curr.before.after = curr.after;
		curr.after.before = curr.before;
		return beforeDeleteEntry;
	}

	private int hash(K key) {
		return Math.abs(key.hashCode() % capacity);
	}

	public void display() {
		Entry<K, V> curr = header;
		while (curr != null) {
			System.out.print("{" + curr.key + " = " + curr.value + "} ");
			curr = curr.after;
		}
		System.out.println();
	}
}