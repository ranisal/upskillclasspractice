package come.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;

public class Javaarry_hashmap_has_set {

	public static void main(String[] args) {
		
		// array store multiple values at one time
		int a = 10; // store one value at time
		int []agewolvorine= new int [] {20,24,30 ,35, 40};
		// array index =                [0],[1],[2],[3],[4]
		System.out.println("student age:"+ agewolvorine[4]);
		System.out.println("total students:"+ agewolvorine.length);
		
		String[]namewolverine=new String[] {"rani","warda","hani","sadaf"};
		System.out.println("studentname:"+ namewolverine[2]);
		
		System.out.println("student_name:"+namewolverine[3]);
		System.out.println("totalname:"+namewolverine.length);
				
		// multi diamentional array
		
		
		
				// hashmap store muultiple data using key value pair,implimentation of map interface
		HashMap<String,Integer> student= new HashMap<String, Integer>();
		student.put("naeem", 20);
		student.put("salman", 30);
		student.put("saleem", 23);
		student.put("amandeep", 27);
		student.put("omar", 29);
		System.out.println("student age:"+student.get("omar"));
		System.out.println("Student age:"+ student.get("saleem"));
		System.out.println("student age:"+ student.get("amandeep"));
		System.out.println("student age:"+ student.get("naeem"));
		
		HashMap<String,String> countries= new HashMap<String,String>(); // DEFINE DATA TYPES with import of hashmap .util package
		
		countries.put("Pakistan","Islamabad");
		countries.put("India","NewDehli");
		countries.put("Bangladash","Dhaka");
		countries.put("USA","DC");
		System.out.println("Capital name is:"+countries.get("India"));
		System.out.println("Capital name is:"+countries.get("USA"));
		System.out.println("Capital name is :"+ countries.get("Pakistan"));
		
		// hashset stores multiple unordered . unique collection, implimentaion of set interface
		HashSet <String> car= new HashSet<String>();
		car.add("ford");
		car.add("BMW");
		car.add("Prius");
		car.add("Tesla");
		System.out.println("my favourite cars are:"+car);
		HashSet<String> cities= new HashSet<String>();
		cities.add ("Karachi");
		cities.add("Islamabad");
		cities.add("Newyork");
		cities.add("virginia");
		System.out.println("my favourite cities :"+ cities);
		
		
		
		}
	}


