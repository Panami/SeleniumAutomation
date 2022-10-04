import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractingUsrname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangamesh\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String username = getusername(driver);
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.name("username")).sendKeys(username);

	}

	public static String getusername(WebDriver driver) {
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		String usernametext = driver.findElement(By.tagName("p")).getText();

		System.out.println(usernametext);
		String[] usernameArray = usernametext.split("is");
		String username = usernameArray[1].trim().split("and")[0].trim();
		System.out.println(username);
		return username;

	}

}
