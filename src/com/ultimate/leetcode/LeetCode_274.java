package com.ultimate.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode_274 {
	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		Arrays.sort(citations);
		System.out.println(citations[0]);
		
//		hIndex(citations);
		
	}
	
	public static int hIndex(int[] citations) {
		Arrays.sort(citations); //升序
		
		int i = 0;
		while(i<citations.length&& citations[(citations.length-i-1)]>i) {
			i++;
		}
		return i;
		
		
//		for(int i = citations.length;i>0;i--) {
//			if(citations[i])	
//		}
		
	}

}
