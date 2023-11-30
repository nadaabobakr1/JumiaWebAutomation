package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignOut {
	
	WebDriver driver = null;
	
	By account_Dropdown_btn = By.xpath("//label[@class='trig -df -i-ctr -fs16']");
	By logOutButton= By.xpath("//button[@class='btn _def -mvs']");
	
	
	public SignOut(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickOnAccountDropdown() {
		
		driver.findElement(account_Dropdown_btn).click();
	}
	
	
	
	public void clickOnLogout() {
		
		driver.findElement(logOutButton).click();
	}
	
	
	

}
