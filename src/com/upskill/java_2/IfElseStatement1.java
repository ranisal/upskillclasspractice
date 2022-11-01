package com.upskill.java_2;

public class IfElseStatement1 {
	static int age= 101;

	public static void main(String[] args) {
		age();
		 
	}
 public static void age() {
	 if ( age< 13) {
		  System.out.println("you are children");
	 } else  if ( age> 13  && age <18) {
		  System.out.println("you are Teenager");
	 }
	 else if (age>=60 ){
		//NESTED IF ELSE
		 if (age >100) {
			 System.out.println("you are hero");
		 } else {
		 
		 System.out.println("you are senior");
		 }
	 }else {
		 System.out.println("You are adult");
		 
	 }
 }
}
/*  conditional statement
 *  syntax if(condition){
 *  ---} else {
 *  ----}
 * 
 
  */
