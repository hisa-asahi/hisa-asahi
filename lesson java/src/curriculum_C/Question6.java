package curriculum_C;

import java.util.Random;
import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		//グー(0), チョキ(1), パー(2) を入力
		int cpu = random.nextInt(3);
		int scaNum = scanner.nextInt();
		while (true) {
			if (scaNum == cpu) {
				System.out.println("あいこです");
			} else if (scaNum == 0 && cpu == 2 || scaNum == 1 && cpu == 0 || scaNum == 2 && cpu == 1) {
				System.out.println("CPUの勝ち");
			} else if (scaNum == 0 && cpu == 1 || scaNum == 1 && cpu == 2 || scaNum == 2 && cpu == 0) {
				System.out.println("あなたの勝ち");
				break;
			}
		}
		scanner.close();
	}
}
