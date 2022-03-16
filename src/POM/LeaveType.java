package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveType 
{
	public WebDriver driver;
	@FindBy(xpath="//div[contains(@class,'popup_menu_button popup_menu_button_settings')]")
	private WebElement settinglink;
	
	
	@FindBy(xpath="//a[contains(text(),'Leave Types')]")
	private WebElement typeofworklink;
	
	
	@FindBy(xpath="//span[contains(text(),'Create Leave Type')]")
	private WebElement leavetypelink;
	
	
	
	@FindBy(xpath="//input[contains(@placeholder,'Leave Type Name')]")
	private WebElement createleavetypetextfield;
	
	
	
	@FindBy(xpath="(//div[@class='arrowDiv'])[6]")
	private WebElement iconlink;
	
	@FindBy(xpath="(//img[@src='/img/default/leave_types/icons/leave_type_1_24bit.png?hash=1846506722'])[2]")
	private WebElement iconimagelink;
	
	@FindBy(xpath="//button[.='archived']")
	private WebElement statuslink;
	
	
	@FindBy(xpath="//span[contains(@class,'buttonTitle')]")
	private WebElement leavetypenamelink;
	
	
	
public LeaveType(WebDriver  driver)
{
	this.driver=driver;
PageFactory.initElements(driver , this);

}


public void leavetypework()
{
	settinglink.click();
	typeofworklink.click();
	leavetypelink.click();
	createleavetypetextfield.sendKeys("hospitalized");
	//iconlink.click();
	//iconimagelink.click();
	//statuslink.click();
	leavetypenamelink.click();
}
	

}

