package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage2 {
	
	WebDriver driver=null;
	
	By input_textbox_password = By.xpath("//input[@name='password']");
	By login_button = By.xpath("//button[@id='loginButton']");
	By passwordErrorMsg = By.xpath("//div[@class='mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg password']");
	
	
public SignInPage2(WebDriver driver) {
		
		this.driver = driver;
	}


public void setInput(String password) {
	driver.findElement(input_textbox_password).sendKeys(password);

	
	
	
}

public void clickOnLoginBtn() {
	driver.findElement(login_button).click();
}

public void passwordErrorMsgIsDisplayed() {
	Boolean Display = 
			driver.findElement(passwordErrorMsg).isDisplayed();
	if(Display == true) {
		
		System.out.println("Password error message is displayed SUCCESS !!!");
		
	}
}

public void clearInput() {
	WebElement	input= driver.findElement(input_textbox_password);
	input.clear();
	
}
}
