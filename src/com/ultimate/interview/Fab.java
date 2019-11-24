package com.ultimate.interview;

import java.util.Scanner;

/**
 * 斐波那契数列
 * @author malaoer
 *
 */
public class Fab {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fab1(n));
	}
	
	/**
	 * 递归实现
	 */
	public static int fab(int n) {
		
		if(n==1 || n ==2) {
			return 1;
		}else {
			return fab(n-1)+fab(n-2);
		}
		
	}
	
	/**
	 * 非递归实现
	 */
	
	public static int fab1(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		int a = 1;
		int b = 1;
		int c = 0;
		for(int i = 3;i<=n;i++) {
			c = a+b;
			a = b;
			b = c;
		}
		return c;
	}

}
