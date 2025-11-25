package curriculum_A;

public class PartTimeEmployee extends Employee {
public PartTimeEmployee(String id, String name) {
		super(id, name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

private static final int HOURLY_RATE = 1000;
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		System.out.println("パート社員の給与:" + hoursWorked * HOURLY_RATE + "円");
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
