package curriculum_D;

import java.util.Random;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		//名前を入力
		Random random = new Random();
		int hitpoint = random.nextInt(200);
		int speed = random.nextInt(100);
		int attack = random.nextInt(50);
		Character charactor = new Character(hitpoint, speed, attack);
		int dhp = 0;
		int datk = 0;
		int dspd = 0;
		int rand = random.nextInt(2);
		charactor.loadDaemon(dhp, datk, dspd);
		while (true) {
			if (speed > dspd || speed == dspd && rand == 0) {
				dhp -= attack;
				hitpoint -= datk;
				if (hitpoint <= 0) {
					System.out.println("You lose");
					if (hitpoint <= 0 || dhp <= 0) {
						break;
					}
				} else if (dhp <= 0) {
					System.out.println("You win");
					if (hitpoint <= 0 || dhp <= 0) {
						break;
					}
				}
			} else if (speed < dspd || speed == dspd && rand == 1) {
				hitpoint -= datk;
				dhp -= attack;
				if (hitpoint <= 0) {
					System.out.println("You lose");
					if (hitpoint <= 0 || dhp <= 0) {
						break;
					}
				} else if (dhp <= 0) {
					System.out.println("You win");
					if (hitpoint <= 0 || dhp <= 0) {
						break;
					}
				}
			}

		}
		// TODO 自動生成されたメソッド・スタブ
		scanner.close();
	}

}
