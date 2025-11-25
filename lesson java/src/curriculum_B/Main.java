package curriculum_B;

import curriculum_A.Animal;
import curriculum_A.FullTimeEmployee;
import curriculum_A.Greeting;
import curriculum_A.PartTimeEmployee;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Q4
		Greeting greeting = new Greeting();
		greeting.sayHello();
		//Q5
		Animal animal = new Animal(null);
		animal.setaniName("ライオン");
		Animal animal1 = new Animal(0);
		animal1.setaniLong(2.1);
		Animal animal2 = new Animal(0);
		animal2.setaniSpeed(80);

		//1基本概念
		Employee employee = new Employee(null);
		employee.setEmployee("山田太郎");
		employee.work();
		//2クラスとオブジェクト
		Employee employee1 = new Employee(null,null);
		employee1.setEmployee("E001", "佐藤太郎");
		employee1.showinfo();
		
		//3カプセル化
		Employee employee2 = new Employee(null);
		employee2.setEmployeeid1("E002");
		employee2.setName3("田中花子");
		employee2.getEmployeeid1();
		employee2.getName3();
		
		//4継承
		FullTimeEmployee full = new FullTimeEmployee(null, null);
		full.calculateDailyWage(9);
		PartTimeEmployee part = new PartTimeEmployee(null, null);
		part.calculateDailyWage(9);
		
		
		
	
	}
}
