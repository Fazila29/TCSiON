package com.tcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CFLogin {
 WebDriver driver;
	 
	 //objects
 @FindBy(xpath="//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a/small")
 private WebElement cflink;
 @FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input")
 private WebElement email;
 @FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")
private WebElement password;  
@FindBy(xpath="//button[@type=\"submit\"]")
private WebElement login;
	    
	    
	    public CFLogin(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
	    
	    //Click on the link
	    public void clickCFLink() {
	    cflink.click();
	    }
	    
	    //Set email in text box
	    public void setEmail(String strEmail){
	    	email.sendKeys(strEmail);     
	    }

	     /*public void clearUserName() {
	    	 username.clear();
	     }*/
	   
	    
	  //Set password in password textbox
	     public void setPassword(String strPassword){
	       password.sendKeys(strPassword);
	    }
	    
	     /*public void clearPassword() {
	    	password.clear();
	    }*/
	    
	       
	  //Click on login button 
	     public void clickLogin(){ 
	    	      login.click();   
	     }
	    
}
