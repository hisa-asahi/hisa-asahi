package object4;

public class PartTimeEmployee extends Employee {
	public PartTimeEmployee(String id, String name) {
		super(id, name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private static final int HOURLY_RATE = 1000;
	int result;

	@Override
	public int calculateDailyWage(int hoursWorked) {
		result = hoursWorked * HOURLY_RATE;
		// TODO 自動生成されたメソッド・スタブ
		return result;
	}

}
