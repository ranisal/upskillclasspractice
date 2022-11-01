package com.upskill.java_1;

import java.util.Scanner;

public class Oddeven1 {

	public static void main(String[] args) {
		int n ;
		System.out.println("enter your value");
		Scanner r= new Scanner(System.in);
		n=r.nextInt();
		if (n%2==0) {
			System.out.println("Even number");
		}else
	{
			System.out.println("Odd number");
			}
	}

}
