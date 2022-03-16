package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPractice.CheapoairCalenderPopup;

public class CheapoairCalenderpopupTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	     driver.get("https://www.cheapoair.com/");
	     
	     driver.manage().window().maximize();
	     
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   
	   CheapoairCalenderPopup calender=new CheapoairCalenderPopup(driver);
	   calender.calenderpopup();
	   calender.ArrowSelect();
	  
	   calender.ReturnMD();
	   
	   
	   

	}

}
