package curriculum_B;

public class Employee {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	//1
	private String name;

	public Employee(String enpName) {
		this.name = enpName;
	}

	public String getEmployee() {
		return name;
	}

	public void setEmployee(String newName) {
		this.name = newName;
	}

	public void work() {
		System.out.println(name + "は働いています。");
	}

	//2重複のためname1を使用
	private String employeeid;
	private String name1;

	public Employee(String empd, String nameA) {
		this.employeeid = empd;
		this.name1 = nameA;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public String getname1() {
		return name1;
	}

	public void setEmployee(String employeeid1, String name2) {
		this.employeeid = employeeid1;
		this.name1 = name2;
	}

	public void showinfo() {
		System.out.println("社員iD:" + employeeid + ",名前:" + name1);
	}
	//3 重複のためemployeeid1,name3を使用
	private String employeeid1;
	private String name3;
	public void setEmployeeid1(String id) {
		this.employeeid1 = id;
	}
	public String getEmployeeid1() {
		System.out.println("社員ID:" + employeeid1);
		return employeeid1;
	}
	public void setName3(String name) {
		this.name3 = name;
	}
	public String getName3() {
		System.out.println("名前:"+ name3);
		return name3;
	}
	
}
