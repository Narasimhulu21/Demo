package esmsApplication;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automationdemo {

	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", Variables.ChromedrivePath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://54.189.239.147/eSMS/fedex/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		Thread.sleep(1000); //wait for
		try {
			driver.findElement(By.xpath(Variables.lgnUsrnmeXpath)).sendKeys(Variables.UserID);
			driver.findElement(By.xpath(Variables.lgnpwdXpath)).sendKeys(Variables.password);
			driver.findElement(By.xpath(Variables.signin)).click();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			String exp_title = "eSMS || FedEx";
			String act_title = driver.getTitle();
			System.out.println(act_title);
			 
			Thread.sleep(1000);
			if (exp_title.equals(act_title)==true) 
			{
				System.out.println("Logged in Successfull");
			}
			else {
				System.out.println("Log in Failed");
			}
			
		/*	if (driver.findElement(By.xpath(Variables.lgnSelf)).isDisplayed() ) {
				driver.findElement(By.xpath(Variables.lgnSelf)).click();
				System.out.println("Logged in as Self");
			}
			else {}*/
					
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//driver.close();
		

	}

}
