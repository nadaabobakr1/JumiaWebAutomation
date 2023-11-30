package test;

import java.security.SignedObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomepageObjects;
import pages.SignInPage1;
import pages.SignInPage2;
import pages.SignOut;

public class SignOutTest {
	
	WebDriver driver=null;
	String email="itiapiproject@gmail.com";
	String password="iti@api@project";
	SignOut signOutObject= null;
	
	
	@BeforeClass
	public void setUpTest() {
		
		driver = new ChromeDriver();
		driver.get("https://www.jumia.com.eg/");
		signOutObject= new SignOut(driver);
	}
	
	@Test (priority = 1)
	public  void closeNewsLetterPopup() {
		
		HomepageObjects closePopup = new HomepageObjects(driver);
		closePopup.closeNewsLetterPopup();	
		
	}
	
	@Test (priority = 2)
	public void accountSigninBtn() throws Exception {
		
		HomepageObjects accountBtn = new HomepageObjects(driver);
		accountBtn.clickOnAccountButton();
		
		Thread.sleep(1000);
		
		HomepageObjects signInBtn = new HomepageObjects(driver);
		signInBtn.clickOnSigninInsideAccountDropdown();
		
		Thread.sleep(4000);
		
		
	}
	

	@Test (priority = 3)
	public void SignInUsingEmail() throws Exception  {
		
		
	
		SignInPage1 emailObject = new SignInPage1(driver);
		
		emailObject.setInput(email);
		emailObject.clickOnContinue();
		
		Thread.sleep(3000);
		
		
	}
	
	
	@Test (priority = 4)
	public void SignInPasswordField() throws Exception  {
	
		SignInPage2 passwordObject = new SignInPage2(driver);
		
		
		passwordObject.setInput(password);
		passwordObject.clickOnLoginBtn();
		
		
	}
	
	@Test (priority = 5)
	public void signOutTest() throws Exception {
		
		Thread.sleep(1000);
		
		
		signOutObject.clickOnAccountDropdown();
		Thread.sleep(250);
		signOutObject.clickOnLogout();
		
		Thread.sleep(2000);
		
		
		}
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		
	}
	

}
