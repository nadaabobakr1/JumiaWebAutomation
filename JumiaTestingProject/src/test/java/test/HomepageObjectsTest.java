package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomepageObjects;

public class HomepageObjectsTest {
	
	WebDriver driver=null;
	
	
	@BeforeClass
	public void setUpTest() {
		
		driver = new ChromeDriver();
		driver.get("https://www.jumia.com.eg/");
	}
	
	@Test (priority = 1)
	public  void closeNewsLetterPopup() {
		
		HomepageObjects closePopup = new HomepageObjects(driver);
		closePopup.closeNewsLetterPopup();	
		
	}
	
	@Test (priority = 2)
	public  void searchTest() {
	
		HomepageObjects searchObject= new HomepageObjects(driver);

		searchObject.setTextInSearchBox("phone");
		searchObject.clickOnSearchButton();		
		
	}
	
	@Test (priority = 3)
	public void CartBTn() {
		
		HomepageObjects cartBtn = new HomepageObjects(driver);
		cartBtn.clickOnCartButton();
		
	}
	
	@Test (priority = 4)
	public void accountSigninBtn() throws Exception {
		
		HomepageObjects accountBtn = new HomepageObjects(driver);
		accountBtn.clickOnAccountButton();
		Thread.sleep(1000);
		HomepageObjects signInBtn = new HomepageObjects(driver);
		signInBtn.clickOnSigninInsideAccountDropdown();
		
		
	}
	

}
