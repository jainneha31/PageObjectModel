package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.ActTimeLoginPage;
import POM.ActitimeHomePage;
import POM.CreateCustomer;
import POM.LeaveType;
import POM.Task;
import POM.TypeOfWork;

public class ActitimeTest 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ActTimeLoginPage login= new ActTimeLoginPage(driver);
		login.LoginMethod();
		
		//Task t=new Task(driver);
		//t.Tasksnew();
		
		//CreateCustomer customer =new CreateCustomer(driver);
		//customer.newcustomerMethod();
		
	     //customer.setcustomer("Neha");//passing the value
		//customer.setdescription("i learn automation");
		//customer.creatMethod();
		//customer.alert();
		
		
		//TypeOfWork work=new TypeOfWork(driver);
		//work.createtypeofwork();
		
		
		
		//LeaveType leave=new LeaveType(driver);
		//leave.leavetypework();
		
		
		ActitimeHomePage logout= new ActitimeHomePage(driver);
		logout.LogoutMethod();
				
		
	}

}
