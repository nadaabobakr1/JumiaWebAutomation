package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SavedItems {
	
	WebDriver driver=null;
	
	By startShoppingButton = By.xpath("//a[@href='/' and contains(text(),'Continue Shopping')]");
	
	By buyNowButton = By.xpath("//button[@class='btn _prim _md' and contains(text(),'Buy Now')]");
	
	By removeButton = By.xpath("//button[@class='btn _def _ti -mrs' and contains(text(),'Remove')]");
	
	
	public SavedItems(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnStartShoppingButton() {
		driver.findElement(startShoppingButton).click();
	}
	
	public void clickOnBuyNowButton() {
		driver.findElement(buyNowButton).click();
	}
	public void clickOnRemoveButton() {
		driver.findElement(removeButton).click();
	}

	
}
