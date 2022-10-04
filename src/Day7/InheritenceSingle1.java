package Day7;

class A              //A is parent class
{
	int a;
	void display()
	{
	System.out.println(a);
	}
}

class B extends A     //b is child class A is parent class
{
	int b;
	void print()
	{
	System.out.println(b);
	}
}



public class InheritenceSingle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*A aj=new A();
		aj.a=100;
		aj.display(); */
		
		B bj=new B();
		bj.a=10;    //A
		bj.b=20;    //B
		
		bj.display();   //A
		bj.print();      //B
		
	}

}
