package day4;

public class MultiDmentinalArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;  */
		
		
		int a[][]={ {100,200} , {300,400} , {500,600} };
		
		System.out.println("Number of rows:" +a.length);
		System.out.println("Number of columns:" +a[0].length);
		
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		
		//clasic for loop
	/*	for(int i=0;i<a.length;i++)  ///outer for loop
		{
			for(int j=0;j<a[i].length;j++)   //inner for loop
			{
				System.out.println(a[i][j]);
			}
		}  */

		//Advanced for loop/Enhanced for loop/for each loop
		for(int r[]:a)
		{
			for(int t:r)
			{
				System.out.println(t);
			}
		
		}
		
		
		
		
		
		
	}

}
