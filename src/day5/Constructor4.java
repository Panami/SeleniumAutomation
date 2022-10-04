package day5;

public class Constructor4 {

	
	int x;
	int y;

	Constructor4()     //default  Constructor
	{
	x=50;
	y=80;
	}
	
	void disply()
	{
		System.out.println(x+y);
	} 
	
	Constructor4(int a, int b)    //parameter Constructor
	{
		x=a;
		y=b;
	}
	void dis()
	{
		System.out.println(x+y);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor4 cm1=new Constructor4();   //invoke default  Constructor
		cm1.disply();
		
		Constructor4 cm2=new Constructor4(10,20);    //invoke parameter  Constructor
		cm2.dis();
	}

}
