package object6;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String id, String name) {
		super(id, name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	double cost;

	@Override
	public int costForDay(int hoursWorked) {
		if (hoursWorked <= 8) {
			cost = hoursWorked * 1250;
		} else {
			cost = 8 * 1250 + (hoursWorked - 8) * 1250 * 1.25;
		}
		// TODO 自動生成されたメソッド・スタブ
		return (int) cost;
	}

	

	
}
