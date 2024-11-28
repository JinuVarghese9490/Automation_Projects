package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends Base
{

	public void actionHandling()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1=driver.findElement(By.xpath("(//span[@draggable='true'])[1]"));
	
		WebElement coloum=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	
		Actions actions=new Actions(driver);
	//	actions.moveToElement(drag1).build().perform();//for mouse hover
	//	actions.doubleClick(drag1).perform();          //for doubleclick
	//	actions.contextClick(drag1).build().perform(); //for right click
		actions.dragAndDrop(drag1, coloum).build().perform(); //for drag and drop
		
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement singleInputTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		//actions.sendKeys(singleInputTextField,"hello").perform();
		actions.keyDown(singleInputTextField,Keys.SHIFT).sendKeys("hello").perform();//
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		ActionClass actionclass=new ActionClass();
		actionclass.initialiseBrowser();
		actionclass.actionHandling();
		actionclass.driverQuit();

	}

}
