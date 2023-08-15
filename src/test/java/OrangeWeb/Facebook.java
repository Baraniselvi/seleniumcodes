package OrangeWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
	

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baran\\eclipse-workspace\\COM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void login()
	{
          driver.findElement(By.id("email")).sendKeys("");
          driver.findElement(By.name("pass")).sendKeys("");
          driver.findElement(By.name("login")).sendKeys("");
		
	}

}
