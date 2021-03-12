package stepDefinitions;


import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HP3065;
import utilities.WebDriverUtility;

public class StepDefinitionLaptopAndNoteBook extends Base {
	
	HP3065 object = new HP3065();
	
	
	
	@When("^User click on Laptop &NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab() throws Throwable {
	   object.clickOnLaptoAndNotebooktab();
	}

	@When("^User click on Show all Laptop &NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() throws Throwable {
	    object.clickOnShowLaptopsAndNoteBooks();
	}

	@When("^User click on MacBook item$")
	public void user_click_on_MacBook_item() throws Throwable {
	    object.clickOnAddToCartMacbook();
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
	   object.clickAddToCart();
	}

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
	  WebDriverUtility.screenShot();
	}

	@Then("^User should see ‘(\\d+) tem\\(s\\)-(\\d+)\\.(\\d+)’ showed to the cart$")
	public void user_should_see_tem_s_showed_to_the_cart(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   WebDriverUtility.screenShot();
	   logger.info(driver);
	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
	    object.clickOnShopingCartCartOption1();
	}

	@Then("^user click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
	    object.clickOnXButtonOption();
	}

	@Then("^item should be removed and cart should show ‘(\\d+) item\\(s\\)’$")
	public void item_should_be_removed_and_cart_should_show_item_s(int arg1) throws Throwable {
	  WebDriverUtility.screenShot();
	  logger.info(driver);
	}


}