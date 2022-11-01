package com.upskill.java_1;

import java.util.Scanner;


class Firstclass{
	 void add(){
		 System.out.println("Addition Program \n"); 
			int a, b,c ;
			Scanner r= new Scanner(System.in);
			System.out.println("Enter the Number 1 : ");
			a= r.nextInt();
			System.out.println("Enter the Number 2 : ");
			b= r.nextInt();
			c= a+b;
			System.out.println( "Sum of "+a+ " and "+ b 
					+ "  is  " + c + "\n");
	 }	
}

class Secclass extends Firstclass{
	 void sub() {
		 System.out.println("Subtract Program \n"); 
			int a, b,c ;
			Scanner r= new Scanner(System.in);
			System.out.println("Enter the Number 1 : ");
			a= r.nextInt();
			System.out.println("Enter the Number 2 : ");
			b= r.nextInt();
			c= a-b;
			System.out.println( "Sub of "+a+ " and "+ b 
					+ "  is  " + c + "\n");
	 }
}

public class Inheritance1 {

	public static void main(String[] args) {
		Secclass obj = new Secclass();
		obj.add();
		obj.sub();

	}
 
 }


	
	

