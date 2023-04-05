package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.print("1");
		} else if(x<0 && y>0) {
			System.out.print("2");
		} else if(x<0 && y<0){
			System.out.print("3");
		} else if(x>0 && y<0){
			System.out.print("4");
		}
	}
}
