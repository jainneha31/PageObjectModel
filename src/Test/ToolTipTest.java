package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPractice.ToolTip;

public class ToolTipTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		driver.get("https://www.tutorialspoint.com/html/index.htm");
		driver.manage().window().maximize();
		
		ToolTip tp=new ToolTip(driver);
		tp.ActionClass();
		tp.Tooltip();
		

	}

}
