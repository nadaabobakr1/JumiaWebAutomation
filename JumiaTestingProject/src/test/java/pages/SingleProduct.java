package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingleProduct {
	
	WebDriver driver=null;
	
//	By addToCartButton = By.xpath("//button[@class='add btn _prim -pea _i -fw']");
	By addToCartButton = By.xpath("//form[@id='add-to-cart']");
	
	By increaseQuantityButton = By.xpath("//button[@class='btn _prim _qty -paxs' and contains (@aria-label, 'increase cart quantity')]");
	
	By decreaseQuantityButton = By.xpath("//button[@class='btn _prim _qty -paxs' and contains (@aria-label, 'decrease cart quantity')]");
	
	By saveItemButton = By.xpath("//button[@class='btn _def _i _rnd -mas' ]");

	public SingleProduct(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickOnAddToCartButton() {
		driver.findElement(addToCartButton).click();
		
	}
	
	public void clickOnIncreaseQuantityButton(){
		
		Boolean Display = driver.findElement(increaseQuantityButton).isDisplayed();
		if(Display == true) {
			
			driver.findElement(increaseQuantityButton).click();
			
		}
		
		
	}
	
	public void clickOnDecreaseQuantityButton(){
		
		driver.findElement(decreaseQuantityButton).click();
		
	}
	
	public void clickOnSaveItemButton() {
		driver.findElement(saveItemButton).click();
	}
	
	

}
