package com.ultimate.day01;

import java.util.Scanner;

/**
 * 求0-n范围之内3和5各项倍数之和
 * @author malaoer
 *
 */
public class Num3_5 {
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++) {
			if(i%3==0||i%5==0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
