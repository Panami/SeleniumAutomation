package Day6;

public class StaticExample5 {

	
	static int a=10;   //static variable
	int b=20;         //non-static variable
	
	
	static void m1()
	{
		System.out.println("this is m1-static method");   //static method 
	}
	
	void m2()
	{
		System.out.println("this is m2-non static method");  //non-static method
	}
	
	void m3()
	{
		System.out.println("this m3 method---non-static");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(StaticExample5.a);
		StaticExample5.m1();
		
		//System.out.println(b);    //incorrect bcz b is non-static variable
		//m2();                     //incorrect bcz m2() is non-static method
		
		StaticExample5  se=new StaticExample5();
		System.out.println(se.b);
		se.m2();
		se.m3();
	}

}
