package com.upskill.java_2;

public class MethodType {
	
	/* 	Types of Methods
	 
		1.Void Method---> you do not have to return data
		2.Static Method--> you do not have create object you can directly call it
		3.Return Type Method --> it must return data  */
	
	public static int hourlyIncome = 65;

	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		System.out.println("My Monthly Income ::: " + obj.monthlyIncomeReturn());
		WeeklyIncomeVoid();

	}
	
	//Void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome *2000;  
		System.out.println("My Annual Income ::: " + calculateAnnualIncome);
	}
	
	//Return Type Method 
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	//Static Void Method
	public static void WeeklyIncomeVoid(){
		int calculateWeeklyIncome = hourlyIncome *40;
		System.out.println("My Weekly Income ::: " + calculateWeeklyIncome);
	}
	
	}
}
