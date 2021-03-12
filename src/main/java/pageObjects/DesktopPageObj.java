package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObj extends Base {
	
	
	public DesktopPageObj() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktops;
	
	@FindBy(xpath = "(//a[@class='see-all'])[1]")
	private WebElement showAllDesktops;
	
	
	public void clickOnDesktops() {
		desktops.click();
	}
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	
	
	
	
	
	

}
