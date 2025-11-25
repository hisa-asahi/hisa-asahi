package curriculum_A;

public class FullTimeEmployee extends Employee{
	public FullTimeEmployee(String id, String name) {
		super(id, name);
		// TODO 自動生成されたコンストラクター・スタブ
	}


	private static final int HOURLY_RATE = 1200;
	

	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
		System.out.println("正社員の給与:" + hoursWorked * HOURLY_RATE + "円");
		}else {
			System.out.println("正社員の給与:" + ( 8 * HOURLY_RATE + (hoursWorked - 8) * HOURLY_RATE * 1.25) + "円"); 
		}
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
