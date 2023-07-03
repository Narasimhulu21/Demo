package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	
	WebDriver driver = null;
	public void HomePageObjects (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	 public void Onclick(String module) {
		 String modulexpath = "//div[contains(text(), '"+module+"')]";
		 driver.findElement(By.xpath(modulexpath)).click();
	 }

}
