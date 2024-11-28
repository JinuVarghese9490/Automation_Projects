package testscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		
		//implicit wait example 2
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@role='button']//parent::div")));
		
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
	
	public void webDriverUniversityDropdown()
	{
		
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement language=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		
		//Explicit wait  
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@id='dropdowm-menu-1']")));
		
		Select select=new Select(language);
		select.selectByIndex(2);
		select.selectByValue("sql");
		select.selectByVisibleText("JAVA");
		
	}
	
	public static void main(String[] args) 
	{
		DropDown dropdown=new DropDown();
	    dropdown.initialiseBrowser();
		dropdown.dropDownSample();
		dropdown.seleniumDropDown();
		//dropdown.webDriverUniversityDropdown();
		dropdown.driverQuit();
	
		

	}

}
