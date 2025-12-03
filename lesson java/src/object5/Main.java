package object5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("A001", "山田太郎"));
		employees.add(new ContractEmployee("A002", "加藤信二"));
		employees.add(new FullTimeEmployee("A003", "佐藤次郎"));
		employees.add(new ContractEmployee("A004", "鈴木三郎"));

		for (Employee e : employees) {
			System.out.println(e.name + "の給料:" + e.calculateDailyWage(10) + "円");
		}

		// TODO 自動生成されたメソッド・スタブ

	}

}
