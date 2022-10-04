package Day7;

public class animal5 {

	String colour = "black";

	void eating()
	{
		System.out.println("Eating...");
	}
	
	
	animal5()
	{
		System.out.println("animal is created");
		
	}
}

class dog extends animal5 {
	String colour = "white";

	dog()
	{
		System.out.println("dog is barking");
	}
	
	
	
	/* void displaycolour()
	 *  {
		System.out.println(colour);
		System.out.println(super.colour); 
	}   */

	/*	void eating()
		{
			System.out.println("Eating bread....");
			super.eating();
		}  */
	
	}
