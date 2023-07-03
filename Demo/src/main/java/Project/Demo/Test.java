package Project.Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws IOException, Exception {
        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/");
        Thread.sleep(3000);
        String ExpectedTitle = "HYR";
       String ActualTitle = driver.findElement(By.xpath("//img[@title='HYR']")).getText();
       if(ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
    	   System.out.println("hyrtutorials opended Succesffuly");
       }
       else {
    	   System.out.println("Unable to open");
       }
      
       WebDriverWait(driver, Duration.ofSeconds(10)) .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Selenium Practice']"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[.='Basic Controls']")).click();
        Thread.sleep(3000);
        FileInputStream file = new FileInputStream("C:\\Users\\junju.narasimhulu\\SeleniumEcel.xlsx");
        XSSFWorkbook Workbook = new XSSFWorkbook(file);
        XSSFSheet Sheet = Workbook.getSheet("Sheet1");
        int Row = Sheet.getLastRowNum();
        System.out.println(Row);


       for (int i = 1; i <= Row; i++) {
            XSSFRow Roww = Sheet.getRow(i);

           String Gender = Roww.getCell(0).getStringCellValue();
            String Languagesknown = Roww.getCell(3).getStringCellValue();
            System.out.println("Column value is " + Languagesknown);

           List<WebElement> RadioButton = driver.findElements(By.name("gender"));
            int Radiosize = RadioButton.size();

           for (int j = 0; j <= Radiosize; j++) {
                String id = RadioButton.get(j).getAttribute("id");

               if (id.equalsIgnoreCase(Gender)) {
                    RadioButton.get(j).click();
              }
            }

           List<WebElement> RadioButton1 = driver.findElements(By.name("language"));
            int Radiosize1 = RadioButton1.size();

           for (int b = 0; b <= Radiosize1; b++) {
                String id1 = RadioButton1.get(b).getAttribute("id");
                System.out.println(id1);
                if (id1.equalsIgnoreCase(Languagesknown)) {
                    RadioButton1.get(b).click();
                }
            }
        }



       Workbook.close();



   }

	private static FluentWait<WebDriver> WebDriverWait(WebDriver driver, Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}



}
