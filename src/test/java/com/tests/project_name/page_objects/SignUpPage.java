package com.tests.project_name.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.tests.project_name.base.BasePage;
import com.tests.project_name.hooks.Setup;

public class SignUpPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//h2[contains(text() , 'New User Signup!')]")
	private static WebElement txtNewUserSignUp;

	@FindBy(how = How.XPATH, using = "//h2[@style='color: #FE980F;']")
	private static WebElement enterAccountInfoText;

	@FindBy(how = How.ID, using = "id_gender1")
	private static WebElement checkBoxMr;

	@FindBy(how = How.ID, using = "id_gender2")
	private static WebElement checkBoxMrs;

	@FindBy(how = How.ID, using = "password")
	private static WebElement Password;

	@FindBy(how = How.ID, using = "days")
	private static WebElement days;

	@FindBy(how = How.ID, using = "months")
	private static WebElement months;

	@FindBy(how = How.ID, using = "years")
	private static WebElement years;

	@FindBy(how = How.ID, using = "newsletter")
	private static WebElement signupNewsLetters;

	@FindBy(how = How.ID, using = "optin")
	private static WebElement signupSpecialOffers;

	@FindBy(how = How.ID, using = "first_name")
	private static WebElement firstNameField;

	@FindBy(how = How.ID, using = "last_name")
	private static WebElement lastNameField;

	@FindBy(how = How.ID, using = "email")
	private static WebElement emailField;

	@FindBy(how = How.ID, using = "company")
	private static WebElement companyField;

	@FindBy(how = How.ID, using = "address1")
	private static WebElement addressField;

	@FindBy(how = How.ID, using = "address2")
	private static WebElement address2Field;

	@FindBy(how = How.ID, using = "country")
	private static WebElement countryField;

	@FindBy(how = How.ID, using = "state")
	private static WebElement stateField;

	@FindBy(how = How.ID, using = "city")
	private static WebElement cityField;

	@FindBy(how = How.ID, using = "zipcode")
	private static WebElement zipCodeField;

	@FindBy(how = How.ID, using = "mobile_number")
	private static WebElement mobileNumberField;

	@FindBy(how = How.XPATH, using = "//button[@data-qa='create-account']")
	private static WebElement createAccountBtn;

	public SignUpPage() {
		super(Setup.getDriver());
	}

	public String getTxtNewUserSignUp() {
		return txtNewUserSignUp.getText();
	}

	public WebElement getCheckBoxMr() {
		return checkBoxMr;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getDays() {
		return days;
	}

	public WebElement getMonths() {
		return months;
	}

	public WebElement getYears() {
		return years;
	}

	public WebElement getSignupNewsLetters() {
		return signupNewsLetters;
	}

	public WebElement getSignupSpecialOffers() {
		return signupSpecialOffers;
	}

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getCompanyField() {
		return companyField;
	}

	public WebElement getAddressField() {
		return addressField;
	}

	public WebElement getAddress2Field() {
		return address2Field;
	}

	public WebElement getCountryField() {
		return countryField;
	}

	public WebElement getStateField() {
		return stateField;
	}

	public WebElement getCityField() {
		return cityField;
	}

	public WebElement getZipCodeField() {
		return zipCodeField;
	}

	public WebElement getMobileNumberField() {
		return mobileNumberField;
	}

	public WebElement getCreateAccountBtn() {
		return createAccountBtn;
	}
}
