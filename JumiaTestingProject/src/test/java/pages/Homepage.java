package pages;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	private static WebElement element = null;
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jumia.com.eg/");
		element=news_letter_close_btn(driver);
		element.click();
		Thread.sleep(1000);
		
		
		
		element = textbox_search(driver);
		
		element.sendKeys("phone");
		Thread.sleep(1000);
		element= search_btn(driver);
		element.click();
		Thread.sleep(1000);
		element=cart_btn(driver);
		element.click();
		
		element=account_btn(driver);
		element.click();
		
		
		
	}
	
	
	
	
	public static WebElement textbox_search (WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@id='fi-q']"));
		return element;
	}
	
	
    public static WebElement search_btn (WebDriver driver) {
		
		element = driver.findElement(By.xpath("//button[@class='btn _prim _md -mls -fsh0']"));
		return element;
	}
    
    public static WebElement news_letter_close_btn (WebDriver driver) {
    	
    	element = driver.findElement(By.xpath("//button[@class='cls' and contains(@aria-label, 'newsletter_popup_close-cta')]"));
		return element;	
    }
    
	
    
  public static WebElement cart_btn(WebDriver driver) {
    	
    	element = driver.findElement(By.xpath("//a[@href='/cart/']"));
		return element;
    	
    }
  
  public static WebElement account_btn(WebDriver driver) {
  	
  	element = driver.findElement(By.xpath("//label[@class='trig -df -i-ctr -fs16']"));
		return element;
  	
  }
  
  public static WebElement signin_inside_account_btn(WebDriver driver) {
	  	
	  	element = driver.findElement(By.xpath("//label[@class='trig -df -i-ctr -fs16']"));
			return element;
	  	
	  }
    
    
	
	
	
	
	

}
