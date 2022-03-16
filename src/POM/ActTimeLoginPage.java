package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActTimeLoginPage 
{
	//Declaration
	public WebDriver driver;
	
  @FindBy(id="username")
  private WebElement usernameTextfield;
  
  @FindBy(xpath="//input[@name='pwd']")
  private WebElement passwordTextfield;
  
  @FindBy(id="keepLoggedInCheckBox")
  private WebElement KeepmeLoggedincheckbox;
  
  
  @FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	

//utilization
	
public ActTimeLoginPage (WebDriver  driver)
{
	this.driver=driver;
PageFactory.initElements(driver , this);

}
	
	public ActitimeHomePage LoginMethod() throws InterruptedException 
	{
		usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		KeepmeLoggedincheckbox.click();
		loginButton.click();
		return new ActitimeHomePage(driver);
}
	
	public void forgotyourpasswordMethod()
	{
		
		forgotyourpasswordLink.click();
	}
	
	
	
	public void actitimeincMethod()
	{
		actitimeincLink.click();
		
	}
	
	
	}
	
	
	


