package saturdaythonepckage;

import java.util.Scanner;

public class Additionuserinput {

	public static void main(String[] args) {
		int a,b, sum;
		System.out.print("Enter your value");
		Scanner r= new Scanner(System.in);
		a=r.nextInt();
		b= r.nextInt();
		sum = a+b;
		System.out.println("addition "+ sum);
		
	}

}
