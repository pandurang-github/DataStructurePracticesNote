package com.ds.note;

import java.util.Scanner;

//=====================================================================================
class BirthdayCakeCandle{
	public static int birthdayCakeCandle(int[] ar) {
		int maxCandleHeight = Integer.MIN_VALUE;
		int maxCandleCount = 0;
		for(int i =0;i<ar.length;i++) {
			if(ar[i] == maxCandleHeight) {
				maxCandleCount++;
			}
			if(ar[i]>maxCandleHeight) {
			  maxCandleHeight = ar[i];
			  maxCandleCount = 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i =0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		int result = birthdayCakeCandle(ar);
		System.out.println(result);
	}
}