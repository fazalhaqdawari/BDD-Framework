package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObj extends Base {

	// Once we create Page obj we need to extends the Base class to use Parent Class
	// properties such is WebDriver driver
	// we create a constructor and inside the constructor we define the
	// PageFactory.initElements
	// method to initialize the WebElements in this page.

	public RetailPageObj() {

		PageFactory.initElements(driver, this);
	}

	// we need to store UI WebElements in a private webElement using @FindBy
	// annotations of
	// PageFactory class.

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;

	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iphoneImage;
	
	// webElements for register page 
	
	
	@FindBy(xpath ="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	private WebElement registeroption;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;

	@FindBy(xpath ="//input[@id='input-lastname']")
	private WebElement lastNameField; 
	
	@FindBy(xpath ="//input[@id='input-email']")
	private WebElement emailField;
	
	@FindBy(xpath ="//input[@id='input-telephone']")
	private WebElement telephoneField;
	
	@FindBy(xpath ="//input[@id='input-password']")
	private WebElement pawwordField;
	
	@FindBy(xpath ="//input[@id='input-confirm']")
	private WebElement confirmdPasswordField;
	
	@FindBy(xpath ="//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]")
	private WebElement yesSubscribeButton;
	
	@FindBy(xpath ="//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]/input[1]")
	private WebElement noSubscribeButton;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicyCheckBox;
	
	@FindBy(xpath ="//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
	private WebElement continueButton;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedMessage;
	
	// we need to create public methods to perform required actions on each elements
	// we stored.

	public void enterValueToSearchBar(String value) {
		WebDriverUtility.enterValue(searchBar, value);
	}

	public void clickOnSearchButton() {
		WebDriverUtility.clickOnElement(searchButton);
	}

	public boolean iPhoneImageIsDisplayed() {

		if (iphoneImage.isDisplayed())
			return true;
		else
			return false;

	}
	
	// we need to create Methods to perform on each WebElement
	
	
	
	
	public void clickonRegister() {
		WebDriverUtility.clickElementWithJS(registeroption);
	}
	
	public void enterFristName(String fName){
		WebDriverUtility.enterValue(firstNameField, fName);

	}
	public void enterLastName(String lName) {
		WebDriverUtility.enterValue(lastNameField, lName);

	}
	public void enterEmail(String email) {
		WebDriverUtility.enterValue( emailField, email);

	}
	
	public void enterTelephone(String phoneNumber) {
		WebDriverUtility.enterValue( telephoneField, phoneNumber);

	}
	public void enterPassword(String password) {
		WebDriverUtility.enterValue(pawwordField, password);
	}
	public void enterConfirmPassword(String confirmPassword) {
		WebDriverUtility.enterValue(confirmdPasswordField, confirmPassword);
	}
	
	public void subscribe(String valueOfSubscribe) {
		if (valueOfSubscribe.equalsIgnoreCase("yes")) {
			if (!yesSubscribeButton.isSelected())
				WebDriverUtility.clickOnElement(yesSubscribeButton);
		} else
			WebDriverUtility.clickOnElement(noSubscribeButton);
	}
	public void checkPrivacyPolicy() {
		if (privacyPolicyCheckBox.isDisplayed()) {
			privacyPolicyCheckBox.click();
		}
	}
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}
	public boolean registrationOutcome() {
		boolean successMessage = accountCreatedMessage.isDisplayed();
		return successMessage;
		
	}	
	
}
