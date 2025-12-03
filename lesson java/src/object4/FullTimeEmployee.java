package object4;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
		super(id, name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private static final int HOURLY_RATE = 1200;

	int result;

	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
			result = hoursWorked * HOURLY_RATE;
		} else {
			result = (int) (8 * HOURLY_RATE + (hoursWorked - 8) * HOURLY_RATE * 1.25);
		}
		// TODO 自動生成されたメソッド・スタブ
		return result;
	}

}
