package com.test.study;

public class InTheFuture {
	public static void main(String[] args) {
		System.out.println(minNum(1, 5, 1));
	}

	static int minNum(int A, int K, int P) {
		if ((A >= K) && (P >= 0)) {
			return -1;
		} else if ((K - A > 1)) {
			return 1;
		} else if ((P == 1) && (K - A == 1)) {
			return 2;
		}

		return 0;
	}
}
