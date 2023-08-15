package OrangeWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ulticheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baran\\eclipse-workspace\\COM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ultimateqa.com/automation");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		Thread.sleep(4000);
		System.out.println("Title of the website is " +title);
		
		

	}

}
