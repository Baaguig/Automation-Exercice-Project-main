package com.tests.project_name.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tests.project_name.base.BasePage;
import com.tests.project_name.hooks.Setup;

public class DeleteAccountPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Account Deleted!')]")
	WebElement txtAccountDeleted;

	@FindBy(how = How.XPATH, using = "//a[@data-qa='continue-button']\r\n")
	WebElement btnContinueDeleteAccount;

	
	public DeleteAccountPage() {
		super(Setup.getDriver());
	}

	public WebElement getTxtAccountDeleted() {
		return txtAccountDeleted;
	}
	
public String getColorTxtAccountDeleted() {
	String ColorTxtAccountDeleted = txtAccountDeleted.getCssValue("color");
	return ColorTxtAccountDeleted;
}



public WebElement getBtnContinueDeleteAccount() {
	return btnContinueDeleteAccount;
}

}
