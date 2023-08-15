package OrangeWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHrm2 {
	
	WebDriver driver;
	WebDriverWait 	
wait;
	Actions act;
	
	@BeforeTest()
	public void setup()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baran\\eclipse-workspace\\COM\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		act = new Actions(driver);
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	}
	@Parameters({"usname","passwrd"})
	@Test()
	public void login(String uname,String passwrd) 
	
	
	
	{
		WebElement username =driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		username.sendKeys(uname);
		password.sendKeys(passwrd);
		loginbutton.click();
		boolean hrmdisplay = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")).isDisplayed();
		Assert.assertTrue(hrmdisplay);
	}
	 
	   @Test()
	   public void logoutchek() throws InterruptedException
	   {
		   WebElement admin =driver.findElement(By.cssSelector(".oxd-userdropdown"));
		   act.moveToElement(admin).click().build().perform();
		   

		   WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		   	   
		   wait.until(ExpectedConditions.visibilityOf(logout));
		   act.moveToElement(logout).click().build().perform();
		   
		   Thread.sleep(2000);
		  
		   
		   
	   }
	   
	
	 
	   @AfterTest
	   public void teardown()
	   
	   
	   {
		 driver.manage().window().minimize();
		   
		   
	   }
	   
	   
	

}
