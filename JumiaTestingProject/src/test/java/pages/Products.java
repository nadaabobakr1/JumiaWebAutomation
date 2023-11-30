package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {
	
	WebDriver driver=null;
	
	By firstProduct =
		By.xpath("//a[@class='core' and contains (@data-position, '1')]");

	public Products(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickOnFirstProduct() {
		driver.findElement(firstProduct).click();
		
	}
	
	

}
