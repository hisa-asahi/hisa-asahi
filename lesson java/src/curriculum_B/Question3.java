package curriculum_B;

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
		for (int e = 1; e <= 100; e++) 
			d = d+ e;
			System.out.println(d);
		
		for (int f = 1; f <= 5; f++) {
			if (f == 1) {System.out.println("*");
			}else if (f == 2) {System.out.println("**");
			}else if (f == 3) {System.out.println("***");
			}else if (f == 4) {System.out.println("****");
			}else if (f == 5) {System.out.println("*****");}
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
			j++;
			k = k + j;
		}
		System.out.println(k);
		
		
		// TODO 自動生成されたメソッド・スタブ

	}

}
