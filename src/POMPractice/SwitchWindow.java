package POMPractice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchWindow 
{
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@class=' red ctrTrackShow ctr-track-show ctr-track'])[2]")
	
	private WebElement Wintersalelink;
		
	public SwitchWindow(WebDriver driver)
	{
		this.driver=driver;
		 PageFactory.initElements(driver,this);
    }
	
	public ChildBrowser clickwinter()
	{
		
		Wintersalelink.click();
		return new ChildBrowser(driver);
	
     }
	
	

	
	
	

}
