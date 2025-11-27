package object3;

public class Employee {
	private String employee;
	private String name;
	public Employee(String id, String name) {
	this.employee =	id;
	this.name = name;
	}
	public void setEmployee(String id) {
		this.employee = id;
	}
	public String getEmployee() {
		System.out.println("社員ID:" + employee);
		return employee;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		System.out.println("名前:"+ name);
		return name;
	}
	
}
