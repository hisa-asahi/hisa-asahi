package object6;

public class ContractEmployee extends Employee{

	public ContractEmployee() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int costForDay(int hoursWorked) {
		System.out.println(hoursWorked * 1000 + "円");
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
