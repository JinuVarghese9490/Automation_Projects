package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base
{

	public void tableSample()
	{
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//List <WebElement> tableHeadings=driver.findElements(By.xpath("//table[@id='dtBasicExample']//following::th[@class='th-sm sorting_disabled']"));
		List <WebElement> tableHeadings=driver.findElements(By.xpath("//tr[@role='row']//th"));
		for(WebElement headings:tableHeadings)
		{
			String names=headings.getText();
			System.out.println(names);
			if(names.equals("Salary"))
			{
				
				break;
			}
		}
		
	List<WebElement> findName=driver.findElements(By.xpath("//tr[@class='odd']"));
		for(WebElement identifyName:findName)
		{
			String name=identifyName.getText();
			String expected="Ashton Cox";
			String data=name.substring(0, 10);
			
			if(data.equals(expected))
			{
				System.out.println("The name is present");
			}
			else
			{
				System.out.println("Not present");
			}
		}
		
		
		
	}
	
	public static void main(String[] args) 
	
	{
		TableHandling tablehandling=new TableHandling();
		tablehandling.initialiseBrowser();
		tablehandling.tableSample();
		tablehandling.driverQuit();

	}

}
