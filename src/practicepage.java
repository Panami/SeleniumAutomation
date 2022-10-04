import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangamesh\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");

		driver.findElement(By.cssSelector(".Register")).click();
		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildid]
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector("div h1")).getText());
		driver.findElement(By.cssSelector("div h1")).getText();
		String name = driver.findElement(By.cssSelector("div h1")).getText().split("&")[1].trim().split(" ")[0];
		driver.switchTo().window(parentID);
		driver.findElement(By.cssSelector("input[placeholder='Enter skills / designations / companies']"))
				.sendKeys(name);
	}

}
