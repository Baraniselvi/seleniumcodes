
package OrangeWeb;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UltimateQa {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	
	
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\baran\\eclipse-workspace\\COM\\src\\test\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://ultimateqa.com/automation");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void testcase1()
	{
		String title = driver.getTitle();
		System.out.println("Title of the website is" +title);
		
		
		
		
		
		
		
	}
	
	

}
