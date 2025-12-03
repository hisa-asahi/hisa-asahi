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

	}

	//体長
	public double aniLong;

	public double getaniLong() {
		return aniLong;
	}

	public void setaniLong(double newLong) {
		this.aniLong = newLong;

	}

	//速度
	public int aniSpeed;

	public int getaniSpeed() {
		return aniSpeed;
	}

	public void setaniSpeed(int newSpeed) {
		this.aniSpeed = newSpeed;

	}

}
