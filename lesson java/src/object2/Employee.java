package object2;

public class Employee {
	private String employeeid;
	private String name;

	public Employee(String empd, String nameA) {
		this.employeeid = empd;
		this.name = nameA;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public String getName1() {
		return name;
	}

	public void setEmployee(String empd, String nameA) {
		this.employeeid = empd;

	}

	public void setName1(String nameA) {
		this.name = nameA;
	}

	public void showinfo() {
		System.out.println("社員iD:" + employeeid + ",名前:" + name);
	}
}
