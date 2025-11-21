package curriculum_B;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int[] num = new int[5];//Q1
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		for (int a = 0; a <5; a++) {
			System.out.println(num[a]);
		}
		//Q2
		int[] numA = {10, 20, 30, 40, 50};
		for (int b = 4; b >= 0; b--) {
			System.out.println(numA[b]);
		}
		//Q3
		int[] numB = {3, 5, 7, 9, 11};
		int d = 0;
		for (int c = 0; c < 5; c++) {
		d += numB[c];
		}
		System.out.println(d);
		//Q4 最大、最小
		int[] numC = {12, 7, 9, 21, 5, 18};
		int max = numC[0];
		for (int e = 1; e < numC.length; e++) {
			if (max < numC[e]) {
				max = numC[e];
			}
		}
		System.out.println(max);
		int min = numC[0];
		for (int f = 1; f < numC.length; f++) {
			if (min > numC[f]) {
				min = numC[f];
			}
		}
		System.out.println(min);
		//Q5
		int[] numD = {1, 2, 3, 4, 5};
		for (int g : numD) {
			System.out.println(g * 2);
		}
		//Q6
		Scanner scanner = new Scanner(System.in);
		int[] numE = {4, 7, 10, 15, 20};
		int h = scanner.nextInt();
		for (int x: numE) {
			if(h == x) {
			System.out.println(h + "は配列に含まれています");
		}else {
			System.out.println(h + "は配列に含まれていません");
		}
		}
		scanner.close();
		//Q7
		int[][] array = {{1,2},{3,4},{5,6}};
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		//Q8
		int[][] array1 = {{10,20,30},{40,50,60},{70,80,90}};
		int sum = 0;
		for (int k = 0; k <array1.length; k++) {
			for (int l =0; l <array1[k].length; l++) {
				sum += array1[k][l];
			}
		}
		System.out.println(sum);
		//Q9
		int[][] array2 = {{12,15,8},{6,19,25},{30,2,10}};
		int max1 = array2[0][0];
		for (int m = 0; m < array2.length; m++) {
			for (int n = 0; n < array2[m].length; n++) {
				if(max1 < array2[m][n]) {
					max1 = array2[m][n];
				}
			}
		}
		System.out.println(max1);
		int min1 = array2[0][0];
		for (int m = 0; m < array2.length; m++) {
			for (int n = 0; n < array2[m].length; n++) {
				if(min1 > array2[m][n]) {
					min1 = array2[m][n];
				}
			}
		}
		System.out.println(min1);
		//Q10
		int[][][] array3 = {{{1,2},{3,4}},{{5,6},{7,8}}};
		for (int o = 0; o < array3.length; o++) {
			for (int p = 0; p < array3[o].length; p++) {
				for (int q = 0; q < array3[o][p].length; q++) {
					System.out.print(array3[o][p][q]);
				}
			}
		}
		System.out.println();
		// TODO 自動生成されたメソッド・スタブ

	}

}
