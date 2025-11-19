package curriculum_B;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}

		for (int b = 2; b <= 20; b += 2) {
			System.out.println(b);
		}

		for (int c = 10; c >= 1; c--) {
			System.out.println(c);
		}

		int d = 0;
		for (int e = 1; e <= 100; e++) {
			d = d + e;
			System.out.println(d);
		}

		for (int f = 1; f <= 5; f++) {
			for (int aa = 1; aa <= 5; aa++) {
				if (f >= aa)
					System.out.print("*");
			}
			System.out.println();
		}

		int g = 1;
		while (g <= 10) {
			System.out.println(g);
			g++;
		}

		int h = 2;
		while (h <= 20) {
			System.out.println(h);
			h += 2;
		}

		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

		int j = 1;
		int k = 0;
		while (j <= 100) {
			k = k + j;
			j++;
		}
		System.out.println(k);

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int l = scanner.nextInt();
			if (l == 0) {
				scanner.close();
				System.out.println("終了しました");
				break;
			}
		}

		for (int m = 1; m <= 9; m++) {
			for (int n = 1; n <= 9; n++) {
				System.out.print(m + "*" + n + "=" + n * m);
				if (n < 9) {
					System.out.print("||");
				}
			}
			System.out.println();
		}

		// TODO 自動生成されたメソッド・スタブ

	}

}
