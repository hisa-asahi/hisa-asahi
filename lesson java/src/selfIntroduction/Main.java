package selfIntroduction;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7);
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		person1.weight = 60;
		person1.print();
		// TODO 自動生成されたメソッド・スタブ
System.out.println("合計1人です");//size()を使用？
	}

}
