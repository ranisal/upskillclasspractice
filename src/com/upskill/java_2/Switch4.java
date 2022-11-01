package com.upskill.java_2;

import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {
		 int a= 20, b= 35,result;
		 System.out.print( "enter your response");
		 Scanner obj= new Scanner(System.in);
		 result= obj.nextInt();
		 switch(result){
		 case 1: System.out.print("sum" + (a+b));
			 break;
		 case 2: System.out.print("sub" + (a-b));
		 break;
		 case 3: System.out.print("multi" + (a*b));
		 break;
		 case 4: System.out.print("div" + (a/b));
		 break;
		 }
		 

	}

}
