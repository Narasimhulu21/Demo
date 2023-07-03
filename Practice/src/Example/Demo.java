package Example;

	
	import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Demo {


		   public static void main(String[] args) throws Exception {
		        // TODO Auto-generated method stub
		       
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.hyrtutorials.com/");
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//a[.='Selenium Practice']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//a[.='Basic Controls']")).click();
		        Thread.sleep(3000);
		        
		        FileInputStream file = new FileInputStream("C:\\Book2.xlsx");
		        XSSFWorkbook Workbook = new  XSSFWorkbook(file);
		        XSSFSheet Sheet = Workbook.getSheet("Sheet1");
		        int Row =Sheet.getLastRowNum();
		        System.out.println(Row);
		        
		        for(int i=1;i<=Row; i++) {
		            XSSFRow Roww =Sheet.getRow(i);
		            
		            
		             String Gender =Roww.getCell(0).getStringCellValue();
		             String CheckBox =Roww.getCell(1).getStringCellValue();
		            
		             List<WebElement> RadioButton =driver.findElements(By.name("gender"));
		             int Radiosize = RadioButton.size();
		              
		              for(int j=0; j<=Radiosize; j++) {
		                  String id=RadioButton.get(j).getAttribute("id");
		              
		              if(id.equalsIgnoreCase(Gender)){
		                  RadioButton.get(j).click();
		                  }
		              }
		              List<WebElement> RadioButton1 =driver.findElements(By.name("language"));
		             int Radiosize1 = RadioButton1.size();
		                
		                 for(int k=0; k<=Radiosize1; k++) {
		                     String id1=RadioButton1.get(k).getAttribute("id");
		                     
		                 if(id1.equalsIgnoreCase(CheckBox)){
		                         RadioButton1.get(k).click();
		                         }
		                     }
		        }
		        
		        
		        Workbook.close();
		        
		        
		        
		        
		    }



		}



		/*
		 * public static void main(String[] args) throws IOException { // TODO
		 * Auto-generated method stub FileInputStream file = new
		 * FileInputStream("C:\\TestSheet.xlsx");
		 * 
		 * XSSFWorkbook wb = new XSSFWorkbook(file);
		 * 
		 * XSSFSheet s = wb.getSheetAt(1);
		 * 
		 * int row = s.getLastRowNum(); int column = s.getRow(0).getLastCellNum();
		 * System.out.println(column);
		 * 
		 * for(int i=0; i<=row; i++) { //row of the values XSSFRow currentrow =
		 * s.getRow(i);
		 * 
		 * for(int j=1; j<column; j++) { //read column to cell String value =
		 * currentrow.getCell(j).toString(); System.out.print(value+ "  ");
		 * 
		 * } System.out.println(); }
		 * 
		 * 
		 * 
		 * }
		 */
	


