package interviewPrograms;

public class HashSetImplementation {
	public static void main(String[] args) {
		HashSetImplementationCustom<Employee3> set = new HashSetImplementationCustom<Employee3>();
		set.add(new Employee3("1", "Bishwajit", "20000"));
		set.add(new Employee3("2", "Vikram", "30000"));
		set.add(new Employee3("3", "Anushree", "40000"));
		set.add(new Employee3("4", "Kashyap", "50000"));
		set.add(new Employee3("5", "Rahul", "2000"));
		set.add(new Employee3("6", "Singh", "40000"));

		// Displaying the values.
		System.out.print("SET : ");
		set.display();

		// Displaying Corresponding Values
		System.out.println("HashSetCustom contains 4 = " + set.contains(new Employee3("4", "Kashyap", "50000")));
		System.out.println("HashSetCustom contains 3 = " + set.contains(new Employee3("3", "Anushree", "40000")));
		System.out.println("HashSetCustom contains 7 = " + set.contains(new Employee3("7", "Anushree", "40000")));
		
		// Removing the Employee from the set.
		set.remove(new Employee3("3", "Anushree", "40000"));
		System.out.print("SET after removing : ");
		set.display();
	}
}

class Employee3 {
	private String id;
	private String name;
	private String salary;

	public Employee3(String id, String name, String salary) {
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
		if (obj.getClass() == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		Employee3 emp = (Employee3) obj;
		return emp.id.equals(this.id) && emp.name.equals(this.name) && emp.salary.equals(this.salary);
	}

	@Override
	public String toString() {
		return "{" + this.id + ", " + this.name + ", " + this.salary + "}";
	}

}

class HashSetImplementationCustom<E> {
	private HashMapCustomImplementation<E, Object> hashMapCustom;

	public HashSetImplementationCustom() {
		hashMapCustom = new HashMapCustomImplementation<>();
	}

	public void add(E value) {
		hashMapCustom.put(value, null);
	}

	public boolean contains(E obj) {
		return hashMapCustom.contains(obj) != null ? true : false;
	}

	public void display() {
		hashMapCustom.displaySet();
	}

	public boolean remove(E obj) {
		return hashMapCustom.remove(obj);
	}
}

class HashMapCustomImplementation<K, V> {
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

	public HashMapCustomImplementation() {
		table = new Entry[capacity];
	}

	public void put(K newKey, V newValue) {
		if (newKey == null)
			return;
		int hash = hash(newKey);
		Entry<K, V> newEntry = new Entry<K, V>(newKey, newValue, null);
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

	private int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}

	public void display() {
		for (int i = 0; i < capacity; i++) {
			if (table[i] != null) {
				Entry<K, V> entry = table[i];
				while (entry != null) {
					System.out.print("{" + entry.key + "=" + entry.value + "}" + " ");
					entry = entry.next;
				}
			}
		}
	}

	public K contains(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		} else {
			Entry<K, V> temp = table[hash];
			while (temp != null) {
				if (temp.key.equals(key)) {
					return key;
				}
				temp = temp.next;
			}
			return null;
		}
	}

	public void displaySet() {
		for (int i = 0; i < capacity; i++) {
			if (table[i] != null) {
				Entry<K, V> temp = table[i];
				while (temp != null) {
					System.out.print(temp.key + " ");
					temp = temp.next;
				}
			}
		}
		System.out.println();
	}

}