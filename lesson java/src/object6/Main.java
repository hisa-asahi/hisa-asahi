package object6;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Billable> employees = new ArrayList<>();
		employees.add(new FullTimeEmployee("A001", "佐藤太郎"));
		employees.add(new ContractEmployee("A002", "田中次郎"));
		employees.add(new FullTimeEmployee("A003", "斎藤三郎"));
		employees.add(new ContractEmployee("A004", "伊東四朗"));

		for (Billable b : employees) {
			System.out.println(b.costForDay(10));
		}
		// TODO 自動生成されたメソッド・スタブ

	}

}
