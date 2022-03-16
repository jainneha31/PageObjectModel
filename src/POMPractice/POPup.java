package POMPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POPup
{
	public WebDriver driver;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement HiddenPoplink;
	
	
	public POPup(WebDriver  driver)
	{
		this.driver=driver;
	  PageFactory.initElements(driver , this);

	}

	public void hiddenMethod()  
	{
		
		HiddenPoplink.click();
	} 

	
	public void closebrowser()
	{
		driver.quit();
		
	}
	
	}




