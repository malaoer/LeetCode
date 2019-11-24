package com.ultimate.interview;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * 微信红包 微信红包金额是随机数
 * 
 * 只不过这个随机数有限制：精确到两位小数；最小金额是0.01；
 * 
 * 不能超发，就是你发了3块钱红包最后红包总额不能超过3块。先抢和后抢的收益均值要大致相同
 * @author malaoer
 *
 */
public class WeiXin_RedPacket2 {
	public static void main(String[] args) {
		Double sum = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("输入金额：");
		Double totalMoney = scan.nextDouble();
		System.out.println("输入人数：");
		int peopleNum = scan.nextInt();
		ArrayList<Double> res = WX_RedPacket(totalMoney,peopleNum);
		for (Double double1 : res) {
			int i = 0;
			sum+=double1;
			System.out.println("第"+i+"人抢到"+double1+"元");
		}
		System.out.println(sum);
	}
	private static ArrayList<Double> WX_RedPacket(double totalmoney,int peopleNum){
		ArrayList<Double> res = new ArrayList<Double>(peopleNum);
		Random rand = new Random();
		while(peopleNum>1) {
			
		}
		res.add(totalmoney);
		return res;
	}

}
