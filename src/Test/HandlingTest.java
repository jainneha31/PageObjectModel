package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPractice.HandlingFrame;

public class HandlingTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		driver.get("https://the-internet.herokuapp.com/frames");
		
		HandlingFrame hf=new HandlingFrame(driver);
		hf.frame();

	}

}
