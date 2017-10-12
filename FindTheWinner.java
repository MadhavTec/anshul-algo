package com.test.study;

public class FindTheWinner {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 2, 1, 3 };
		String s = "Odd";
		System.out.println(winner(a, b, s));
	}

	static String winner(int[] andrea, int[] maria, String s) {
		int sumAndrea = 0;
		int totAndrea = 0;
		int sumMaria = 0;
		int totMaria = 0;
		for (int i = 0; i < andrea.length; i++) {
			if (s.equals("Even")) {
				if (i % 2 == 0) {
					sumAndrea = andrea[i] - maria[i];
					sumMaria = maria[i] - andrea[i];
					totAndrea = sumAndrea + totAndrea;
					totMaria = sumMaria + totMaria;
				}
			} else if (s.equals("Odd")) {
				if (i % 2 != 0) {
					sumAndrea = andrea[i] - maria[i];
					sumMaria = maria[i] - andrea[i];
					totAndrea = sumAndrea + totAndrea;
					totMaria = sumMaria + totMaria;

				}
			}
		}
		System.out.println(totAndrea);
		System.out.println(totMaria);
		if (totAndrea > totMaria) {
			return "Andrea";
		} else {
			return "Maria";
		}

	}

}
