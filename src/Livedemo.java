import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Livedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangamesh\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		
		//click on column
		driver.findElement(By.xpath("//tr/td[1]")).click();
		
		//capture all webelements into list
		List<WebElement> elementslist=driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all webelement into new (original) list
		
		
		//sort on the original list of styep3 -> sorted list
		
		
		//capture original list vs sorted list
		
		
		
	}

}
