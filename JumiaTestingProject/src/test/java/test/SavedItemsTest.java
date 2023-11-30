package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Cart;
import pages.HomepageObjects;
import pages.Products;
import pages.SavedItems;
import pages.SignInPage1;
import pages.SignInPage2;
import pages.SingleProduct;

public class SavedItemsTest {
	WebDriver driver=null;
	
	SingleProduct singleProduct=null;
	HomepageObjects homepage = null;
	Products productsPage= null;
	SavedItems savedItemsPage=null;
	
	String product1="pasta";
	String product2="rice";
	String email="itiapiproject@gmail.com";
	String password="iti@api@project";
	
	@BeforeTest
	public void setUpTest() {
		
		driver = new ChromeDriver();
		driver.get("https://www.jumia.com.eg/");
		
		singleProduct = new SingleProduct(driver);
		homepage = new HomepageObjects(driver);
		productsPage= new Products(driver);
		savedItemsPage= new SavedItems (driver);
		
		
		HomepageObjects closePopup = new HomepageObjects(driver);
		closePopup.closeNewsLetterPopup();	
		
		
	}
	
	@Test (priority = 1)
	public void signIn() throws Exception {
		
		HomepageObjects accountBtn = new HomepageObjects(driver);
		accountBtn.clickOnAccountButton();
		
		Thread.sleep(1000);
		
		HomepageObjects signInBtn = new HomepageObjects(driver);
		signInBtn.clickOnSigninInsideAccountDropdown();
		
		Thread.sleep(4000);
		SignInPage1 emailObject = new SignInPage1(driver);
		
		emailObject.setInput(email);
		emailObject.clickOnContinue();
		
		Thread.sleep(3000);
		
		SignInPage2 passwordObject = new SignInPage2(driver);
		
		
		passwordObject.setInput(password);
		passwordObject.clickOnLoginBtn();
		Thread.sleep(2000);
		
	}
	
	
	@Test (priority = 2 ,dependsOnMethods = {"signIn"})
	public void saveItem() throws Exception {
		homepage.setTextInSearchBox(product1);
		homepage.clickOnSearchButton();
		Thread.sleep(5000);
		productsPage.clickOnFirstProduct();
		
		Thread.sleep(6000);
		
		singleProduct.clickOnSaveItemButton();
		Thread.sleep(8000);
		
		
		
		
	}
	
	
	
	
	
	@Test (priority =3,dependsOnMethods = {"signIn"})
	
	public void saveAnotherItem() throws Exception {
		
		
		homepage.clearInput();
		homepage.setTextInSearchBox(product2);
		homepage.clickOnSearchButton();
		Thread.sleep(7000);
		productsPage.clickOnFirstProduct();
		
		Thread.sleep(5000);
		
		singleProduct.clickOnSaveItemButton();
		
		Thread.sleep(10000);
		
	}
	
	@Test (priority = 4, dependsOnMethods = {"signIn"})
	public void openSavedItems() throws Exception{
		Thread.sleep(5000);
		homepage.clickOnAccountButton();
		
		Thread.sleep(3000);
		homepage.clickOnsavedItemsInsideAccountDropdown();
		Thread.sleep(3000);
		
	}
	
	@Test (priority = 5 , dependsOnMethods = {"openSavedItems"})
	public void removeSavedItem() throws Exception{
		savedItemsPage.clickOnRemoveButton();
		Thread.sleep(5000);
		
	}
	
	@Test (priority = 6 , dependsOnMethods = {"openSavedItems"})
	public void addSavedItemToCart() throws Exception{
		Thread.sleep(7000);
		savedItemsPage.clickOnBuyNowButton();
		Thread.sleep(8000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		
	}

}


