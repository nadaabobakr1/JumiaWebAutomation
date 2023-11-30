package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
	
	WebDriver driver=null;
	
	By cart_btn = By.xpath("//a[@href='/cart/']");
	
	By startShoppingButton = By.xpath("//a[@href='/' and @class='btn _prim -mtl']");
	
	By checkoutButton = By.xpath("//a[@href='/checkout/summary/']");
	By removeButton = By.xpath("//button[@class='btn _def _ti -mra' and contains (@data-pop-open, 'removeFromCart')]");

	By increaseQuantityButton = By.xpath("//button[@class='btn _prim _qty -paxs' and contains (@aria-label, 'increase cart quantity')]");
	
	By decreaseQuantityButton = By.xpath("//button[@class='btn _prim _qty -paxs' and contains (@aria-label, 'decrease cart quantity')]");
	By removeItemPopUpButton = By.xpath("//button[@class='btn _prim _i -fw -fh']");
	

	public Cart(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void clickOnCartButton(){
		
		driver.findElement(cart_btn).click();
		
	}
	
	public void clickOnStartShoppingButton(){
		
		driver.findElement(startShoppingButton).click();
		
	}
	
	public void clickOnCheckoutButton(){
		
		driver.findElement(checkoutButton).click();
		
	}
	
	public void clickOnRemoveItemButton(){
		
		driver.findElement(removeButton).click();
		
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
	
	
	
	public void clickOnRemoveItemPopUpButton(){
		
		driver.findElement(removeItemPopUpButton).click();
		
	}
	

}
