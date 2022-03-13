import java.util.ArrayList;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr2={1,2,4,5,6,7,8,9,1,122};
		
//		chech if arry has divide by 2
		for(int i=0; i<arr2.length;i++)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			} 
			else
			{
				System.out.println(arr2[i]+"is not divide of 2");
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("cademy");
		a.add("selenium");
		System.out.println(a.get(3));
		
		
	
	}
}
       