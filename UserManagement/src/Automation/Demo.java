package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {


	

@Test
		public void log() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\MSmart\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://d1916e9ns1xp1r.cloudfront.net/");

			/*
			 * if (driver.findElement(By.name("USER")).isDisplayed()) {
			 * System.out.println("User Id");
			 * driver.findElement(By.name("USER")).sendKeys("cm.pty.agent"); } else {
			 * System.out.println("user id not able to eneter");
			 * 
			 * }
			 * 
			 * driver.findElement(By.name("PASSWORD")).sendKeys("Pss@test17");
			 * 
			 * 
			 * 
			 * driver.findElement(By.name("submit")).click();
			 * 
			 * 
			 * driver.findElement(By.linkText("css/")).click(); String title =
			 * driver.getTitle(); System.out.println(title); Thread.sleep(2000); Select
			 * dropdown= new Select(driver.findElement(By.className("ng-binding")));
			 * dropdown.selectByVisibleText("Reservations"); driver.close();
			 */

		}
	}

