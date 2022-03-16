package POMPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandlingFrame 
{
	
	public WebDriver driver;
	@FindBy(xpath="//a[.='iFrame']")
	private WebElement clicklink;
	
	
	@FindBy(xpath="//body[@id='tinymce']")
	private WebElement bodytextfield;
	
	

	public HandlingFrame(WebDriver  driver)
	{
		this.driver=driver;
	  PageFactory.initElements(driver,this);

	}
	
	public void frame()
	{
		
		clicklink.click();
		driver.switchTo().frame("mce_0_ifr");
		bodytextfield.sendKeys("my name is neha");
		driver.switchTo().defaultContent();
	}
	
	
	

}
