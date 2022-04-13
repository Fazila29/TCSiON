package com.tcs.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tcs.constants.AutomationConstants;
import com.tcs.pages.CFLogin;
import com.tcs.utilities.ExcelUtility;

public class TCCFLogin extends TestBase {
	CFLogin objCFLogin;


	//@BeforeClass
	@Test(priority=1)
    public void verifyValidLogin() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
    //Create Login Page object
    objCFLogin= new CFLogin(driver);
    //login to application
    
   //objCFLogin.clickCFLink();
    String email = ExcelUtility.getCellData(1,0);
   String password = ExcelUtility.getCellData(2,0);
    objCFLogin.setEmail(email);
  objCFLogin.setPassword(password);
  objCFLogin.clickLogin();
  
  Thread.sleep(2000);
  
      String expectedURL =AutomationConstants.CFURL1;
  String actualURL =driver.getCurrentUrl();
  Assert.assertEquals(expectedURL,actualURL);
  System.out.println("Customer Front End Dashboard Opened");


  Thread.sleep(2000);
  }

}
