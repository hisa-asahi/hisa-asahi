package object6;

public class FullTimeEmployee extends Employee{


	public FullTimeEmployee() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int costForDay(int hoursWorked) {
		if(hoursWorked <= 8) {
			System.out.println(hoursWorked * 1250 + "円");
		}else {
			System.out.println(8 * 1250 + (hoursWorked - 8) * 1250 * 1.25 + "円");
		}
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
