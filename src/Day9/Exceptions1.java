package Day9;

public class Exceptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program is started");
		System.out.println("program is in progres");
		
		int a=100;
	//	System.out.println(a/0);       //ArithmeticException
		
		try
		{
			System.out.println(a/0); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("entered into catch block");
		}
		
		String s=null;
	//	System.out.println(s.length());    //NullPointerException
		
		try
		{
			System.out.println(s.length()); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("entered into catch block1");
		}
		catch(NullPointerException e)
		{
			System.out.println("entered into catch block2");	
		}
		
		String x="abc";
	//	int i=Integer.parseInt(x);        //NumberFormatException
		
		try
		{
			int i=Integer.parseInt(x);
		}
		catch(Exception e)
		{
			System.out.println("entered into catch block3");
		}
		
		int arr[]=new int[5];
	//	arr[10]=50;                      //ArrayIndexOutOfBoundsException
		
		
		System.out.println("program is complited");
		System.out.println("program is exeted");
	}

}
