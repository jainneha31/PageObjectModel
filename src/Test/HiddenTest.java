package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import POMPractice.MouseHovering;
import POMPractice.POPup;

public class HiddenTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		POPup mouse =new POPup(driver);
		mouse.hiddenMethod();
		Thread.sleep(3000);
		MouseHovering electronics=new MouseHovering(driver);	
		electronics.ElectronicsHovering();
	

	}

}
