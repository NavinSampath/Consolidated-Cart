package stepdefinition;

import ElementObjects.GamingElements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Consolidatedcart {
	
	GamingElements ge = new GamingElements();
	
	@Given("^When Browser Loads$")
	public void when_Browser_Loads() throws Throwable {
	 Thread.sleep(2000);
	}

	@When("^Launching Logitech Gaming$")
	public void launching_Logitech_Gaming() throws Throwable {
		ge.openingallpartnertabs();
	}

	@Then("^Add products from Gaming Mice$")
	public void add_products_from_Gaming_Mice() throws Throwable {
		ge.addingproductsinlogitechg();
		//ge.addingproductsinastro();
		//ge.addingproductsinjaybird();
		//ge.addingproductsinue();
		ge.addingproductsinlogi();
	  
	}

	@Then("^Validate in same tab as well as in partnered tabs whether the products which is added in Logitech Gaming is reflected or not$")
	public void validate_in_same_tab_as_well_as_in_partnered_tabs_whether_the_products_which_is_added_in_Logitech_Gaming_is_reflected_or_not() throws Throwable {
		Thread.sleep(2000);
	}



}
