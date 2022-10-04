package day5;

public class calculation3 {
	
	int x=10;
	int y=20;
	
	/*	void sum()                   //case1-not taking parameters and also not returned any value
	{
		System.out.println(x+y);
	}*/
	
	
	/*int sum()                 //case2-not taking parameters but returning value
	{
		return (x+y);
	}*/
	
	/*void sum(int a, int b)       //case3-taking parameters, but not returning any value
	{
		System.out.println(a+b);
	} */
	
	int sum(int a, int b)       //case4-method is taking parameters and also returning values
	{
		return (a+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculation3 cal=new calculation3();
	   /*cal.sum(); */           //case1
		
		
	/*	int res =cal.sum();            //case2
		{
			System.out.println(res);
			System.out.println(cal.sum());
		} */
		
		
		/*cal.sum(100, 200); */       //case3
		
		
		int res=cal.sum(200, 300);             //case4
		System.out.println(res);
		System.out.println(cal.sum(200, 300));
		
	}

}
