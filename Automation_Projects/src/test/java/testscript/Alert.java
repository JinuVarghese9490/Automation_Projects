package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert extends Base
{
	
	
	
	public void alertSample()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement alertClick1=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		
		
		//Explicit wait example 1
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		alertClick1.click();
		driver.switchTo().alert().accept();
		
		WebElement alertClick2=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		alertClick2.click();
		String text=driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		
		WebElement alertClick3=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		alertClick3.click();
		String text1=driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Jinu");
		driver.switchTo().alert().accept();

		
	}

	public static void main(String[] args)
	{
		Alert alert=new Alert();
		alert.initialiseBrowser();
		alert.alertSample();
		alert.driverQuit();
		
	}

}
