package com.upskill.java_2;
import java.util.Scanner;


public class Switch3 {

	public static void main(String[] args) {
		int a = 20 , b= 30, ch ;
		System.out.print("enter user choice");
		Scanner obj= new Scanner(System.in);
		 ch=obj. nextInt();
		switch(ch) {
	case 1: 
			System.out.println( " sum" +(a+b));
			break; 
			case 2: 
				System.out.println("sub"+ (a-b));
				break;
		 case 3: 
				System.out.println("multi"+ (a*b));
				break;
		 case 4: 
				System.out.println("div"+ (a/b));
				break;
		
			
			}
		
		
		
		
			

	
	}

}
