package object7;

interface Salary {
	int salaryForDay(int hours);
}

public abstract class Employee implements Salary {
	private String name;

	private int hours;

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
}
