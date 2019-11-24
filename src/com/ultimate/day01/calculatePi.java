package com.ultimate.day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 计算Pi
 * @author malaoer
 *
 */
public class calculatePi {
	//割圆法
	public void cyclotomic(int n) {
		int i,s;
		double k,len;
		i = 0;
		k =3.0;
		len = 1.0;
		s = 6;
		while(i<=n) {
			System.out.printf("第%2d次切割，为正%5d变形，PI=%.24f\n",i,s,k*Math.sqrt(len));
			s*=2;
			len = 2-Math.sqrt(4-len);
			i++;
			k*=2.0;
		}
	}
	
	//蒙特卡罗算法
	public double montePi(int n) {
		int i,sum = 0;
		double PI ;
		double x,y;
		
		Random r = new Random();
		for (i=1;i<=n;i++) {
			x = r.nextDouble();
			y = r.nextDouble();
			if(x*x+y*y<=1) {
				sum++;
			}
		}
		PI = 4.0*sum/n;
		return PI;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入切割次数");
		int n = scan.nextInt();
		calculatePi cp = new calculatePi();
//		cp.cyclotomic(n);
		double PI = cp.montePi(n);
		System.out.println("PI:"+PI);
	}

}
