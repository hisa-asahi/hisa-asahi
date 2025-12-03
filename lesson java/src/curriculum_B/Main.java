package curriculum_B;

import curriculum_A.Animal;
import curriculum_A.Greeting;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Q4
		Greeting greeting = new Greeting();
		greeting.sayHello();
		//Q5
		Animal animal = new Animal("ライオン", 2.1, 80);
		System.out.println("動物名:" + animal.getaniName());
		System.out.println("体長:" + animal.aniLong + "m");
		System.out.println("速度:" + animal.aniSpeed + "km/h");

	}
}
