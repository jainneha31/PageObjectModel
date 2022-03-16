package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POMPractice.ChildBrowser;
import POMPractice.SwitchWindow;

public class SwitchTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();//by this disable the notification
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		
		driver.get("https://www.lightinthebox.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		SwitchWindow sw=new SwitchWindow(driver);
		sw.clickwinter();
		
		ChildBrowser cb= new ChildBrowser(driver);
		cb.switcherr();
		cb.winter(); 
		

	}

}
