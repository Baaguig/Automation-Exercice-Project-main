package com.tests.project_name.step_definitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;
import org.junit.Assert;
import com.tests.project_name.actions.SeleniumUtils;
import com.tests.project_name.base.BasePage;
import com.tests.project_name.constants.Constants;
import com.tests.project_name.hooks.Setup;
import com.tests.project_name.page_objects.AccountCreatedPage;
import com.tests.project_name.page_objects.DeleteAccountPage;
import com.tests.project_name.page_objects.HomePage;
import com.tests.project_name.page_objects.LoginPage;
import com.tests.project_name.page_objects.SignUpPage;
import com.tests.project_name.utils.ConfigFileReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterUser extends BasePage {

	private final SeleniumUtils seleniumUtils;
	private final ConfigFileReader configFileReader;
	private final SignUpPage signUpPage;
	private final LoginPage loginPage;
	private final HomePage homePage;
	private final AccountCreatedPage accountCreatedPage; 
	private final DeleteAccountPage deleteAccountPage;

	public RegisterUser() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		signUpPage = new SignUpPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
		accountCreatedPage = new AccountCreatedPage();
		deleteAccountPage = new DeleteAccountPage();
	}

	@Given("the browser is launched on the homepage")
	public void theBrowserIsLaunchedOnTheHomepage() {
		seleniumUtils.get(configFileReader.getProperty("url"));
	}

	@And("the home page is visible")
	public void theHomePageIsVisible() {
		Assert.assertEquals(homePage.getColorBtnHome(), Constants.homePageExcpectedColor);
	}

	@When("I click on the Signup\\/Login button")
	public void i_click_on_the_signup_login_button() {
		seleniumUtils.click(homePage.getBtnSignUpLogin());
	}

	@When("I enter a name and email address")
	public void iEnterANameAndEmailAddress() {
		loginPage.enterNameAndEmailAddress();
	}

	@When("I click the Signup button")
	public void iClickTheSignupButton() {
		loginPage.clickBtnSignup();
	}

	@When("I select the title Mr")
	public void i_select_the_title_Mr() {
		seleniumUtils.click(signUpPage.getCheckBoxMr());
	}

	@When("I insert the password")
	public void i_insert_the_password() {
		String randomPassword = seleniumUtils.generateRandomPassword(10);
		seleniumUtils.writeText(signUpPage.getPassword(), randomPassword);
	}

	@When("I select the date of birth")
	public void i_select_the_date_of_birth() {
		// Write code here that turns the phrase above into concrete actions
		seleniumUtils.selectRandomOption(signUpPage.getDays());
		seleniumUtils.selectRandomOption(signUpPage.getMonths());
		seleniumUtils.selectRandomOption(signUpPage.getYears());
	}

	@When("I select the Sign up for our newsletter! checkbox")
	public void iSelectTheSignUpForOurNewsletterCheckbox() {
		seleniumUtils.click(signUpPage.getSignupNewsLetters());
	}

	@When("I select the Receive special offers from our partners! checkbox")
	public void iSelectTheReceiveSpecialOffersFromOurPartnersCheckbox() {
		seleniumUtils.click(signUpPage.getSignupSpecialOffers());
	}

	@When("I fill in the address details:")
	public void iFillInTheAddressDetails(DataTable dataTable) {
		Map<String, String> addressDetails = dataTable.asMap(String.class, String.class);
		seleniumUtils.writeText(signUpPage.getFirstNameField(), addressDetails.get("First name"));
		seleniumUtils.writeText(signUpPage.getLastNameField(), addressDetails.get("Last name"));
		seleniumUtils.writeText(signUpPage.getCompanyField(), addressDetails.get("Company"));
		seleniumUtils.writeText(signUpPage.getAddressField(), addressDetails.get("Address"));
		seleniumUtils.writeText(signUpPage.getAddress2Field(), addressDetails.get("Address2"));
		seleniumUtils.writeText(signUpPage.getStateField(), addressDetails.get("State"));
		seleniumUtils.writeText(signUpPage.getCityField(), addressDetails.get("City"));
		seleniumUtils.writeText(signUpPage.getZipCodeField(), addressDetails.get("Zipcode"));
		seleniumUtils.writeText(signUpPage.getMobileNumberField(), addressDetails.get("Mobile Number"));
	}

	@When("I select a random country")
	public void iSelectARandomCountry() {
		seleniumUtils.selectRandomOption(signUpPage.getCountryField());
	}

	@When("I Click on create account button")
	public void iClickOnCreateAccountButton() {
		seleniumUtils.click(signUpPage.getCreateAccountBtn());

	}

	@Then("I verify {string} is visible")
	public void i_verify_is_visible(String string) {
		String actualTxtAccountCreated = seleniumUtils.readText(accountCreatedPage.getTxtAccountCreated());
		System.out.println(actualTxtAccountCreated);
		assertEquals(actualTxtAccountCreated, string);
	}

	@Then("I click the Continue button in account_created page")
	public void i_click_the_continue_button_in_account_created_page() {
		seleniumUtils.click(accountCreatedPage.getBtnContinueAccountCreated());
	}



	@Then("I I click the delete Account button")
	public void i_i_click_the_delete_account_button() {
		seleniumUtils.click(accountCreatedPage.getBtnDeleteAccount());
	}

	@Then("I Verify that {string} is shown in green")
	public void i_verify_that_is_shown_in_green(String string) {
		Assert.assertEquals((deleteAccountPage.getColorTxtAccountDeleted()), Constants.deletePageExpectedColor);
	}

	@Then("I click the Continue button in account_deleted page")
	public void i_click_the_continue_button_in_account_deleted_page() {
		seleniumUtils.click(deleteAccountPage.getBtnContinueDeleteAccount());

	}

}
