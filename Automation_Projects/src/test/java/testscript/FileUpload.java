package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base
{

	
	public void fileUploadUsingSendKeys()
	{
		
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement file=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		file.sendKeys("C:\\Users\\vargh\\Downloads\\Automation.pdf");
		
	}
	
	public void fileUploadUsingRobotClass() throws AWTException 
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upload=driver.findElement(By.id("pickfiles"));
		upload.click();
		
		  //copy the path to clipboard
		  StringSelection s = new StringSelection("C:\\Users\\vargh\\Downloads\\Automation.pdf");
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null); 

		  Robot robot = new Robot();
          robot.delay(300);
		 
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_V);          //pressing control v for paste the path
	      
	      robot.delay(300);
	      
	      robot.keyRelease(KeyEvent.VK_CONTROL);
          robot.keyRelease(KeyEvent.VK_V);        //Releasing the key
           
	      robot.delay(300);

	      robot.keyPress(KeyEvent.VK_ENTER);      //press the enter key
          robot.keyRelease(KeyEvent.VK_ENTER);    //release the enter key
	    
          robot.delay(90);
	    
}
		
	public static void main(String[] args)
	{
		FileUpload fileupload=new FileUpload();
		fileupload.initialiseBrowser();
		//fileupload.fileUploadUsingSendKeys();
		try 
		{
			fileupload.fileUploadUsingRobotClass() ;
		} 
		catch (AWTException e)
		{
	      e.printStackTrace();
		}
		fileupload.driverQuit();
	}

}
