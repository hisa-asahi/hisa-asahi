package object5;

public class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	public static final int hourlyRate = 1000;

	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * hourlyRate;
	}
}
