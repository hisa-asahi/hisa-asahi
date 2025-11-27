package object1;

public class Employee {
	private String name;

	public Employee(String enpName) {
		this.name = enpName;
	}

	public String getEmployee() {
		return name;
	}

	public void setEmployee(String newName) {
		this.name = newName;
	}

	public void work() {
		System.out.println(name + "は働いています。");
	}


}
