package OrangeWeb;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	WebDriver driver;
	@Test
	public void testcase1()
	{
		System.out.println("This is testcase1 :" +Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baran\\eclipse-workspace\\COM\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.automationtestinginsider.com/");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("This is testcase2 :" +Thread.currentThread().getId());
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baran\\eclipse-workspace\\COM\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

}
