package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		byte byteNum = 0;
		short shortNum = 0;
		int intNum =0;
		long longNum = 0L;
		float floatNum = 0.0f;
		double doubleNum = 0.0;
		char letter = '\u0000';
		String letters = "null";
		boolean isBoolean = false;
		
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000L;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		System.out.println(longNum + intNum + shortNum + byteNum);
		System.out.println(byteNum * 2);
		System.out.println(letter + " " + letters + " " + isBoolean);
		System.out.println(longNum + intNum + shortNum + byteNum + floatNum + doubleNum);
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
		
		
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！");
		
		int age = 25;
		System.out.println("年齢:" + age + "歳");
		
		int num1 = 10;
		int num2 = 5;
		int sum =num1 + num2;
		System.out.println(sum);
		
		int score = 80;
		score += 20;
		System.out.println(score);
		
		double price = 99.99;
		int price1 =(int)price;
		System.out.println("整数価格:" + price1);
		
		String numStr ="123";
		int numStr1 = Integer.parseInt(numStr);
		System.out.println(numStr1 + 10);
		
		int num = 50;
		String numA = String.valueOf(num);
		System.out.println("得点:" + numA + "点");
		
		int a =10;
		int b =20;
		boolean result =(a<b); 
		System.out.println(result);
		
		int x = 15;
		String xx =( x >= 10 ) ? "OK" : "NG";
		System.out.println(xx);
		
		String text ="私はJavaが好きです。Javaは楽しい!";
		String text1 =text.replace("Java", "Python");
		System.out.println(text1);
		// TODO 自動生成されたメソッド・スタブ

	}


}
