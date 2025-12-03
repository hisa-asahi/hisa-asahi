package object3;

public class Employee {
	private String employeeid;
	private String name;

	public Employee(String id, String name) {
		this.employeeid = id;
		this.name = name;
	}

	public void setEmployeeid(String id) {
		this.employeeid = id;
	}

	public String getEmployeeid() {

		return employeeid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {

		return name;
	}

}
