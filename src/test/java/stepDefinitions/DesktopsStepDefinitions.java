package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopPageObj;
import utilities.WebDriverUtility;

public class DesktopsStepDefinitions extends Base {
	
	DesktopPageObj desktops = new DesktopPageObj();
	
	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() {
		desktops.clickOnDesktops();
		logger.info("User clicked on desktop");
		WebDriverUtility.screenShot();
	}
	

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() {
		desktops.clickOnShowAllDesktops();
		logger.info("user click on show all desktops");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
		WebDriverUtility.screenShot();
		logger.info("by this should take screen shot");
	}
	
	
	
	
	
	
	
	
	

}
