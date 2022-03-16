package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage
{
	public WebDriver driver;

   @FindBy(xpath="//a[.='Enter Time-Track']")
   private WebElement Entertimetracklink;
   
   
   @FindBy(xpath="//a[.='View Time-Track']")
   private WebElement Timetracklink;
   

   @FindBy(xpath="//a[.='Lock Time-Track']")
   private WebElement Locktimetracklink;
   
   @FindBy(xpath="//a[.='Approve Time-Track']")
   private WebElement Approvetimetracklink;
   
   @FindBy(xpath="(//div[@class='popup_menu_icon'])[1]")
   private WebElement Calenderspdropdown;
   
   @FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
   private WebElement Settingdropdown;
   
   @FindBy(xpath="(//div[@class='popup_menu_icon'])[3]")
   private WebElement Integrationdropdown;
   
   @FindBy(xpath="(//div[@class='popup_menu_icon'])[4]")
   private WebElement HelpandSupportdropdown;
   
   @FindBy(xpath ="//a[.='Logout']")
	private WebElement LogoutLink;
	
   //Intialization
   public ActitimeHomePage(WebDriver  driver)
   {
   	this.driver=driver;
   PageFactory.initElements(driver , this);

   }
	
   
   //utilization
	public void Entertime()
	{
		
	}
	
	public void Task() {
		
		
	}
	
	public void LogoutMethod()
	{
	
	LogoutLink.click();
		
	}
	
	
	
}
