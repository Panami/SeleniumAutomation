package Day2;

public class Operaters2 {

	public static void main(String[] args) {
		
		
		//Arithmetic Operators
		int a=10;
		int b=20;
		System.out.println("---------Arithmetic Operators------------");
		System.out.println("sum of a and b is:" +(a+b));
		System.out.println("diff of a and b is:" +(a-b));
		System.out.println("mul of a and b is:"+(a*b));
		System.out.println("div of a and b is:" +(a/b));
		System.out.println("mod div of a and b is:" +(a%b));
		
		//Relational Operators
		System.out.println("---------Relational Operator------------");
		System.out.println(a==b);         //false
		System.out.println(a>b);          //false
		System.out.println(a<b);          //true
		System.out.println(a>=b);         //false
		System.out.println(a<=b);         //true
		System.out.println(a!=b);         //true
		
		//Logical Operators
		boolean x=true;
		boolean y=false;
		System.out.println("---------Logical Operators------------");
		System.out.println(x && y);   //false
		System.out.println(x || y);   //true
		System.out.println( !x );     //false
		System.out.println(!y);       //true
		
		//Increment and Decrement Operators
		System.out.println("---------Increment and Decrement Operators------------");
		a=10;
		a++;           //a=a+1
		System.out.println(a);
		
		b=20;
		b--;           //b=b-1
		System.out.println(b);
	}

}
