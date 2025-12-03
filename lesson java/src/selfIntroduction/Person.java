package selfIntroduction;

public class Person {
	public String name;
	public int age;
	public double height;
	static int counter = 0;

	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	private double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	double bmi;

	public double bmi() {
		bmi = weight / (height * height);
		return bmi;
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + bmi() + "です");
	}

	public int count() {
		return counter;
	}
}
