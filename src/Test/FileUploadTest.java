package Test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPractice.FileUpload;

public class FileUploadTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		FileUpload File=new FileUpload(driver);
		File.upload1();
		File.path();
		File.RobotClass();
		
		
	}

}
