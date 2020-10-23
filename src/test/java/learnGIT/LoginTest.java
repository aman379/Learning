package learnGIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest
{
	public static WebDriver driver;
	@BeforeTest
	public  void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void doLogIn() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("whatever");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(2000);
		System.out.println("Adding more codes");
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}