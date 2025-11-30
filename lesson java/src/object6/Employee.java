package object6;

//インターフェイスと抽象クラス
interface Billable {
	int costForDay(int hoursWorked);
}

public abstract class Employee implements Billable {

}
