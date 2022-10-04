package Day6;

public class MethodOverLoading1 {

	
	void add(int a, int b)  //1
	{
		System.out.println(a+b);
	}
	
	void add(int a, double b)  //2
	{
		System.out.println(a+b);
	}
		
	void add(double a, double b)  //3
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b,int c)  //4
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverLoading1 mo=new MethodOverLoading1();
		mo.add(10, 30);      //1 ans-40
		mo.add(10, 30, 90);  //4 ans-130
		mo.add(10, 20.5);    //2 ans-30.5
		mo.add(10.8, 55.6);  //3 ans-66.4
	}

}
