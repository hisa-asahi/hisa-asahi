package curriculum_B;

public class Question5 {

	//Q1
	public static void helloWorld() {
		System.out.println("Hello,World!");
	}

	//Q2
	public static int doubleValue(int num) {
		int a = num * 2;
		System.out.println(num + "を２倍すると" + a + "です。");
		return a;
	}

	//Q3
	public static boolean isEven(int num) {

		if (num % 2 == 0) {
			System.out.println(num + "は偶数です。");
			return true;
		} else {
			System.out.println(num + "は奇数です。");
			return false;
		}
	}

	public static void main(String[] args) {
		//Q1
		helloWorld();
		//Q2
		doubleValue(0);
		//Q3
		isEven(5);
		// TODO 自動生成されたメソッド・スタブ

	}

	//Q4,Q5は、curriculum_BのMain.javaとcurriculum_AのAnimal.java Greeting.javaに記述
}
