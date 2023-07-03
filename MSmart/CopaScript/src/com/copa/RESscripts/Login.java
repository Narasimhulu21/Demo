package com.copa.RESscripts;


import org.openqa.selenium.WebDriver;





import FrameworkCode.BFrameworkQueryObjects;



public class Login {

	
    
	public void login(WebDriver driver, BFrameworkQueryObjects queryObjects) throws Exception{
		/*
		 * try{
		 * 
		 * Login.envwrite(PNRNUM, " "); Login.envwrite(FLIGHTNUM, " ");
		 * Login.envwrite(CURRENCY, " "); Login.envwrite(EMDNO, " ");
		 * Login.envwrite(EMDAmt, " "); Login.envwrite(shareflightnm, " ");
		 * Login.envwrite(shareflightnumssr, " "); Login.envwrite(MultiplePNR, " ");
		 * 
		 * 
		 * Env=FlightSearch.getTrimTdata(queryObjects.getTestData("Env")); if
		 * (Env.equalsIgnoreCase("SIT"))
		 * //driver.navigate().to("http://pssguicmmb.airservices.svcs.entsvcs.com:8970/"
		 * ); driver.navigate().to(uSITurl); else if (Env.equalsIgnoreCase("DEV")||
		 * Env.equalsIgnoreCase("JSIT")) driver.navigate().to(uDevurl);
		 * //driver.navigate().to("https://pssguicmt.airservices.svcs.entsvcs.com");
		 * else if (Env.equalsIgnoreCase("UAT"))
		 * //driver.navigate().to("http://pssguicmm.airservices.svcs.entsvcs.com:8980");
		 * driver.navigate().to(uUATurl);
		 * 
		 * Call_Center_Login=queryObjects.getTestData("Call_Center_Login");
		 * Usernm=queryObjects.getTestData("userName");
		 * driver.findElement(By.name("USER")).sendKeys(Usernm);
		 * driver.findElement(By.name("PASSWORD")).sendKeys(queryObjects.getTestData(
		 * "password")); driver.findElement(By.name("submit")).click();
		 * Thread.sleep(10000);
		 * 
		 * if (Env.equalsIgnoreCase("SIT"))
		 * driver.findElement(By.xpath("//a[contains(text(),'css')]")).click(); else if
		 * (Env.equalsIgnoreCase("DEV"))
		 * driver.findElement(By.xpath("//a[contains(text(),'copa-dev')]")).click(); //
		 * driver.findElement(By.xpath("//a[contains(text(),'copa-prime-time')]")).click
		 * (); //else if (Env.equalsIgnoreCase("UAT"))
		 * //driver.findElement(By.xpath("//a[contains(text(),'css')]")).click(); else
		 * if (Env.equalsIgnoreCase("JSIT"))
		 * driver.findElement(By.xpath("//a[@href='copa-jsit/']")).click();
		 * 
		 * driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		 * FlightSearch.loadhandling(driver); WebDriverWait wait = new
		 * WebDriverWait(driver, 50);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//div[contains(text(),'Reservations')]"))); String Home =
		 * driver.findElement(By.xpath("//div[contains(text(),'Reservations')]")).
		 * getText(); if (Home.trim().equals("Reservations")) {
		 * queryObjects.logStatus(driver, Status.PASS, "Login to COPA Application",
		 * "LoginSuccess", null); // FlightSearch.loadhandling(driver);
		 * Thread.sleep(3000); Boolean
		 * CloseReport=driver.findElements(By.xpath("//h2[contains(text(),'reminder')]")
		 * ).size() >0; if(CloseReport)
		 * driver.findElement(By.xpath("//button[contains(@class,'md-confirm-button')]")
		 * ).click(); //closePrevDayReports(driver, queryObjects); SalesOff =
		 * getTrimTdata(queryObjects.getTestData("Salesoffice")); Cur =
		 * getTrimTdata(queryObjects.getTestData("Currency")); Login.envwrite(CURRENCY,
		 * Cur); if (!SalesOff.isEmpty()) {
		 * 
		 * driver.findElement(By.xpath(
		 * "//div[@action='saleOfficeInfo']/div[@class='padding-top']/i")).click();
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "//div[@popup-action='salesoffice-update']/div/div[1]/md-input-container/md-select/md-select-value/span[2]"
		 * )).click(); Thread.sleep(3000);
		 * //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
		 * "//div[contains(@class,'loading-message')]"))); //driver.findElement(By.
		 * xpath("//md-option[div[@class='md-text ng-binding' and contains(text(),'"
		 * +SalesOff+"')]]")).click(); driver.findElement(By.
		 * xpath("//md-option[div[@class='md-text ng-binding' and contains(text(),'"
		 * +SalesOff+"')]]")).click(); } Thread.sleep(2000);
		 * driver.findElement(By.xpath(
		 * "//div[@popup-action='salesoffice-update']/div/div[2]/md-input-container")).
		 * click();//Clicking on Currency drop down Thread.sleep(3000); if
		 * (!Cur.isEmpty()) {
		 * 
		 * // SIT driver.findElement(By.
		 * xpath("//md-option[div[@class='md-text ng-binding' and contains(text(),'"+Cur
		 * +"')]]")).click();//Selecting the UDS Currency driver.findElement(By.
		 * xpath("//md-option[contains(@ng-value,'currency')][div[@class='md-text ng-binding' and contains(text(),'"
		 * +Cur+"')]] ")).click(); } Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//div[@popup-action='salesoffice-update']/div[2]/button[contains(text(),'OK')]"
		 * )).click(); //
		 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
		 * "//div[contains(@class,'loading-message')]")));
		 * 
		 * FlightSearch.loadhandling(driver); try { if (!SalesOff.isEmpty()) { if
		 * (driver.findElement(By.
		 * xpath("//div[@class='inset padding-right-0 ng-binding']")).getText().contains
		 * (SalesOff)) { queryObjects.logStatus(driver, Status.PASS,
		 * "Check given sales office details ", "Sales office is updated", null);
		 * 
		 * } else { queryObjects.logStatus(driver, Status.FAIL,
		 * "Check given sales office details ", "Sales office is not updated", null); }
		 * 
		 * } } catch (Exception e) { queryObjects.logStatus(driver, Status.INFO,
		 * "Sales offce", e.getLocalizedMessage(), e);
		 * 
		 * } Boolean
		 * CloseReport1=driver.findElements(By.xpath("//h2[contains(text(),'reminder')]"
		 * )).size() >0; //suman Boolean CloseReport2=driver.findElements(By.
		 * xpath("//div[@action='saleOfficeInfo']/div[@class='padding-top']/i[contains(@class,'icon-warning pssgui')]"
		 * )).size() >0; if(CloseReport1 ||CloseReport2) //suman
		 * closePrevDayReports(driver, queryObjects);
		 * 
		 * //closePrevDayReports(driver, queryObjects);
		 * 
		 * } else { queryObjects.logStatus(driver, Status.FAIL,
		 * "Login to COPA Application", "LoginFailure", null); }
		 * 
		 * 
		 * } catch (Exception e) { queryObjects.logStatus(driver, Status.FAIL,
		 * "Login to COPA Application", e.getLocalizedMessage(), e);
		 * 
		 * }
		 */
		
	}
	
	
}
