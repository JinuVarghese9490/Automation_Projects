package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuterSample extends Base
{

	
	public void javaScriptExecutorSample() 
	{
		
		WebElement showMessagebutton =driver.findElement(By.id("button-one"));
		JavascriptExecutor js = (JavascriptExecutor)driver;//interface
		js.executeScript("arguments[0].click();",showMessagebutton);   //to click showmessage button
		js.executeScript("window.scrollBy(0,350)","");//scrolled from top to bottom
		
		js.executeScript("window.scrollBy(0,-350)","");//scrolled from bottom to top
		
		//WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		//js.executeScript("arguments[0].scrollIntoView();",getTotal);            //scrolled by using an elment
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //scrolled to the end
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		JavaScriptExecuterSample javaexecutorsample=new JavaScriptExecuterSample(); 
		javaexecutorsample.initialiseBrowser();
		javaexecutorsample.javaScriptExecutorSample();
		javaexecutorsample.driverQuit();

	}

}
