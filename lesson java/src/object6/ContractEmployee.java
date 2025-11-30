package object6;

public class ContractEmployee extends Employee {

	int b;

	@Override
	public int costForDay(int hoursWorked) {
		b = hoursWorked * 1000;
		// TODO 自動生成されたメソッド・スタブ
		return b;
	}

	private String id;
	private String name;

	public ContractEmployee(String id, String name) {
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
