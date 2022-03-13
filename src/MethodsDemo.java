
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodDemo2 d1= new MethodDemo2();
		d1.getuserData();
		getData2();
	
		
	}
     
	public String getData()
	{
		System.out.println("hello world");
		return "rahul shetty";
	}
	
	public static String getData2()
	{
		System.out.println("hello world");
		return "rahul shetty";
	}
	
}
