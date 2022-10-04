package day5;

public class Student2 {


	int sid;
	String sname;
	char grade;
	
	
	Student2(int id, String name, char g)     //Constructor
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	
	void getvalues (int id, String name, char g)         //method
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	
	void display()
	{
		System.out.println(sid+" "+sname+" "+grade);
	}
	

	}


