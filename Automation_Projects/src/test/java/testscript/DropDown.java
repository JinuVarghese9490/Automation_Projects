package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base


{
	
	
	public void dropDownSample()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(dropDown);
		select.selectByIndex(1);
		select.selectByValue("Yellow");
		select.selectByVisibleText("Green");
		
		
		WebElement multipleDropdown=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select selectMultiple=new Select(multipleDropdown);
		boolean isselectMultiple=selectMultiple.isMultiple();
		selectMultiple.selectByIndex(0);
		selectMultiple.selectByIndex(1);
		selectMultiple.selectByIndex(2);
	    List<WebElement> list=selectMultiple.getOptions();
	
	}

	public void seleniumDropDown()
	{
		driver.navigate().to("https://www.selenium.dev/");
		WebElement dropDownEnglish=driver.findElement(By.xpath("//a[@role='button']//parent::div"));
		dropDownEnglish.click();
		
		List<WebElement> findelements=driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//a"));
		
		for(WebElement option:findelements)
		{
			String text=option.getText();
			if(text.equals("Português (Brasileiro)"))
			{
				option.click();
				break;
			}
		}
		
     }
	
	
	
	public static void main(String[] args) 
	{
		DropDown dropdown=new DropDown();
	    dropdown.initialiseBrowser();
		//dropdown.dropDownSample();
		dropdown.seleniumDropDown();
		
		dropdown.driverQuit();
	
		

	}

}
