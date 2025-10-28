package com.tests.project_name.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tests.project_name.base.BasePage;
import com.tests.project_name.hooks.Setup;

public class AccountCreatedPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Account Created!')]")
	private static WebElement txtAccountCreated;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnContinueAccountCreated;

	@FindBy(how = How.XPATH, using = "//a[@href='/delete_account'] ")
	private static WebElement btnDeleteAccount;
	
	
	public AccountCreatedPage() {
		super(Setup.getDriver());

	}

	public WebElement getTxtAccountCreated() {
		return txtAccountCreated;
	}

	public WebElement getBtnContinueAccountCreated() {
		return btnContinueAccountCreated;
	}
	public WebElement getBtnDeleteAccount() {
		return btnDeleteAccount;
	}
	
	
	
}
