package Project.Demo;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



	public class eAWBLogin {

		public static void main(String[] args) throws IOException, Exception {
	        // TODO Auto-generated method stub
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://eawblink.org/");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@id ='txtLoginUsername']")).sendKeys("cargoxb@gmail.com");
	        driver.findElement(By.xpath("//input[@id ='txtLoginPassword']")).sendKeys("Xbcargo1");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@id ='btn-login']")).click();
	        
    
	        
		}
		}
