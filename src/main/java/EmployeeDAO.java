/**
 * Created by kuba on 31.03.16.
 */
public interface EmployeeDAO {
	/* Method to CREATE an employee in the database */
	Integer addEmployee(String fname, String lname, int salary);

	/* Method to  READ all the employees */
	void listEmployees();

	/* Method to UPDATE salary for an employee */
	void updateEmployee(Integer EmployeeID, int salary);

	/* Method to DELETE an employee from the records */
	void deleteEmployee(Integer EmployeeID);
}
