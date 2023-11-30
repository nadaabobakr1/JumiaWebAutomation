package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepageObjects {
	
	WebDriver driver=null;
	
	By news_letter_close_btn = By.xpath("//button[@class='cls' and contains(@aria-label, 'newsletter_popup_close-cta')]");
	By textbox_search = By.xpath("//input[@id='fi-q']");
	By search_btn = By.xpath("//button[@class='btn _prim _md -mls -fsh0']");
	By cart_btn = By.xpath("//a[@href='/cart/']");
	By account_btn = By.xpath("//label[@class='trig -df -i-ctr -fs16']");
	By signin_inside_account_btn = By.xpath("//a[contains(text(),'Sign In')]");
	By saved_items_inside_account_dropdown = By.xpath("//a[@href='/customer/wishlist/index/' and contains(text(),'Saved Items')]");
	
	public HomepageObjects(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void closeNewsLetterPopup() {
		driver.findElement(news_letter_close_btn).click();
	}
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickOnSearchButton() {
		driver.findElement(search_btn).click();
	}
	
	public void clickOnCartButton() {
		driver.findElement(cart_btn).click();
	}
	
	public void clickOnAccountButton() {
		driver.findElement(account_btn).click();
	}
	
	public void clickOnSigninInsideAccountDropdown() {
		driver.findElement(signin_inside_account_btn).click();
	}
	
	public void clickOnsavedItemsInsideAccountDropdown() {
		driver.findElement(saved_items_inside_account_dropdown).click();
	}
	
	public void clearInput() {
		WebElement	input= driver.findElement(textbox_search);
		input.clear();
		
	}
}
