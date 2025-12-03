package object4;

public class Main {

	public static void main(String[] args) {
		FullTimeEmployee full = new FullTimeEmployee("E001", "田中太郎");
		System.out.println("正社員の給与:" + full.calculateDailyWage(9) + "円");
		PartTimeEmployee part = new PartTimeEmployee("E002", "山田次郎");
		System.out.println("パート社員の給与:" + part.calculateDailyWage(9) + "円");
		// TODO 自動生成されたメソッド・スタブ

	}

}
