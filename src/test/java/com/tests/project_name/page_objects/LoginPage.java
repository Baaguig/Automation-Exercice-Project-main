package com.tests.project_name.page_objects;

import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.tests.project_name.base.BasePage;
import com.tests.project_name.hooks.Setup;

public class LoginPage extends BasePage {

	public LoginPage() {
		super(Setup.getDriver());
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.XPATH, using = "//a[@href='/login']")
	private static WebElement btnSignupLogin;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-name']")
	private static WebElement inputName;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-email']")
	public static WebElement inputEmail;

	@FindBy(how = How.XPATH, using = "//button[@data-qa='signup-button']")
	private static WebElement btnSignup;

	@FindBy(how = How.XPATH, using = "//a[@href='/login']")
	private static WebElement Signup_LoginBtn;

	@FindBy(how = How.XPATH, using = "//h2[@class='title text-center']")
	private static WebElement newUserSignupMsg;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='login-email']")
	private static WebElement inputPassword;

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Login to your account']")
	private static WebElement txtLoginToYouAccount;

	@FindBy(how = How.XPATH, using = "//input[@data-qa='login-email']")
	private static WebElement emailLoginField;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	private static WebElement passwordLoginField;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']")
	private static WebElement btnLogin;



	public void enterNameAndEmailAddress() {
		String uniqueID = UUID.randomUUID().toString().substring(0, 5);
		String name = "TestUser" + uniqueID;
		String email = "testuser" + uniqueID + "@example.com";
		inputName.sendKeys(name);
		inputEmail.sendKeys(email);
	}

	public void clickBtnSignup() {
		btnSignup.click();
	}

	public WebElement getEmailLoginField() {
		return txtLoginToYouAccount;
	}

	public WebElement getPasswordLoginField() {
		return passwordLoginField;
	}

	public WebElement getTxtLoginToYouAccount() {
		return txtLoginToYouAccount;
	}

	public WebElement getBtnLogin() {

		return btnLogin;
	}



}
