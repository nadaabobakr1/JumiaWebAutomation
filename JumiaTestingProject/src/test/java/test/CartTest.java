package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Cart;
import pages.HomepageObjects;
import pages.Products;
import pages.SingleProduct;

public class CartTest {
	
	WebDriver driver=null;
	Cart cart =null;
	SingleProduct singleProduct=null;
	HomepageObjects searchPage = null;
	Products productsPage= null;
	String product1="pasta";
	String product2="rice";
	
	
	
	
	
	@BeforeTest
	public void setUpTest() {
		
		driver = new ChromeDriver();
		driver.get("https://www.jumia.com.eg/");
		driver.manage().window().maximize();
		cart = new Cart(driver);
		singleProduct = new SingleProduct(driver);
		searchPage = new HomepageObjects(driver);
		productsPage= new Products(driver);
	}
	
	
	@Test (priority = 1)
	public  void closeNewsLetterPopup() throws Exception {
		
		HomepageObjects closePopup = new HomepageObjects(driver);
		closePopup.closeNewsLetterPopup();	
		
		Thread.sleep(2000);
	}
	
	
	@Test (priority = 2)
	public  void ClickOnEmptyCart() throws Exception {
		
		
		cart.clickOnCartButton();
		Thread.sleep(3000);
		cart.clickOnStartShoppingButton();
		Thread.sleep(3000);
		
	
	}
	
	@Test (priority = 3)
	public  void addItemToCart( ) throws Exception {
		
		
		
		searchPage.setTextInSearchBox(product1);
		searchPage.clickOnSearchButton();
		
		Thread.sleep(3000);
		
		
		productsPage.clickOnFirstProduct();
		
		Thread.sleep(10000);
		
		
		singleProduct.clickOnAddToCartButton();
		
		Thread.sleep(3000);	
		
		
	
	}
	
	@Test (priority = 4)
	public  void increaseItemQuantityFromSingleProductPage() throws Exception {
		
		
			singleProduct.clickOnIncreaseQuantityButton();
			Thread.sleep(3000);

		
	
	}
	
	@Test (priority = 5)
	public  void decreaseItemQuantityFromSingleProductPage() throws Exception {
		
		
		singleProduct.clickOnDecreaseQuantityButton();
		Thread.sleep(5000);

	
	}
	
	@Test (priority = 6)
	public void addAnotherItemToCart() throws Exception {
		
		Thread.sleep(3000);
		searchPage.setTextInSearchBox(product2);
		searchPage.clickOnSearchButton();
		
		Thread.sleep(10000);
		
		
		productsPage.clickOnFirstProduct();
		
		Thread.sleep(8000);
		
		
		singleProduct.clickOnAddToCartButton();
		
		Thread.sleep(8000);	
		
	
		
	}
	
	
	@Test (priority = 7 ,dependsOnMethods = { "addAnotherItemToCart" })
	public void openCartPage() throws Exception {
		Thread.sleep(6000);
		cart.clickOnCartButton();
		Thread.sleep(2000);
		
	}
	
	@Test (priority = 8 ,dependsOnMethods = { "openCartPage" })
	public  void increaseItemQuantityFromCartPage() throws Exception {
		
		Thread.sleep(3000);
		cart.clickOnIncreaseQuantityButton();
		cart.clickOnIncreaseQuantityButton();
		Thread.sleep(3000);
	
	}
	
	@Test (priority = 9 ,dependsOnMethods = { "openCartPage" })
	public  void decreaseItemQuantityFromCartPage() throws Exception {
		Thread.sleep(3000);
		
		cart.clickOnCartButton();
		cart.clickOnDecreaseQuantityButton();
		Thread.sleep(5000);
	
	}
	
	@Test (priority = 10 ,dependsOnMethods = { "openCartPage" })
	public  void removeItemFromCart() throws Exception {
		
		
		
		cart.clickOnCartButton();
		Thread.sleep(2000);
		cart.clickOnRemoveItemButton();
		
		Thread.sleep(2000);
		
		cart.clickOnRemoveItemPopUpButton();
		
		Thread.sleep(2000);
			
	
	}
	
	@Test ( priority=11 ,dependsOnMethods = { "openCartPage" } )
	public void checkout() throws Exception {
		cart.clickOnCartButton();
		cart.clickOnCheckoutButton();
		Thread.sleep(5000);
		
		
	}
	

	
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		
	}

}
