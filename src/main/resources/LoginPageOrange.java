import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageOrange {
WebDriver driver;
	
	
	By username = By.id("username");
	By pass = By.xpath("//input[@type='password']");
	By login = By.xpath("//button[@type='submit']");
	By logo = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img");
	
	public LoginPageOrange(Webdriver driver)
	{
		this.driver=driver;
	}
	
	
	public boolean LogoValidation()
	{
		driver.findElement(logo).isDisplayed();
		return true;
	}
	
	
	
	
	public Homepage Loginvalidation()
	{
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(pass).sendKeys("admin123");
		driver.findElement(login).click();
		return new Homepage();
	}


}
