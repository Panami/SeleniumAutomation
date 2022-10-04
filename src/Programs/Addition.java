package Programs;

public class Addition {

	
	int x=30, y=30;

	void sum()
	{
		System.out.println(x+y);
	}
	
	Addition()
	{
		System.out.println(x+y);
		System.out.println("inside the default constructor");
	}
	Addition(int a, int b)
	{
		System.out.println(a+b);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition add=new Addition();
//		add.x=10;
//		add.y=20;
		add.sum();
		
				
		int a=10;
		int b=20;
		System.out.println(a+b);
		
		Addition am=new Addition(50,60);
	}

}
