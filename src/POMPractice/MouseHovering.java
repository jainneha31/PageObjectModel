package POMPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseHovering 
{

	public WebDriver driver;
	@FindBy(xpath="(//div[@class='_1psGvi SLyWEo'])[2]")
	private WebElement Electronicslink;
	
	
	@FindBy(xpath="//div[@class='_2IjXr8']/..//a[@class='_6WOcW9 _2-k99T']")
	private WebElement Audioclink;
	

	public MouseHovering(WebDriver  driver)
	{
		this.driver=driver;
	  PageFactory.initElements(driver , this);

	}
	
	public void ElectronicsHovering()
	{
		
		Actions act=new Actions(driver);
	 act.moveToElement(Electronicslink).perform();
	act.moveToElement(Audioclink).click(Audioclink).perform();
		
	}

}
