package com.tests.project_name.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tests.project_name.base.BasePage;
import com.tests.project_name.hooks.Setup;


public class HomePage extends BasePage {


 //Locators 
@FindBy(how = How.XPATH, using = "//a[normalize-space()='Home']")
    private static WebElement btnHome;

@FindBy(how = How.XPATH,using = "//a[normalize-space()='Signup / Login']")
 private static WebElement btnSignUpLogin;

@FindBy(how = How.XPATH,using = "//a[@href='/contact_us']")
private static WebElement btnContactUs;
 
    public HomePage() {
        super(Setup.getDriver());
    }
      public String  getColorBtnHome () {
    	return  btnHome.getCssValue("color");
      }
        
      public WebElement getBtnSignUpLogin() {
    	return btnSignUpLogin;
      }
      
      public WebElement getBtnContactUs() {
		return btnContactUs;
    	  
      }
      
        // Method to get the Signup/Login button   
    }

