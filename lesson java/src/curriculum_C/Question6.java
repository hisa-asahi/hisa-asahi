package curriculum_C;

import java.util.Random;
import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Cpu cpu = new Cpu(random.nextInt(3));
		//グー(0), チョキ(1), パー(2) を入力

		while (true) {
			cpu.setCpu(random.nextInt(3));
			int cpu1 = random.nextInt(3);
			int scaNum = scanner.nextInt();
			if (scaNum == cpu1) {
				System.out.println("あいこです");
				break;
			} else if (scaNum == 0 && cpu1 == 2 || scaNum == 1 && cpu1 == 0 || scaNum == 2 && cpu1 == 1) {
				System.out.println("CPUの勝ち");
				break;
			} else if (scaNum == 0 && cpu1 == 1 || scaNum == 1 && cpu1 == 2 || scaNum == 2 && cpu1 == 0) {
				System.out.println("あなたの勝ち");
				scanner.close();
				break;
			}
		}

	}
}
