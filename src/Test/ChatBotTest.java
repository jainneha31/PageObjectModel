package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPractice.ChatBotpopup;

public class ChatBotTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		ChatBotpopup chatbot=new ChatBotpopup(driver);
		chatbot.waitexplicit();
		chatbot.icon();
		//chatbot.waitexplicit();
		chatbot.icon();
		
	
		chatbot.switchparentchild();
		chatbot.chat();
		
		

	}

}
