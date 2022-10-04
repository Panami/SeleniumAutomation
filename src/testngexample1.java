
import org.testng.annotations.Test;

public class testngexample1 {

	
	@Test(priority=2)
	 public void sample()
	 {
		System.out.println("hello");
	 }
	
	@Test(priority=1)
	 public void sample2()
	 {
		System.out.println("hello testng");
	 }
	@Test(invocationCount=4)
	 public void sample3()
	 {
		System.out.println("preeti");
	 }
	@Test(invocationCount=4,priority=3)
	 public void sample4()
	 {
		System.out.println("hey");
	 }
}
