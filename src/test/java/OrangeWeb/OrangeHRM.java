package OrangeWeb;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class OrangeHRM {
	
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
	
	@Test(priority=1)
	public void launchapp()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		boolean image2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
		
	}
	@Test(priority=2)
	public void login() 
	
	
	
	{
		WebElement username =driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbutton.click();
		boolean hrmdisplay = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")).isDisplayed();
		Assert.assertTrue(hrmdisplay);
	}
	
	
	@Test(priority=4)
	public void titletest()
	{
		String actualtitle = driver.getTitle();
		String expectedtitle ="OrangeHRM";
		Assert.assertEquals(actualtitle,expectedtitle);
	}
	@Test(priority=3)
	public void logincheck() {
		String actualurl ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		String expectedurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String title = driver.getTitle();
		System.out.println(title);
		String expectedtitle ="OrangeHRM";
		System.out.println(driver.getCurrentUrl());
		if(title.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("LOGIN SUCESS");
		}
		else
		{
			System.out.println("LOGIN FAILED");
		}
		
		
		
		
		
	}
	@Test
	public void titleorangetext()
	
	{
		
		boolean image = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
		
		
		
	}
	
	
	@Test(priority=5)
   public void title()
   {
	   String title = driver.getTitle();
		System.out.println(title);
	   
   }

   
   @Test(priority=10)
   public void logoutchek() throws InterruptedException
   {
	   WebElement admin =driver.findElement(By.cssSelector(".oxd-userdropdown"));
	   act.moveToElement(admin).click().build().perform();
	   

	   WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
	   	   
	   wait.until(ExpectedConditions.visibilityOf(logout));
	   act.moveToElement(logout).click().build().perform();
	   
	   Thread.sleep(2000);
	  
	   
	   
   }
   
   @Test(priority=7)
   public void searchbox()
   {
	   WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
	   searchbox.sendKeys("PIM");
   }
   @Test(priority=8)
   public void admin() throws InterruptedException
   {
	   WebElement adminbtn = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));
	   adminbtn.click();
	   Thread.sleep(2000);
   }
   @Test(priority=9)
   public void PIM()
   {
	   WebElement pim = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));
	   pim.click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
   
   
   @Test(priority=6)
   public void titledash()
   {
	   boolean dash = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).isDisplayed();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
   }
   
   @AfterTest
   public void teardown()
   
   
   {
	 driver.manage().window().minimize();
	   
	   
   }
   
   
   

}
