package curriculum_B;

public class Question5 {
	

	public static void main(String[] args) {
		
		// TODO 自動生成されたメソッド・スタブ

	}
	//Q1
	public static void helloWorld() {
		System.out.println("Hello,World!");
	}
	//Q2
	public static int doubleValue(int num) {
		int a =num * 2;
		System.out.println(num + "を２倍すると" + a + "です。");
		return a;
	}
	//Q3
	public static boolean isEven(int num) {
	
		if(num % 2 == 0) {
			System.out.println(num + "は偶数です。");
			return true;
		}else {
			System.out.println(num + "は奇数です。");
			return false;
		}
	}
	
}
