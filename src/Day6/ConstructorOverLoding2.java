package Day6;

public class ConstructorOverLoding2 {

	ConstructorOverLoding2(int a,int b)  //1
	{
		System.out.println(a+b);
	}
	
	ConstructorOverLoding2(int a,double b)  //2
	{
		System.out.println(a+b);
	}
	ConstructorOverLoding2(double a,int b)   //3
	{
		System.out.println(a+b);
	}
	
	ConstructorOverLoding2(int a,int b,int c)   //4
	{
		System.out.println(a+b+c);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverLoding2 cm1=new ConstructorOverLoding2(10,20);  //1 ans-30
		ConstructorOverLoding2 cm2=new ConstructorOverLoding2(10,20,30);  //4 ans-60
		ConstructorOverLoding2 cm3=new ConstructorOverLoding2(10.95,20);   //3 ans-30.95
		ConstructorOverLoding2 cm4=new ConstructorOverLoding2(10,20.5);   //2 ans-30.5
	}

}
