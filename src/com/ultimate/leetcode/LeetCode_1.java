package com.ultimate.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_1 {
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = twoSum1(nums,target);
		System.out.println(result[0]+","+result[1]);
	}
	
	public static  int[] twoSum(int[] nums,int target) {
		 
		for(int i=0;i<nums.length-1;i++) {
			for(int j = i+1; j<nums.length ;j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
		
	}
	public static  int[] twoSum1(int[] nums,int target) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<nums.length;i++) {
			map.put(nums[i],i);
		}
		
		for(int i=0;i<nums.length;i++) {
			int another = target - nums[i];
			if(map.containsKey(another) && map.get(another)!=i) {
				return new int[] {i,map.get(another)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	
	

}
