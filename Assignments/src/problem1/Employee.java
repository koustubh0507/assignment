package problem1;

public class Employee {

	public int id;
	public String firstname;
	public String lastname;
	public int salary;

	Employee(int id, String firstname, String lastname, int salary) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}

	int getID() {
		return id;
	}

	String getFirstName() {
		return firstname;
	}

	String getLastName() {
		return lastname;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int s) {
		salary = s;
	}

	int getAnnualSalary() {
		return salary * 12;
	}

	int raiseSalary(int perc) {
		int x = salary * 10 / 100;
		salary += x;
		return salary;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ "]";
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "koustubh", "patil", 20000);
		emp1.raiseSalary(10);
		System.out.print(emp1.toString());

	}

}