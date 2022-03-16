package POM;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCustomer
{
	public WebDriver driver;
@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement EnterCustomerNameTextfield;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement DescriptionTextfield;

@FindBy(xpath="(//div[@class='selectedItem'])[15]")
private WebElement selectcustomerlink;

@FindBy(xpath="//div[@class='customerImportDivTitle']/..//div[.='Big Bang Company']")
private WebElement Selectcustomerlink1;

@FindBy(xpath="//div[.='Create Customer']")
private WebElement createcustomerlink;


@FindBy(xpath="(//div[.='Cancel'])[27]")
private WebElement cancellink;

public CreateCustomer(WebDriver  driver)
{
	this.driver=driver;
  PageFactory.initElements(driver , this);

}

public void newcustomerMethod() throws InterruptedException
{
	
	EnterCustomerNameTextfield.sendKeys("neha");
	Thread.sleep(3000);
	DescriptionTextfield.sendKeys("i learn automation");
	selectcustomerlink.click();
	Selectcustomerlink1.click();
	
	cancellink.click();//alert popup
	
  
}

/*public void setcustomer(String stname) throws InterruptedException

{
	Thread.sleep(3000);
	EnterCustomerNameTextfield.sendKeys(stname);	
	
}*/
	

/*pass the argument
  public void setdescription(String setdecription) 
{ 
	
	 DescriptionTextfield.sendKeys(setdecription);
}*/


public void creatMethod() throws InterruptedException
{
	Thread.sleep(3000);
	 createcustomerlink.click();
	
}

public void alert()
{
	 Alert alt=driver.switchTo().alert();
	  //alt.accept();
	  alt.dismiss();
	
}


	
}

	 





	

