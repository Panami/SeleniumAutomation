import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction13 {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome- ChromeDriver ->Methods close get
		//Firefox- FirefocDriver ->Methods close get
		//Safari- SafariDriver ->Methods close get
		//WebDriver close get
		//WebDriver methods+class methods
		
		//  chromedriver.exe->Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangamesh\\Documents\\chromedriver.exe");
		
		//webdriver.chrome.driver->value of path
	    WebDriver driver = new ChromeDriver();
	    
	    
	    //firefox Lunch
	    //geckodriver
	    
	    
	    //webdriver.gecko.driver  
	    //System.setProperty("webdriver.gecko.driver", "C:\\Users\\sangamesh\\Documents\\geckodriver.exe");
	  //  WebDriver driver = new FirefoxDriver();
	    
	    	 	   	    
	    //driver.get("https://courses.rahulshettyacademy.com/");
	    driver.get("https://courses.rahulshettyacademy.com/");
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.close();
	    //driver.quit();
		
		
		
	}

}
