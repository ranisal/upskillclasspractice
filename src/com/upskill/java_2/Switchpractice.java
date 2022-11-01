package com.upskill.java_2;

import java.util.Scanner;

public class Switchpractice {

	public static void main(String[] args) {
		int a= 10, b= 20, ch ;
		System.out.println("enter user choice ");
		Scanner r= new Scanner (System.in);
		 ch = r.nextInt();
		 switch(ch) {
		 case 1:
			 System.out.print("sum"+ (a+b));
			 break;
		 case 2:
			 System.out.print("sub"+ (a-b));
			 break;
		 case 3:
			 System.out.print("multi"+ (a*b));
			 break;
			  case 4:
				  System.out.print(" div"+ (a/b));
				 break;
				 default: System.out.print("invalid choice");
		 }
		 
		
			
		}

	}

