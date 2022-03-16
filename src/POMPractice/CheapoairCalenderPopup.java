package POMPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheapoairCalenderPopup 
{
	public WebDriver driver;
	
	@FindBy(xpath="//input[@aria-label='Choose a departure date. expanded']")
	private WebElement clickDeparturelink;
	
	
	@FindBy(xpath="//div[.='February 2022']/..//a[@aria-label='10 February 2022']")
	private WebElement DepartureSelectMonthDatelink;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement Returnlink;
	
	@FindBy(xpath="//a[@aria-label='Select next month']")
	private WebElement Arrowlink;
	
	@FindBy(xpath="//div[.='June 2022']/..//a[@aria-label='1 June 2022']")
	private WebElement ReturnSelectMonthDatelink;
	
	
	public CheapoairCalenderPopup(WebDriver  driver)
	{
		this.driver=driver;
	  PageFactory.initElements(driver,this);

	}
	
	public void calenderpopup()
	{
		clickDeparturelink.click();
		DepartureSelectMonthDatelink.click();
		Returnlink.click();
		}
	
	public void ArrowSelect() throws InterruptedException
	{
		Thread.sleep(3000);
		for(int i=0;i<3;i++)
		{
			Arrowlink.click();
			}
	}
	
	public void ReturnMD()
	{
		ReturnSelectMonthDatelink.click();
		
	}

}
