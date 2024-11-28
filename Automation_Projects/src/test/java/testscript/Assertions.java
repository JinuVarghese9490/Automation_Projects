package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions extends testNGBase
{
@Test
	public void assertSample()
	{
	//hard assert
		int a=5;
		int b=5;
		assertEquals(a,b,"a and b are not equal");
		
		WebElement getTotalElement=driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean isGetTotalButtonAvailable=getTotalElement.isDisplayed();
		assertTrue(isGetTotalButtonAvailable,"get total button is not avilable");
		
		boolean flag=false;
		assertFalse(flag,"expected value is false but it is true");
		
		String s=null;
		assertNull(s,"string is not null");
		
		String s1="ab";
		assertNotNull(s1,"string is null");
		
		
	}

@Test

public void softAssert()
{
	
	int a=5;
	int b=5;
	
	SoftAssert softassert=new SoftAssert();
	softassert.assertEquals(a,b,"a and b are not equal");
	
	WebElement getTotalElement=driver.findElement(By.xpath("//button[@id='button-two']"));
	boolean isGetTotalButtonAvailable=getTotalElement.isDisplayed();
	softassert.assertTrue(isGetTotalButtonAvailable,"get total button is not avilable");
	
	boolean flag=false;
	softassert.assertFalse(flag,"expected value is false but it is true");
	
	String s=null;
	softassert.assertNull(s,"string is not null");
	
	String s1="ab";
	softassert.assertNotNull(s1,"string is null");
	
	softassert.assertAll();
	


}




@Test
public void verifyTwoInputField()
{
	
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	int enterValueA=2500;
	int enterValueB=7500;
	int expectedValue=enterValueA+enterValueB;
	
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
     
     assertEquals(expectedValue,actualValue,"Expected total is "+expectedValue+"but it is "+totalAB);
  
}

	
}
