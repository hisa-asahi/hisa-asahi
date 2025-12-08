package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
		Character charactor = new Character(hitpoint, attack, speed);
		String load = "deamon_status.txt";
		List<Integer> daemon = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("deamon_status.txt"));
			String line;

			while ((line = reader.readLine()) != null) {
				if (line.trim().isEmpty()) {
					continue;
				}
				try {
					daemon.add(Integer.parseInt(line.trim())); // 文字列を整数に変換してリストに追加
				} catch (NumberFormatException e) {
					System.err.println("警告: 数値に変換できない行をスキップしました: " + line);
				}
			}
			System.out.println("ファイルから読み込んだ数値: " + daemon);

		} catch (IOException e) {
			System.err.println("ファイルの読み込み中にエラーが発生しました: " + e.getMessage());
			e.printStackTrace();
		}

		int dhp = daemon.get(0);
		int datk = daemon.get(1);
		int dspd = daemon.get(2);
		int rand = random.nextInt(2);
		loadDaemon(dhp, datk, dspd);
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

	private static void loadDaemon(int dhp, int datk, int dspd) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
