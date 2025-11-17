package curriculum_B;

public class Question2 {

	public static void main(String[] args) {
		int score = 75;if (score >= 60) { System.out.println("合格です");}

		int age = 25;
		if (age >= 20 && age <= 30) {System.out.println("適正年齢です");}else {System.out.println("対象外です");}

		//変数が重複するため変数ageではなく変数ageAを使用しています。//
		int ageA = 18;
		if (ageA > 20){System.out.println("成人です");
		} else if (ageA >= 13 && ageA <= 19) {System.out.println("ティーンエイジャーです");
		} else  {System.out.println("子供です");}

		int x = 30;
		int y = 15;
		int z = 50;
		if (x > y && x > z) {System.out.println("x");
		}else if (y > x && y > z) {System.out.println("y");
		}else if (z > x && z > y) {System.out.println("z");}

		int num = 51;
		if (num >0) {System.out.println("正の数です");
		} else if (num == 0) {System.out.println("0です");
		} else {System.out.println("負の数です");}

		int value = 61;
		String valueA = (value % 2 == 0) ? "偶数です" : "奇数です";
		System.out.println(valueA);

		//変数scoreは使用済みのためscore1を使用//
		int score1 = 100;
		if (score1 >= 90) {System.out.println("優");
		}else if (score1 >= 70) {System.out.println("良");
		}else if (score1 >= 50) {System.out.println("可");
		}else if (score1 < 50) {System.out.println("不可");}

		String isGod = " ";
		if (isGod.equals(null) || isGod.equals(" ")) {System.out.println("入力が無効です");}

		int day = 5;
		switch (day){
		case 1:
		System.out.println("月曜日");
		break;
		case 2:
		System.out.println("火曜日");
		break;
		case 3:
		System.out.println("水曜日");
		break;
		case 4:
		System.out.println("木曜日");
		break;
		case 5:
		System.out.println("金曜日");
		break;
		case 6:
		System.out.println("土曜日");
		break;
		case 7:
		System.out.println("日曜日");
		break;
		default:
		System.out.println("無効な入力です");
		}

		int month = 2;
		switch (month) {
		case 12: case 1: case 2:
		System.out.println("冬");
		break;
		case 3: case 4: case 5:
		System.out.println("春");
		break;
		case 6: case 7: case 8:
		System.out.println("夏");
		break;
		case 9: case 10: case 11:
		System.out.println("秋");
		break;
		default:
		System.out.println("無効な月です");
		}
		// TODO 自動生成されたメソッド・スタブ

	}

}
