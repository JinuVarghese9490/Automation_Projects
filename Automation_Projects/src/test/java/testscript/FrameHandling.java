package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandling extends Base
{
	
	public void frameHanding()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		int size=driver.findElements(By.tagName("iframe")).size();
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		
		
		//implict wait 6
	    //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	     //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='a077aa5e']")));
		
		
		//driver.switchTo().frame(iframe);
		driver.switchTo().frame(2);//index
		//driver.switchTo().frame("a077aa5e");//value of name tag
		
		WebElement image=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		image.click();
		
		
	}
	
	

	public static void main(String[] args)
	{
		FrameHandling framehandling=new FrameHandling();
		framehandling.initialiseBrowser();
		framehandling.frameHanding();
		framehandling.driverQuit();

	}

}
