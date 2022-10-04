package Day7;

class parent
{
	int a;
	void display()
	{
	System.out.println(a);
	}
}
	
class child1 extends parent
{
	int b;
	void show()
	{
	System.out.println(b);
	}
}
class child2 extends parent
{
	int c;
	void print()
	{
	System.out.println(c);
	}
}	
	

	public class InheritenceHierarchical3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parent pt=new parent();
		pt.a=10;             //parent
		pt.display();
		
		child1 cl1=new child1();
		cl1.a=10;              //parent
		cl1.b=20;              //child1
		cl1.display();
		cl1.show();
				
		child2 cl2=new child2();
		cl2.a=30;             //parent
		cl2.c=50;             //child2
		cl2.display();
		cl2.print();
		
		
		
		
		
		
	}

}
