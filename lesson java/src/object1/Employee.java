package object1;

public class Employee {
	private String name;

	public Employee(String enpName) {
		this.name = enpName;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void work() {
		System.out.println(name + "は働いています。");
	}


}
