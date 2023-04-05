package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, prize;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a==b && b==c) {
			prize = 10000+a*1000;
			System.out.print(prize);
		}else if ((a==b && b!=c) || (a==c && b!=c) || (b==c && a!=b)) {
			if (a==b && b!=c) {
				prize = 1000+a*100;
				System.out.print(prize);
			}else if (a==c && b!=c) {
				prize = 1000+a*100;
				System.out.print(prize);
			}else if (b==c && a!=b){
				prize = 1000+b*100;
				System.out.print(prize);
			}
		}else {
			if (a>b && a>c) {
				prize = a*100;
				System.out.print(prize);
			}else if (b>a && b>c) {
				prize = b*100;
				System.out.print(prize);
			}else if (c>a && c>b) {
				prize = c*100;
				System.out.print(prize);
			}
		}
	}
}
