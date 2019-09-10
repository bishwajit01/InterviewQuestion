package concepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Bishwajit.
 *
 */
public class JDBCConnection {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Emp1 object1 = new EmpDAOImplementation().getEmp1(204);
		System.out.print(object1.getEmployee_id());
		System.out.print("\t" + object1.getFirst_name());
		System.out.print("\t" + object1.getSalary());
	}

}

class Emp1 {
	private int employee_id;
	private String first_name;
	private int salary;

	/**
	 * @param employee_id
	 * @param first_name
	 * @param salary
	 */
	public Emp1(int employee_id, String first_name, int salary) {
		super();
		setEmployee_id(employee_id);
		setFirst_name(first_name);
		setSalary(salary);
	}

	/**
	 * @return the employee_id
	 */
	public int getEmployee_id() {
		return employee_id;
	}

	/**
	 * @param employee_id the employee_id to set
	 */
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
}

class EmpDAOImplementation {
	public Emp1 getEmp1(int employee_id) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		Connection connection = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		PreparedStatement preparedStatement = connection.prepareStatement("select * from emp1 where employee_id = ?");
		
		preparedStatement.setInt(1, employee_id);
		
		Emp1 object = null;
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			object = new Emp1(employee_id, resultSet.getString("first_name"), resultSet.getInt("salary"));
		}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return object;
	}
}