package day4;

public class StringMethods3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="welcome";
		String s1="to java";
		
		System.out.println(s.length());   //length of string
		
		System.out.println(s.concat(s1));  //joining of string
		//or 
		System.out.println(s.concat("to java"));
		
		s= "    welcome    ";
		System.out.println("before trimming string is:" +s);   //trimming the string 
		System.out.println("after trimming string is:" +s.trim());
		
		s="Welcome";
		System.out.println(s.contains("Wel")); //true        //contains the string  upper case and lower case same words should be there 
		System.out.println(s.contains("wel"));//false
		System.out.println(s.contains("com"));//true
		
		
		s="Welcome";
		System.out.println(s.equals("Welcome"));//true     //Comparing strings equals
		System.out.println(s.equals("Wel come"));//false
		System.out.println(s.equals("welcome"));//false
		System.out.println(s.equals("welco"));//false
		
		
		System.out.println(s.equalsIgnoreCase("welcome"));//true    //equalsIgnoreCase if words are same then its true
		System.out.println(s.equalsIgnoreCase("WELCOME"));//true  
		System.out.println(s.equalsIgnoreCase("wel come"));//false
		
		s="Welcome to java";
		System.out.println(s.replace('e', 'A'));    //replacing the characters 
		System.out.println(s.replace("java", "selenium"));
		
		
		s="Welcome";
		System.out.println(s.substring(1,3));  //el     //extracting substring from main string	
		System.out.println(s.substring(2,5));  //lco
		System.out.println(s.substring(0,5));  //Welco
		
		s="WELCOME";
		System.out.println(s.toLowerCase());
		
		s="welcome";
		System.out.println(s.toUpperCase());
		
		
		
		
		
		
	}

}
