package Day7;

class H              //H is parent class
{
	int h;
	void display()
	{
	System.out.println(h);
	}
}

class Q extends H     //Q is child class, H is parent class
{
	int q;
	void print()
	{
	System.out.println(q);
	}
}
class Z extends Q     //Z is child class, Q is parent class
{
	int z;
	void show()
	{
	System.out.println(z);
	}
}


public class InheritenceMultilevel2 {
	public static void main(String[] args) {

		
	/*	H aj=new H();     
		aj.h=10;               //A
		aj.display();  */
		
	/*	Q bj=new Q();
		bj.h=20;               //A
		bj.q=30;               //B
		
		bj.display();
		bj.print();   */
		
		Z cj=new Z();
		cj.h=10;                //A
		cj.q=20;                //B
		cj.z=30;                //C
		
		cj.display();
		cj.print();
		cj.show();
		
		
		
		
		
		
		
}
}