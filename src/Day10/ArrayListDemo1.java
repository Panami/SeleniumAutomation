package Day10;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//How to declare an array list
		
		ArrayList list=new ArrayList();                       //we can store any type of element's
//		ArrayList <String> list=new ArrayList <String>();
//		ArrayList <integer> list=new ArrayList <integer>();
		
		//How to add elements/values to array list
		list.add("Jon");
		list.add("Scott");
		list.add("Devid");
		list.add("Jems");
		list.add('A');
		list.add(10);
		
		//Find the size of array list
		System.out.println(list.size());
		System.out.println("Before removing element:" +list);
		
		//Remove elements/values from array list
		list.remove(1);    //Scott
		System.out.println(list.size());
		System.out.println("After removing element:" +list);
		
		//Insert a new element in middle of array list
		list.add(2,"Devid2");
		System.out.println(list.size());
		System.out.println("After adding new element removing element:" +list);
		
		//Read the value from array list
		for(Object s:list)                               //Object type variable can hold any type of value
		{
			System.out.println(s);
		}
		
		
		
		
		
	}

}
