package POMPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChildBrowser {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@class='sc-fExKbP cSrqRX']")
	private WebElement entertextfield;
	
	@FindBy(xpath="//button[.='Search']")
	private WebElement searchlink;
	
	@FindBy(xpath="//li[contains(@class,'sc-ibZcGq dEABVp')]")
	private List<WebElement> autosuggestiontextfield;
	
	
	
	public ChildBrowser(WebDriver  driver)
	{
		this.driver=driver;
	  PageFactory.initElements(driver,this);

	}
	
	public void switcherr()
	{
		 Set<String> windowhandles=driver.getWindowHandles();
		
		 ArrayList<String> al=new ArrayList(windowhandles);
	     System.out.println(al.size());
         for(int i=0;i<al.size();i++)
	    	 
	     {
	    	driver.switchTo().window(al.get(i));
	    	 String title=driver.getTitle();
	    	 if(title.contains("Winter Sale"))
	    	 {
	    	 driver.switchTo().window(al.get(i));
	
	        }
	    	
	    }
        
	}

	public void winter()
	{
		entertextfield.sendKeys("winter");	
		searchlink.click();
	}



	


	
}
