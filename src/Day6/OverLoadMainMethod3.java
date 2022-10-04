package Day6;

public class OverLoadMainMethod3 {

	public void main(int x)   //1
	{
		System.out.println(x);
	}
	
	public void main(int x,int y)  //2
	{
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoadMainMethod3 om=new OverLoadMainMethod3();
		om.main(100);   //1 ans-100
		om.main(200, 500);  //2 ans-700
	}

}
