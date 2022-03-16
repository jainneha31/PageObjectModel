package POMPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload
{
	public WebDriver driver;
	
	@FindBy(xpath="//button[.='Upload Resume']")
	private WebElement Uploadlink;
	
	public FileUpload(WebDriver driver)
	{
		this.driver=driver;
		 PageFactory.initElements(driver,this);
    }
	
	
	public void upload1()
	{
		
		Uploadlink.click();
	}
	
	
	public void path() throws InterruptedException
	{
		
   StringSelection file= new StringSelection("C:\\upload\\Neha Jain_QA_Analyst.docx");
      Thread.sleep(3000);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file,null);
		
}
	
	public void RobotClass() throws AWTException
	{
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
				
	}


	

}
