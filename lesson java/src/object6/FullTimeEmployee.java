package object6;

public class FullTimeEmployee extends Employee {

	double a;

	@Override
	public int costForDay(int hoursWorked) {
		if (hoursWorked <= 8) {
			a = hoursWorked * 1250;
		} else {
			a = 8 * 1250 + (hoursWorked - 8) * 1250 * 1.25;
		}
		// TODO 自動生成されたメソッド・スタブ
		return (int) a;
	}

	private String id;
	private String name;

	public FullTimeEmployee(String id, String name) {
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
