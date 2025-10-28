package com.tests.project_name.step_definitions;


import com.tests.project_name.actions.SeleniumUtils;
import com.tests.project_name.base.BasePage;
import com.tests.project_name.hooks.Setup;
import com.tests.project_name.page_objects.ProductsPage;
import com.tests.project_name.utils.ConfigFileReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSearch extends BasePage{
	
	private final SeleniumUtils seleniumUtils;
	private final ProductsPage productsPage ;
	private final ConfigFileReader configFileReader;

	
	public ProductSearch() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		productsPage = new ProductsPage();
		configFileReader = new ConfigFileReader();
		
	} 

	@Given("I navigate to Eutomation Exercice Website")
	public void i_navigate_to_eutomation_exercice_website() {
		seleniumUtils.get(configFileReader.getProperty("url"));
	}

	@Then("the home page should be visible")
	public void the_home_page_should_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on the Products button")
	public void i_click_on_the_products_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should be navigated to the ALL PRODUCTS page")
	public void i_should_be_navigated_to_the_all_products_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I search for product {string}")
	public void i_search_for_product(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} section should be visible")
	public void section_should_be_visible(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("all products related to {string} should be displayed")
	public void all_products_related_to_should_be_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
