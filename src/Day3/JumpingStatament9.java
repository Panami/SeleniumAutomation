package Day3;

public class JumpingStatament9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1;i<10;i++)
		{
			if(i==5)
			{
				System.out.println(i);       //5
				break;
			}
		}
		
		for(int i=1;i<10;i++)
		{
			if(i==6)
			{
			   break;
			}
			System.out.println(i);          //1 2 3 4 5
		}
		
		for(int i=1;i<10;i++)
		{
			if(i==5)
			{
			   continue;
			}
			System.out.println(i);         //1 2 3 4 6 7 8 9
		}
		
		for(int i=1;i<10;i++)
		{
			if(i==3 || i==6 || i==8)
			{
			   continue;
			}
			System.out.println(i);         //1 2 4 5 7 9
		}   
	}

}
