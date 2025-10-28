package com.tests.project_name.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.tests.project_name.base.BasePage;
import com.tests.project_name.hooks.Setup;

public class ContactUsPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Get In Touch')]")
	WebElement txtGetInTouch;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	WebElement nameField;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
	WebElement emailField;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Subject']")
	WebElement subjectField;

	@FindBy(how = How.XPATH, using = "//textarea[@id='message']")
	WebElement messageField;

	@FindBy(how = How.XPATH, using = "//input[@name='upload_file']")
	WebElement btnUploadFile;

	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	WebElement btnSubmit;
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Success! Your details have been submitted successfully.')]")
	WebElement successfullSubmitMsgArea;
	
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Home']")
	WebElement btnHomeBack;


	public ContactUsPage() {
		super(Setup.getDriver());
	}

	public WebElement getTxtGetInTouchArea() {
		return txtGetInTouch;
	}

	public WebElement getNameField() {
		return nameField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getsubjectField() {
		return subjectField;
	}

	public WebElement getMessageField() {
		return messageField;
	}

	public WebElement getBtnUploadFile() {
		return btnUploadFile;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	
	public WebElement getSuccessfullSubmitMsgArea() {
		return successfullSubmitMsgArea;
	}
	public WebElement getBtnHomeBack() {
		return btnHomeBack;
	}
	
	
	

}
