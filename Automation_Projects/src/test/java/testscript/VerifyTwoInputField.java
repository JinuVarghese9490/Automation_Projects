package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyTwoInputField extends Base
{

	
	public void verifyTwoInputField()
	{
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		int enterValueA=2500;
		int enterValueB=7500;
		int expectedValue=10000;
		
		String valueA=String.valueOf(enterValueA);
		String valueB=String.valueOf(enterValueB);
		
		
		WebElement elementA=driver.findElement(By.id("value-a"));
		elementA.sendKeys(valueA);
		
		
		WebElement elementB=driver.findElement(By.xpath("//input[@id='value-b']"));
		elementB.sendKeys(valueB);
		
		WebElement getTotalElement=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalElement.click();
		
		WebElement totalABElement=driver.findElement(By.xpath("//div[@id='message-two']"));
		
	     String totalABText=	totalABElement.getText();
	     String totalAB=    totalABText.substring(14);
	     
	     int actualValue=Integer.valueOf(totalAB);
	     
	     if(expectedValue==actualValue)
	       {
	    	   System.out.println("matching data");
	       }
	       else
	       {
	   	   System.out.println("not matching");
	       }
	}
	
	
	public static void main(String[] args) 
	{
		VerifyTwoInputField twoinputfield=new VerifyTwoInputField();
		twoinputfield.initialiseBrowser();
		twoinputfield.verifyTwoInputField();
		twoinputfield.driverQuit();

	}

}
