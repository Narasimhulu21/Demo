package Project.Demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	public static void main(String[] args) throws IOException, Exception {
        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/");
        Thread.sleep(4000);
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(4000);
        
        Select Tools = new Select(driver.findElement(By.id("course")));
        
        List<String> actualList = new ArrayList<String>();
        List<WebElement> MyTools = Tools.getOptions();
       
        for (WebElement ele : MyTools) {
        	String data = ele.getText();
        		System.out.println(data);
        		actualList.add(data);
        		}
        
        List<String> sortedlist = actualList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist);
}
	}

