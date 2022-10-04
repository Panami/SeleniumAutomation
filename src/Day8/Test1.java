package Day8;

interface A
{
	int a=10;          //by default variable i interface are static and final
	void m1();         //abstract method, by default public
}


public class Test1 implements A
{
	public void m1()
	{
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Test1 t=new Test1();
//		t.m1();
		
		A a=new Test1();
		a.m1();
	}

}
