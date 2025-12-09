package curriculum_D;

public class Character {

	private int hit;
	private int atk;
	private int spd;

	public Character(int hit, int atk, int spd) {
		this.hit = hit;
		this.atk = atk;
		this.spd = spd;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getSpd() {
		return spd;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

}
