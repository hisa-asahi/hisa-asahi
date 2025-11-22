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
				Animal animal = new Animal(null);
				animal.setaniName("ライオン");
				Animal animal1 = new Animal(0);
				animal1.setaniLong(2.1);
				Animal animal2 = new Animal(0);
				animal2.setaniSpeed(80);
	}

}
