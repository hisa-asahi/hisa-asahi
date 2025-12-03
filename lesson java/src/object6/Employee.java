package object6;

//インターフェイスと抽象クラス
interface Billable {
	int costForDay(int hoursWorked);
}

public abstract class Employee implements Billable {
	private String id;
	private String name;

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getEmployeeid() {
		return id;
	}

	public void setEmployeeid(String employeeid) {
		this.id = employeeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
