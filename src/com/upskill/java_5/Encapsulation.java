package com.upskill.java_5;

public class Encapsulation {
	/* encapsulation is used to hide data using setter and getter data.
	 * encapsulation hides data by combine 
	 
	 */
	
	private String  name ="Rani";		// write and read
	private int ssn = 2313456;			// read only
	private String username ="ssrani";	// write only
	
	public void setname(String value) {
		name = value;
	}
	public String getName() {
		return name;
	
	}
	
	public void setssn(int value) {
		ssn=value;
	}
	public String getusername() {
		return username;
		
	}
	private String name1= "saif";
	public void setname1(String value) {
		String name1 =value;
	}
	public String getname1() {
		return name1;
	}
	
	public static void main(String[] args) {
		Encapsulation obj= new Encapsulation();
		
		System.out.println(obj.getName());
		obj.setssn(23134562);
		obj.getusername();
		obj.getname1();
		
		System.out.println(obj.getusername());
		System.out.println(obj.getname1());
		
		
	

}
	
	}
