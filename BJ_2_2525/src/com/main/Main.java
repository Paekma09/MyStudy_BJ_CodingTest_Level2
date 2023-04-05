package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H, M, oven, h, m;
		H = sc.nextInt();
		M = sc.nextInt();
		oven = sc.nextInt();
		
		if (H>0 && H<24) {
			h = ((((H*60)+M)+oven)/60)%24;
			m = (((H*60)+M)+oven)%60;
			System.out.print(h+" "+m);
		} else if (H==0){
			h = ((((24*60)+M)+oven)/60)%24;
			m = (((24*60)+M)+oven)%60;
			System.out.print(h+" "+m);
		}
	}
}
