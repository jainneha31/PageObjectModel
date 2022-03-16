package POMPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolTip
{
    WebDriver driver;
    
    @FindBy(xpath="//a[@title='Coding Ground - Free Online IDE and Terminal']")
	private WebElement codingground;
    
    
	@FindBy(xpath="//span[contains(text(),'Coding Ground')]")
	private WebElement Actionperform;;
	
	
	public ToolTip(WebDriver  driver)
	{
		this.driver=driver;
	  PageFactory.initElements(driver , this);

	}

	
	public void ActionClass() {
		
		Actions act = new Actions(driver);
		act.moveToElement(Actionperform).perform();
	}
	
	public void Tooltip()
	{
		
		String tooltip=codingground.getAttribute("title");
		
		
		if(tooltip.contains("Coding Ground"))
		{
			
			System.out.println("tooltip is matching with expected value");
		}
		
		else
		{
			System.out.println("tooltip is not matching with expected value");
		}	
	}
}
