import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangamesh\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.name("name")).sendKeys("Rahul");
		driver.findElement(By.name("email")).sendKeys("rahul@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("rahul123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement Dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(Dropdown);
		dropdown.selectByVisibleText("Male");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("01/01/1994");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	}

}
