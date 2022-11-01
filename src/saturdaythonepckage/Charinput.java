package saturdaythonepckage;

import java.util.Scanner;

public class Charinput {

	public static void main(String[] args) {
		char ch;
		System.out.print("print char");
		Scanner r= new Scanner(System.in);
		ch=r.next().charAt(0);

		System.out.print(ch);
	}

}
