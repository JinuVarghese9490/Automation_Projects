package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxAndRadioButton extends Base
{
	
	public void checkBox()
	{
		
		WebElement checkBoxDemo=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		checkBoxDemo.click();
	   
		WebElement clickOnThisCheckBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		clickOnThisCheckBox.click();
		boolean isCheckBoxSelected=	clickOnThisCheckBox.isSelected();
		
		WebElement checkBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		checkBoxOne.click();
		boolean isCheckBoxOneSelected=checkBoxOne.isSelected();
		
		WebElement checkBoxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		checkBoxTwo.click();
		boolean ischeckBoxTwoSelected=checkBoxTwo.isSelected();
		
		WebElement checkBoxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		checkBoxThree.click();
		boolean ischeckBoxThreeSelected=checkBoxThree.isSelected();
		
		WebElement checkBoxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		checkBoxFour.click();
		boolean checkBoxFourSelected=checkBoxFour.isSelected();
		
	}
	
	public void radioButton()
	{
		WebElement radioButtonsDemo=driver.findElement(By.linkText("Radio Buttons Demo"));
		radioButtonsDemo.click();	
		WebElement maleButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleButton.click();	
		WebElement femaleButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		femaleButton.click();	
		WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue.click();
	  }
	
	
	
	public void universityRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton=driver.findElement(By.xpath("//input[@value='green']"));
		radioButton.click();
		boolean green=radioButton.isSelected();
		
		
		WebElement radioButtonOrange=driver.findElement(By.xpath("//input[@value='orange']"));
		radioButtonOrange.click();
		boolean orange=radioButtonOrange.isSelected();
		
	}

	public static void main(String[] args) 
	{
		CheckBoxAndRadioButton checkboxradiobutton=new CheckBoxAndRadioButton();
		checkboxradiobutton.initialiseBrowser();
		//checkboxradiobutton.checkBox();
		//checkboxradiobutton.radioButton();
		checkboxradiobutton.universityRadioButton();
		checkboxradiobutton.driverQuit();

	}

}
