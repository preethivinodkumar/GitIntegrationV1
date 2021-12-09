package SeleniumCICD.GitIntegrationV1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToOrangeHRM {
	public WebDriver driver;
	public WebElement username, password, login;
	public String baseUrl = "https://opensource-demo.orangehrmlive.com/";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Preethi_Automation\\Selenium\\Chrome95\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void loginToOrangeHRM()
	{
		username = driver.findElement(By.id("txtUsername"));
		password = driver.findElement(By.id("txtPassword"));
		login = driver.findElement(By.id("btnLogin"));
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();
	}
	
	@AfterTest
	public void cleanup()
	{
		driver.quit();
	}
}
