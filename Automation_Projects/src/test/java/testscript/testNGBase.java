package testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testNGBase 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void initialiseBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
		driver.manage().window().maximize();
		
	}
@AfterMethod
	public void driverQuit()
	{
		driver.quit();
	}

	
	
	
}
