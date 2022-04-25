import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.chrome.ChromeOptions;

//import net.jodah.failsafe.internal.util.Assert;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//implicit wait- 5seconds time out
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangamesh\\Documents\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
//		driver.findElement(By.name("username")).sendKeys("rahul");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("rahulshetty");
//		driver.findElements(By.xpath("//div[@class='form-check-inline']/label[2]")).clear();
//		driver.findElement(By.cssSelector("select.form-control")).click();
//		driver.findElement(By.cssSelector("option[value='teach']")).click();
//		driver.findElement(By.xpath("//span[@class='text-white termsText']")).click(); 
//		driver.findElement(By.className("btn")).click();
		System.out.println(driver.findElement(By.xpath("//div/p")).getText());
	//	driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("learning");
		driver.findElement(By.id("signInBtn")).click();
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit amet.");
		
	}
	
	 
	
}


