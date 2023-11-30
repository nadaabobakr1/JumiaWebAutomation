package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Cart;
import pages.HomepageObjects;
import pages.Products;
import pages.SingleProduct;

public class SearchForProduct {
	
	String product="pasta";
	
	WebDriver driver=null;
	Cart cart =null;
	//SingleProduct singleProduct=null;
	HomepageObjects searchPage = null;
	Products productsPage= null;
	
	
	
	
	@BeforeTest
	public void setUpTest() {
		
		driver = new ChromeDriver();
		driver.get("https://www.jumia.com.eg/");
		driver.manage().window().maximize();
		cart = new Cart(driver);
		//singleProduct = new SingleProduct(driver);
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
	public  void searchForProduct( ) throws Exception {
		
		
		
		searchPage.setTextInSearchBox(product);
		searchPage.clickOnSearchButton();
		
		Thread.sleep(3000);
		
		
		productsPage.clickOnFirstProduct();
		
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		
	}
}
