package Day9;

public class FinallyBlock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program is started");
		
		int a=100;
		
		try
		{
			System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println("catch block is entered");
		}
		finally
		{
			System.out.println("finally block entered");
		}
		
		System.out.println("program exited");
		
		
	}

}
