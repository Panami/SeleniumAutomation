package day4;

public class SingleDimArray1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	int a[]=new int[5];    //declared array with size 5, starting index is 0, last index is 4
		//storing or inserting values into array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500; */
		
		int a[]={100,200,300,400,500};  //declare an array without specifying size
		
		System.out.println("Length of an array is:" +a.length);  //print length or size of an array
		
		System.out.println(a[2]);
		
		//clasic for loop
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		//read the value using enhanced for loop
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}

