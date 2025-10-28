package com.tests.project_name.step_definitions;


import java.util.Map;

import org.testng.Assert;
import com.tests.project_name.actions.SeleniumUtils;
import com.tests.project_name.base.BasePage;
import com.tests.project_name.hooks.Setup;
import com.tests.project_name.hooks.TearDown;
import com.tests.project_name.page_objects.AccountCreatedPage;
import com.tests.project_name.page_objects.ContactUsPage;
import com.tests.project_name.page_objects.DeleteAccountPage;
import com.tests.project_name.page_objects.HomePage;
import com.tests.project_name.page_objects.LoginPage;
import com.tests.project_name.page_objects.SignUpPage;
import com.tests.project_name.utils.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsFormSubmission extends BasePage {
	private final SeleniumUtils seleniumUtils;
	private final ConfigFileReader configFileReader;
	private final HomePage homePage;
	private final ContactUsPage contactUsPage;

	public ContactUsFormSubmission() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		homePage = new HomePage();
		contactUsPage = new ContactUsPage();
	}

	@Given("the user navigates to Automation Exercise Website")
	public void the_user_navigates_to_automation_exercise_website() {
		seleniumUtils.get(configFileReader.getProperty("baseUrl"));
	}

	@When("the user clicks on the Contact Us button")
	public void theUserClicksOnTheContactUsButton() {
		seleniumUtils.click(homePage.getBtnContactUs());
	}

	@Then("the {string} section should be visible")
	public void theSectionShouldBeVisible(String string) {
		String txtGetInTouchActual = seleniumUtils.readText(contactUsPage.getTxtGetInTouchArea());
		Assert.assertEquals(txtGetInTouchActual, string);
	}

	@When("the user enters the following contact details:")
	public void theUserEntersTheFollowingContactDetails(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> contactdetails = dataTable.asMap(String.class, String.class);

		seleniumUtils.writeText(contactUsPage.getNameField(), contactdetails.get("name"));
		seleniumUtils.writeText(contactUsPage.getEmailField(), contactdetails.get("email"));
		seleniumUtils.writeText(contactUsPage.getsubjectField(), contactdetails.get("subject"));
		seleniumUtils.writeText(contactUsPage.getMessageField(), contactdetails.get("message"));
	}

	@When("the user uploads file {string}")
	public void theUserUploadsFile(String filePath) {
		seleniumUtils.writeText(contactUsPage.getBtnUploadFile(), filePath);	}

	@When("the user clicks on the Submit button")
	public void theUserClicksOnTheSubmitButton() {
		seleniumUtils.click(contactUsPage.getBtnSubmit());
	}

	@When("the user confirms the alert popup")
	public void theUserConfirmsTheAlertPopup() {
		seleniumUtils.acceptAlert();
	}

	@Then("the success message {string} should be visible")
	public void theSuccessMessageShouldBeVisible(String exptectedSuccesfulSubmitMessage) {
		
		String SuccessfullSubmitMsg = seleniumUtils.readText(contactUsPage.getSuccessfullSubmitMsgArea());
		Assert.assertEquals(SuccessfullSubmitMsg, exptectedSuccesfulSubmitMessage);
	}

	@When("the user clicks on the Home button")
	public void theUserClicksOnTheHomeButton() {
		seleniumUtils.click(contactUsPage.getBtnHomeBack());
	}


	}

