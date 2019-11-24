package com.ultimate.day01;

import java.util.Scanner;

/**
 * 折半查找
 * @author malaoer
 *
 */
public class BinarySearch {
	
	static final int N =10;
	
	public static void quickSort(int array[],int left,int right) {
		int f,t;
		int rtemp,ltemp;
		ltemp = left;
		rtemp = right;
		f = array[(left+right)/2];
	}
	
	public static int binarySearch(int a[],int len,int x) {
		int low,high,mid;
		low = 0;
		high = len -1;
		while(low<=high) {
			mid = (low+high)/2;
			if(x == a[mid]) {
				return mid;
			}
			else if(x<a[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] array = new int[N];
		int x,n,i;
		for(i=0;i<N;i++) {
			array[i] = (int)(100+Math.random()*(100+1));
		}
		
		System.out.println("输入要查找的数");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		n = binarySearch(array, array.length, x);
		if(n<0) {
			System.out.println("未找到");
		}else {
			System.out.println("数据："+x+"位于第"+(n+1)+"位");
		}
	}
}
