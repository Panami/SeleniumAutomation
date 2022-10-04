import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangamesh\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("label[class='customradio']:nth-child(2)")).click();
		// Thread.sleep(3000);
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("cancelBtn")));
		driver.findElement(By.id("cancelBtn")).click();
		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));

		Select dropdown = new Select(options);
		dropdown.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> products = driver.findElements(By.cssSelector("div.card-footer button.btn-info"));
		for (int i = 0; i > products.size(); i++) {
			products.get(i).click();
		}
		driver.findElement(By.cssSelector("[class='nav-item active']")).click();
		// driver.findElement(By.partialLinkText("Checkout")).click();

	}

}
