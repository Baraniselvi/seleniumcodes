import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageOrangeTest {
	public WebDriver driver;
	LoginPageOrange lp;
	Homepage home;
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baran\\eclipse-workspace\\COM\\src\\test\\resources\\chromedriver.exe");
		driver = new chromedriver;
		lp = new LoginPageOrange(driver);
			
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	@Test
	public void logoverify()
	
	
	{
		
		boolean flag=lp.LogoValidation();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void loginverify()
	{
		
	
	
		home=lp.LogoValidation();	
	String acturalurl = driver.getCurrentUrl();
	String expecturl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	Assert.assertEqual(acturalurl,expecturl);
	}
	

}
