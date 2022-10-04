package Day6;

public class ThisKeyword4 {

	int a, b;
	
	void getValues(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void getprintvalues()
	{
	System.out.println(a);
	System.out.println(b);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword4 tk= new ThisKeyword4();
		tk.getValues(100, 200);
		tk.getprintvalues();
	}

}
