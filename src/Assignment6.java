import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangamesh\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String abc = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropDown);
		s.selectByVisibleText(abc);
		driver.findElement(By.name("enter-name")).sendKeys(abc);
		driver.findElement(By.id("alertbtn")).click();
		String alertbtn = driver.switchTo().alert().getText();
		if(alertbtn.contains(abc))
		{
			System.out.println("alertbtn success");
		}
		else
		{
			System.out.println("alertbtn fail");
		}

			
	}
	
}
			
			




