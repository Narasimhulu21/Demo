package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	@FindBy(xpath = "//input[@placeholder='Employee ID / Email ID']")
	WebElement Username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath = "//label[contains(text(), 'Sign In')]")
	WebElement sign_btn;
	
	public void LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String EmployeeID, String LngPassword) {
		Username.sendKeys(EmployeeID);
		Password.sendKeys(LngPassword);
		sign_btn.click();
	}
	
	

}
