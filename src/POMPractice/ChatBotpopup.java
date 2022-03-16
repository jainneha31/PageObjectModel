package POMPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChatBotpopup {

		public WebDriver driver;
		
		
		@FindBy(xpath="//img[@id='corover-disha-icon']")
		private WebElement IconDishalink;
		
		@FindBy(xpath="//input[@placeholder='Enter your query here']")
		private WebElement Typequerytextfield;
		
		@FindBy(xpath="//button[@title='Ask Question']")
		private WebElement askquestionlink;
		
		@FindBy(xpath="//img[@id='corover-disha-icon']")
		private WebElement waitlink;
		
		
		public ChatBotpopup(WebDriver  driver)
		{
			this.driver=driver;
		  PageFactory.initElements(driver , this);

		}
		
	public void waitexplicit()
		{
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("corover-disha-icon")));
	}
	
	public void icon() throws InterruptedException
	{
		
		Thread.sleep(3000);
		 IconDishalink.click();
	}
	
	public void switchparentchild() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.switchTo().frame("corover-chat-frame");
	}
	
	public void chat() throws InterruptedException
	{
		Thread.sleep(3000);
		Typequerytextfield.sendKeys("train to noida");
		askquestionlink.click();
	}
	
	
	}


