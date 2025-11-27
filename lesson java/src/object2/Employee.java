package object2;

public class Employee {
	private String employeeid;
	private String name1;

	public Employee(String empd, String nameA) {
		this.employeeid = empd;
		this.name1 = nameA;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public String getname1() {
		return name1;
	}

	public void setEmployee(String employeeid1, String name2) {
		this.employeeid = employeeid1;
		this.name1 = name2;
	}

	public void showinfo() {
		System.out.println("社員iD:" + employeeid + ",名前:" + name1);
	}
}
