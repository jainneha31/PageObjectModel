package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task 

{
	public WebDriver driver;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement TaskPageLink;

	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewButton;

	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomerlink;
	
	
	public Task(WebDriver  driver)
	{
		this.driver=driver;
	  PageFactory.initElements(driver , this);

	}
	
	public CreateCustomer Tasksnew()
	{
		TaskPageLink.click();
		AddNewButton.click();
		NewCustomerlink.click();
		return new CreateCustomer(driver);
		
	}
	
}
