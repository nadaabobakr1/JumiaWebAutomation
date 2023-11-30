package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomepageObjects;
import pages.SignInPage1;
import pages.SignInPage2;

public class SignInTest {
	
		WebDriver driver=null;
		HomepageObjects accountBtn =null;
		SignInPage1 emailObject =null;
		SignInPage2 passwordObject = null;
		
		String validEmail="itiapiproject@gmail.com";
		String validPassword="iti@api@project";
		
		//invalid email missing @
		String invalidEmail1="itigmail.com";
		
		//invalid email missing .com
		String invalidEmail2="iti@gmail";
		
		//invalid email missing gmail
		String invalidEmail3="iti@.com";
		
		//invalid email missing @gmail.com
		String invalidEmail4="iti";
		
		//invalid password 1 
		String invalidPassword1 = "qwww";
		
		//invalid password 2
		String invalidPassword2 = "iti@api";
		
		
	
	@BeforeTest
	public void setUpTest() {
		
		driver = new ChromeDriver();
		driver.get("https://www.jumia.com.eg/");
		accountBtn = new HomepageObjects(driver);
		emailObject = new SignInPage1(driver);
		passwordObject = new SignInPage2(driver);
	}
	
	@Test (priority = 1)
	public  void closeNewsLetterPopup() {
		
		HomepageObjects closePopup = new HomepageObjects(driver);
		closePopup.closeNewsLetterPopup();	
		
	}
	
	@Test (priority = 2)
	public void accountSigninBtn() throws Exception {
		
		
		accountBtn.clickOnAccountButton();
		
		Thread.sleep(1000);
		
		
		accountBtn.clickOnSigninInsideAccountDropdown();
		
		Thread.sleep(4000);
		
		
	}
	
	 @Test (priority = 3)
	public void SignInUsingInvalidEmail1() throws Exception  {
		
		
	
		
		
		emailObject.setInput(invalidEmail1);
		emailObject.clickOnContinue();
		
		Thread.sleep(3000);
		emailObject.emailErrorMsgIsDisplayed();
		emailObject.clearInput();
		
	}
	
	@Test (priority = 4)
	public void SignInUsingInvalidEmail2() throws Exception  {
		
		
	
//		SignInPage1 emailObject = new SignInPage1(driver);
		
		emailObject.setInput(invalidEmail2);
		emailObject.clickOnContinue();
		
		Thread.sleep(3000);
		emailObject.emailErrorMsgIsDisplayed();
		emailObject.clearInput();
		
	}
	
	@Test (priority = 4)
	public void SignInUsingInvalidEmail3() throws Exception  {
		
		
	
//		SignInPage1 emailObject = new SignInPage1(driver);
		
		emailObject.setInput(invalidEmail3);
		emailObject.clickOnContinue();
		
		Thread.sleep(3000);
		emailObject.emailErrorMsgIsDisplayed();
		emailObject.clearInput();
		
	}
	
	@Test (priority = 5)
	public void SignInUsingInvalidEmail4() throws Exception  {
		
		
	
//		SignInPage1 emailObject = new SignInPage1(driver);
		
		emailObject.setInput(invalidEmail4);
		emailObject.clickOnContinue();
		
		Thread.sleep(3000);
		emailObject.emailErrorMsgIsDisplayed();
		emailObject.clearInput();
		
	}

	@Test (priority = 6)
	public void SignInUsingValidEmail() throws Exception  {
		
		
	
		//SignInPage1 emailObject = new SignInPage1(driver);
		
		emailObject.setInput(validEmail);
		emailObject.clickOnContinue();
		
		Thread.sleep(7000);
		
	}
	
	@Test (priority = 7 , dependsOnMethods = {"SignInUsingValidEmail"})
	public void SignInUsingInvalidPassword1() throws Exception  {
		
		
		
		passwordObject.setInput(invalidPassword1);
		passwordObject.clickOnLoginBtn();
		Thread.sleep(6000);
		
		passwordObject.passwordErrorMsgIsDisplayed();
		passwordObject.clearInput();
		
		

		
	}
	
	@Test (priority = 8 , dependsOnMethods = {"SignInUsingValidEmail"})
	public void SignInUsingInvalidPassword2() throws Exception  {
		
	
		
		
		passwordObject.setInput(invalidPassword2);
		passwordObject.clickOnLoginBtn();
		Thread.sleep(6000);
		
		passwordObject.passwordErrorMsgIsDisplayed();
		passwordObject.clearInput();
		
		

		
	}
	
	
	
	@Test (priority = 9 , dependsOnMethods = {"SignInUsingValidEmail"})
	public void SignInValidPasswordField() throws Exception  {
	
		passwordObject.setInput(validPassword);
		passwordObject.clickOnLoginBtn();
		Thread.sleep(6000);
		
		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		
	}
	
	

}
