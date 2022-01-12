package StepDefinition;

import com.driverSetup.driverSetup;
import com.pages.homePage;
import com.pages.resultPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class abc extends driverSetup{
	
	public abc() throws Exception {
		
	}

	driverSetup d;
	
	
	homePage h;
	
	resultPage p;
	
	@Given("^User opens the browser and enters the url$")
	public void user_opens_the_browser_and_enters_the_url() throws Exception {
		
		d = new driverSetup();
		
		invokeBrowser();
		
		h = new homePage();
		
		h.openUrl();
		
		}

	@When("^User handles any popup$")
	public void user_handles_any_popup()  
	{
		h.handlePopUp();
	}

	@Then("^user enters the mobile in search bar$")
	public void user_enters_the_mobile_in_search_bar() throws Exception  
	{
		p = h.searchTab();
	}

	@Then("^user verify the result displayed$")
	public void user_verify_the_result_displayed()  
	{
		
		p.verfyResult();
	}

	@Then("^set the price bar as ten thousand max$")
	public void set_the_price_bar_as_ten_thousand_max() 
	{
		p.setPrice();
	}

	@Then("^set opearting system as Android$")
	public void set_opearting_system_as_Android() 
	{
		p.setOperatingSystem();
	}

	@Then("^click on the newest first option$")
	public void click_on_the_newest_first_option() throws Exception
	{
		p.setNewestFirst();
	}

	@Then("^display the first five names and price of the mobiles$")
	public void display_the_first_five_names_and_price_of_the_mobiles()  
	{
		p.displayNames();
	}


	@Then("^close the browser$")
	public void close_the_browser()
	{
		
		driver.close();

	}



	
}
