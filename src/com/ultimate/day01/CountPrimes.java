package com.ultimate.day01;

import java.awt.List;
import java.util.Scanner;

/**
 * 统计所有小于整数n的质数的数量
 * @author malaoer
 *
 */
public class CountPrimes {
		
	//我的方法   超时
//	 public int countPrimes1(int n) {
//		int count = 0;
//		
//		for (int i =2;i<n;i++) {
//			List list= new List();
//			int flag = 0; //标志位
//			for (int j=2;j<i;j++) {
//				if (i%j == 0 ) {
//					flag = 1;
//					break;
//				}		
//			}
//			if (flag ==0) {
//				count ++;
//			}	
//		}
//		return count;
//	}
	
	/**
	 * 厄拉多塞筛法
	 * @param n
	 * @return
	 */
	public int countPrimes(int n) {
		boolean[] isPrime = new boolean[n];
		for (int i =2 ;i<n;i++) {
			isPrime[i] = true;
		}
		for(int i = 2; i*i <n; i++) {
			if(!isPrime[i]) {
				continue;
			}
			for (int j = i*i;j<n;j+=i) {
				isPrime[j] = false;
			}
		}
		int count = 0;
		for (int i =2 ;i<n;i++) {
			if(isPrime[i]) {
				count++;
			}
		}	
		return count;
	}
	
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		CountPrimes cp = new CountPrimes();
		System.out.println("输入非负整数n:");
		int count = 0;
		int n = scan.nextInt();
		if (n>0) {
			count = cp.countPrimes(n);
		}
		System.out.println("所有小于非负整数"+ n+"的质数的数量为："+count);
	}

}
