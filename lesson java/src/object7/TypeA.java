package object7;

public class TypeA extends Employee {

	public TypeA(String name, int hours) {
		super(name, hours);
	}

	int result;

	@Override
	public int salaryForDay(int hours) {
		result = hours * 1200;
		return result;
	}

}
