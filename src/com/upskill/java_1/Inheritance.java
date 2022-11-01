package com.upskill.java_1;


	public class Inheritance {
	 int a, b, c; 
	 void add() {
		 a= 10; b=20; c= a+b;
		 System.out.println("sum of two numbers : "+c);
	   }
	 
	 
	 void sub()
	 { a= 200;
	 b= 100;
	 c= a-b;
	 System.out.println("subtraction of two numbers:"+c);
		
			
		}
	 
	 }
	class B extends  Inheritance{
		void multi() {
			a= 10 ; b=20;
			c=a*b;
			System.out.println("Multiplcation of two numbers:"+c);
		}
		void div() {
			a= 10 ; b=2;
			c=a/b;
			System.out.println("div of two number:"+c);
		}
	}
	class C extends B{
		void rem() {
//			a= 10; b= 3;
//			c =a%b;
	System.out.println("Remainder of two numbers:"+c);
			System.out.println("test");
		}
	}

	class test{
		
	public static void main(String[] args) {
		
		C r=new C();
		r.add();
		r.sub();
		r.multi();
		r.div();
		r.rem();
				
		}
	


		
	}


