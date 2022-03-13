import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangamesh\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//OR
		driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_originStation1_CTNR'] a[value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='MAA']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	//	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());
		//OR
//		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());
//		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
//		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());
		
		//count the number of checkbox
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
//		int i=1;
//		while (i<5);
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//				
		//OR
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select (staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("autosuggest")).sendKeys("chi");
		Thread.sleep(3000);
        java.util.List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("china"))
			{
				option.click();
				break;
			}
		}
			
			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

	private static void getScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
