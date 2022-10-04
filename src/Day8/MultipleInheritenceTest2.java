package Day8;

interface ABC
{
	int x=20;
	void m1();
}

interface XYZ
{
	int y=30;
	void m3();
}


public class MultipleInheritenceTest2 implements ABC,XYZ
{

	public void m1()
	{
		System.out.println(x);
	}
	
	 public void m3()
	{
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleInheritenceTest2 mi=new MultipleInheritenceTest2();
			mi.m1();
			mi.m3();
	}

}
