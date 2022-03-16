package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypeOfWork {
	
	WebDriver driver;

		@FindBy(xpath="//div[contains(@class,'popup_menu_button popup_menu_button_settings')]") 
		private WebElement settinglink;
		
		@FindBy(xpath="//a[contains(text(),'Types of Work')]")
		private  WebElement typeofworklink;

		
		@FindBy(xpath="//span[contains(text(),'Create Type of Work')]")
		private WebElement createtypeofwork;
		
		@FindBy(xpath="//input[contains(@id,'name')]")
		private WebElement Nametextfield;
		
		@FindBy(xpath="//select[contains(@name,'active')]")
		private WebElement statusdropdown;
		
		@FindBy(xpath="//label[.='Non-Billable']")
		private WebElement categoryradiobutton;
		
		@FindBy(xpath="//input[@id='billingRate_input']")
		private WebElement billingtextfield;
		
		
		@FindBy(xpath="//input[contains(@type,'submit')]")
		private WebElement createtypeofbutton;
		
public TypeOfWork(WebDriver  driver)
{
   PageFactory.initElements(driver , this);

}
		
public void createtypeofwork()
{
	settinglink.click();
	typeofworklink.click();
	createtypeofwork.click();
	Nametextfield.sendKeys("Engineer");
	Select sel=new Select(statusdropdown);
	sel.selectByVisibleText("archived");
	categoryradiobutton.click();
	billingtextfield.sendKeys("546");
	createtypeofbutton.click();
	
}


		
	}


