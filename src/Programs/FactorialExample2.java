package Programs;

public class FactorialExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4! = 4*3*2*1 = 24  
		//5! = 5*4*3*2*1 = 120 
				
		int i,fact=1;
		int number=5;
		for(i=1;i<=number;i++)
			fact=fact*i;
		{
			System.out.println(fact);
		}
	}

}
