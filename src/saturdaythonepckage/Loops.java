package saturdaythonepckage;

public class Loops {

	/* REPITIVE CODE
	 * FOR LOOP 
	 * WHILE LOOP
	 * DO WHILE LOOP
	 * INFINITE LOOP
	 *
	 */

	public static void main(String[] args) {
		practiceForLoop();
		practiceDoWhileLoop();
		practiceInfinteLoop();
		
	}
	
		public static void practiceForLoop() {
			int i;
			for (i = 1;i<=100; i++) {
				System.out.println(i);
			}
			
		}
	
public static void practiceWhileLoop(){     // do again and again upto condition match
	int i= 1;
	while (i<=100) {
   System.out.println(i);
		i++;
	}

} 
public static void practiceDoWhileLoop(){  /// do action first and then check for condition
	int i  = 1 ;
	do {System.out.print("do while loops number =" +i);
	i++;}
	while (i<=100);
}
	


public static void practiceInfinteLoop() { /// do it infinitely 
	int i;
	for (i= 1;   ;i++){
			System.out.println("for loops numbers= " +i);
       }
}


 public static void practiceNestedloop(){
	 int i; 
	 int j;
	 for ( i = 1; i <=10; i++){
		 for (j =1; j<=10; j++) {
			 int multiplicationTable = i*j;
			 System.out.print(multiplicationTable + "");
		 }
		 System.out.println("");
	 }
		 
	 }
	// git
 //test
	 }
 
