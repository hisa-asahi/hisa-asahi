package object7;

public class TypeB extends Employee {
	public TypeB(String name, int hours) {
		super(name, hours);
	}

	int result;

	@Override
	public int salaryForDay(int hours) {
		result = hours * 1000;
		return result;
	}
}
