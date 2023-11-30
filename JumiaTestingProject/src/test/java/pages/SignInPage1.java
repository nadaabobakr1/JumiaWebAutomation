package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage1 {
	
	WebDriver driver=null;
	
	By input_textbox = By.xpath("//input[@class='mdc-text-field__input' and @name='identifierValue' and @id='input_identifierValue' and contains(@aria-labelledby, 'Email or Mobile Number')]");
	By continue_button = By.xpath("//button[@class='mdc-button mdc-button--touch mdc-button--raised access-btn']");
	By emailErrorMsg = By.xpath("//span[@id='invalid-text-field-error-message']");
	
	
	public SignInPage1(WebDriver driver) {
		
		this.driver = driver;
	}



	public void setInput(String email) {
		driver.findElement(input_textbox).sendKeys(email);	
		
	}
	
	public void clearInput() {
		WebElement	input= driver.findElement(input_textbox);
		input.clear();
		
	}
	
	public void clickOnContinue() {
		driver.findElement(continue_button).click();
	}
	
	public void emailErrorMsgIsDisplayed() {
		Boolean Display = 
				driver.findElement(emailErrorMsg).isDisplayed();
		if(Display == true) {
			
			System.out.println("Email error mesage is displayed SUCCESS !!");
			
		}
	}
	
	

}
