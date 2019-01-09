
public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee() {
		id = -1;
		firstName = "Something";
		lastName = "Something";
		salary = 0;
	}

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return this.firstName + " " + this.lastName;
	}

	public int getAnnualSalary() {
		return 12 * this.salary;
	}

	public int raiseSalary(int procent) {
		return this.salary * (procent / 100) + this.salary;
	}

}
