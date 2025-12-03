package object6;

public class ContractEmployee extends Employee {

	public ContractEmployee(String id, String name) {
		super(id, name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	int cost;

	@Override
	public int costForDay(int hoursWorked) {
		cost = hoursWorked * 1000;
		// TODO 自動生成されたメソッド・スタブ
		return cost;
	}

	
}
