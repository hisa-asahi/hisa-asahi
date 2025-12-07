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

	private int dhp;
	private int datk;
	private int dspd;

	public void loadDaemon(int dhp, int datk, int dspd) {
		this.dhp = dhp;
		this.datk = datk;
		this.dspd = dspd;
	}

	public int getDhp() {
		return dhp;
	}

	public void setDhp(int dhp) {
		this.dhp = 120;
	}

	public int getDatk() {
		return datk;
	}

	public void setDatk(int datk) {
		this.datk = 30;
	}

	public int getDspd() {
		return dspd;
	}

	public void setDspd(int dspd) {
		this.dspd = 50;
	}
}
