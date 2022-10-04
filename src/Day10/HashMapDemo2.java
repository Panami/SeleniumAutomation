package Day10;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		//Declare HashMap
		
//		HashMap hm=new HashMap();
		
		HashMap <Integer,String> hm=new HashMap <Integer,String>(); 
		
		//Add element to hashmap
		hm.put(101, "Devid");
		hm.put(102, "Jon");
		hm.put(103, "Scott");
		hm.put(104, "Lov");
		hm.put(105, "Smith");
		
		System.out.println(hm);
		
		//Remove element from hashmap
		hm.remove(102);
		System.out.println("After removing a pair" +hm);
		
		//Read pairs of hashmap
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	
	}

}
