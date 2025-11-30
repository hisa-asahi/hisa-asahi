package object7;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {
	public static void main(String ages[]) {
		List<Employee> employee = new ArrayList<>();
		employee.add(new TypeA("佐藤太郎", 9));
		employee.add(new TypeB("田中次郎", 7));
		employee.add(new TypeA("斎藤三郎", 11));
		employee.add(new TypeB("伊東四朗", 8));

		for (Employee a : employee) {
			System.out.println(a.getName() + "の給料は" + a.salaryForDay(a.getHours()) + "円");
		}
	}
}
