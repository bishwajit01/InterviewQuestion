package concepts;

/**
 * @author Bishwajit.
 *
 */
public class EqualsAndHashCode {

	public static void main(String[] args) {
		Emp emp1 = new Emp(1, "ABC", 20000.0);
		Emp emp2 = new Emp(1, "ABC", 20000.0);
		// Emp emp3 = new Emp(65, "XYZ", 70000.0);

		if (emp1.hashCode() == emp2.hashCode()) {
			if (emp1.equals(emp2)) {
				System.out.println("Both Object are equal");
			} else {
				System.out.println("Both Object are not equal");
			}
		} else {
			System.out.println("Both Object are not equal");
		}
	}

}

class Emp {
	private int id;
	private String name;
	private double salary;

	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return (int) (id + name.hashCode() + salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		Emp e = (Emp) obj;
		return (e.name == this.name && e.id == this.id);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

}