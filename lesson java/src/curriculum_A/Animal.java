package curriculum_A;

public class Animal {
	//名前
	private String aniName;

	public Animal(String newName, double newLong, int newSpeed) {
		this.aniName = newName;
		this.aniLong = newLong;
		this.aniSpeed = newSpeed;
	}

	public String getaniName() {
		return aniName;
	}

	public void setaniName(String newName) {
		this.aniName = newName;
		System.out.println("動物名:" + aniName);
	}

	//体長
	public double aniLong;

	

	public double getaniLong() {
		return aniLong;
	}

	public void setaniLong(double newLong) {
		this.aniLong = newLong;
		System.out.println("体長:" + aniLong + "m");
	}

	//速度
	public int aniSpeed;

	

	public int getaniSpeed() {
		return aniSpeed;
	}

	public void setaniSpeed(int newSpeed) {
		this.aniSpeed = newSpeed;
		System.out.println("速度:" + aniSpeed + "km/h");
	}

	

}
