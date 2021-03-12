package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HP3065 extends Base{
	
	public HP3065() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[3]")
	private WebElement laptopAndNotebooktab;
	public void clickOnLaptoAndNotebooktab() {
		laptopAndNotebooktab.click();
	}
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showLaptopsAndNoteBooks;
	public void clickOnShowLaptopsAndNoteBooks() {
		showLaptopsAndNoteBooks.click();
	}
	@FindBy(xpath = " //body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
	private WebElement AddToCartMacbook;
	public void clickOnAddToCartMacbook() {
		AddToCartMacbook.click();
	}
	
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddToCart;
	public void clickAddToCart() {
		AddToCart.click();
	}
	
	@FindBy(xpath = "//a[contains(text(),'shopping cart')]")
	private WebElement shopingCartOption1;
	public void clickOnShopingCartCartOption1() {
		shopingCartOption1.click();
	}
	
	@FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/span[1]/button[2]/i[1]")
	private WebElement xButtonOption;
	public void clickOnXButtonOption() {
		xButtonOption.click();
	}
	
	
	
	}
	
		


