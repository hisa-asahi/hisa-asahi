package object7;

public class TypeA extends Employee {
	private String name;

	private int hours;

	public TypeA(String name, int hours) {
		this.name = name;

		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public int getHours() {
		return hours;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	int a;

	@Override
	public int salaryForDay(int hours) {
		a = hours * 1200;
		return a;
	}

}
