package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v127.input.model.DragData;

public class WebElementCommands extends Base

{

	public void locators()
	{
		
	WebElement showMessagebutton =	driver.findElement(By.id("button-one"));
	WebElement className=           driver.findElement(By.className("clearfix"));
	WebElement name=                driver.findElement(By.name("viewport"));
	WebElement tagName=             driver.findElement(By.tagName("header"));
	WebElement linkTextsample=      driver.findElement(By.linkText("Checkbox Demo"));
	WebElement partialLinkvariable= driver.findElement(By.partialLinkText("Checkbox"));

	
	WebElement collaps=driver.findElement(By.id("collapsibleNavbar"));
	WebElement singleInputfield= driver.findElement(By.id("single-input-field"));
	WebElement enterValuetexta= driver.findElement(By.id("value-a"));
	WebElement getTotal =driver.findElement(By.id("button-two"));

	
	WebElement menuBarclassname =driver.findElement(By.className("navbar-toggler-icon"));
	WebElement obsquraClass =driver.findElement(By.className("header-top"));
	
	
	WebElement menuBartag=driver.findElement(By.tagName("span"));
	WebElement getTotaltag=driver.findElement(By.tagName("button"));
	WebElement toataltag=driver.findElement(By.tagName("div"));
	WebElement enterValuetag=driver.findElement(By.tagName("input"));
	WebElement jqueryTag=driver.findElement(By.tagName("a"));
	

	WebElement singleFormlink=driver.findElement(By.linkText("Simple Form Demo"));
	WebElement radioButtonlink=driver.findElement(By.linkText("Radio Buttons Demo"));
	WebElement selectInputlink=driver.findElement(By.linkText("Select Input"));
	WebElement jqueryLink=driver.findElement(By.linkText("Jquery Select2"));
	
	
	WebElement partialLink1=driver.findElement(By.partialLinkText("Radio Buttons "));
	WebElement partialLink2=driver.findElement(By.partialLinkText("Ajax Form "));
	WebElement partialLink3=driver.findElement(By.partialLinkText("Simple Form"));

    WebElement xpath1=driver.findElement(By.xpath("//button[@id='button-one']"));
    WebElement xpath2=driver.findElement(By.xpath("//button[@id='button-two']"));
    WebElement xpath3=driver.findElement(By.xpath("//div[@id='message-one']"));
    WebElement xpath4=driver.findElement(By.xpath("//div[@id='message-two']"));
    WebElement xpath5=driver.findElement(By.xpath("//input[@id='value-b']"));
    WebElement xpath6=driver.findElement(By.xpath("//input[@id='value-a']"));
    
    WebElement xpathCon=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
    WebElement xpathCon1=driver.findElement(By.xpath("//button[contains(@id,'button-two')]"));		
	WebElement xpathCon2=driver.findElement(By.xpath("//div[contains(@id,'message-two')]"));
	WebElement xpathCon3=driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
	WebElement xpathCon4=driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
	
	
	WebElement startsWith1=driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
	WebElement startsWith2=driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
	WebElement startsWith3=driver.findElement(By.xpath("//div[starts-with(@id,'message-o')]"));
	WebElement startsWith4=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
	WebElement startsWith5=driver.findElement(By.xpath("//a[starts-with(@href,'check-box-')]"));
	
	
	WebElement text1=driver.findElement(By.xpath("//button[text()='Get Total']"));
	WebElement text2=driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebElement text3=driver.findElement(By.xpath("//a[text()='Jquery Select2']"));
	WebElement text4=driver.findElement(By.xpath("//a[text()='Ajax Form Submit']"));
	WebElement text5=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
	
	
	// and xpath
	WebElement andXpath=driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
	WebElement andXpath1=driver.findElement(By.xpath("//button[@type='button' and @id='button-two' ]"));
	WebElement andXpath2=driver.findElement(By.xpath("//input[@id='single-input-field' and @type='text']"));
	
	// OR xpath
	WebElement orXpath=driver.findElement(By.xpath("//button[@id='button-one' or@id='button-o' ] "));
	WebElement orXpath1=driver.findElement(By.xpath("//div[@id='message-two' or@id='message-t'] "));
	WebElement orXpath2=driver.findElement(By.xpath("//input[@id='value-a'or@id='value']"));
	
	//finding parent
	WebElement findParent=driver.findElement(By.xpath("//button[@id='button-one']/.."));
	WebElement findParent1=driver.findElement(By.xpath("//input[@id=\"single-input-field\"]//.."));
	WebElement findParent2=driver.findElement(By.xpath("//input[@id=\"value-a\"]//.."));
	
	//locate child
	WebElement childFind=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	WebElement childFind2=driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
	
	
	//locate parent
	WebElement parendFind=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
	WebElement parendFind1=driver.findElement(By.xpath("//section[@class='clearfix']//child::ul"));

	
	//following
	WebElement following=driver.findElement(By.xpath("//button[@id='button-two']//following::div[@id='message-two']"));
	WebElement following1=driver.findElement(By.xpath("//div[@id='message-one']//following::button[@class='btn btn-primary']"));
	
	
	//preceding
	WebElement preceding1=driver.findElement(By.xpath("//div[@id='message-one']//preceding::button[@class='btn btn-primary']"));
	
	
	//ancistors
	WebElement precedin2=driver.findElement(By.xpath("//div[@id='message-one']//preceding::div"));//all findings are shown 16numbers
	WebElement ancestor=driver.findElement(By.xpath("//div[@id='message-one']//ancestor::div"));//only ancestors are shown 7numbers
	
	
	//css selector ID
	
	WebElement cssId=driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement cssId1=driver.findElement(By.cssSelector("button#button-one"));
	WebElement cssId2=driver.findElement(By.cssSelector("input#value-a"));
	
	//css selector class
	WebElement cssClass=driver.findElement(By.cssSelector("section.clearfix"));
	
	
	}
	
	
	public void webElementCommands()
	{
		WebElement singleInputTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));	
		singleInputTextField.sendKeys("hello");
		//WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		//showMessage.
		WebElement showMessagebutton =	driver.findElement(By.id("button-one"));
		showMessagebutton.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourText=yourMessage.getText();
		 singleInputTextField.clear();
		String backGroundColor=showMessagebutton.getCssValue("background-color");
		String fontWeight=showMessagebutton.getCssValue("font-weight");
		boolean isShowMessagebuttonDispled=showMessagebutton.isDisplayed();
	    boolean isShowMessagebuttonEnable= showMessagebutton.isEnabled();
		
	 // String expButtonColor = (Color.fromString(hex).asRgba());
	}
	
	public static void main(String[] args) 
	{
		
		WebElementCommands webelementscommands=new WebElementCommands();
		webelementscommands.initialiseBrowser();
		webelementscommands.webElementCommands();
		webelementscommands.driverQuit();

		
	}

}
