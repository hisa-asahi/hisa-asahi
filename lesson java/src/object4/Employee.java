package object4;

public abstract class Employee {
	private String employeeid;
	private String name;

	public Employee(String id, String name) {
		this.employeeid = id;
		this.name = name;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int calculateDailyWage(int hoursWorked);
}
