package retailMeNotPack;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RtailMeNot_TestCase {
	@Test
	public void Test() throws InterruptedException {
		
		//Step 1 - going to link "www.retailmenot.com"
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.retailmenot.com");
		
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		
		//Step 2 - Selecting 'Product Details' from 'Browse Coupon'
		driver.findElement(By.xpath("//a[text()='Coupons']")).click();
		driver.findElement(By.xpath("//a[@href='/ideas/hot-products']")).click();
		
		//Step 3 - Verifying, Landed in the "Product Deal" Page
		String LandingPage_ProductDeals = driver.findElement(By.xpath("//h1[@class='h1' and text()='Product Deals']")).getText();
		Assert.assertTrue(LandingPage_ProductDeals.equalsIgnoreCase("Product Deals"), "Not Landing in the 'Product Deals' Page'");
		
		//Step 4 - Selecting "Electronics" link
		driver.findElement(By.xpath("//nav[@class='subnav show-at-large list-inline-links']/a[@href='#Electronics']")).click();
		
		//Step 5 - Number of links
		System.out.println("Total Number of links - "+driver.findElements(By.tagName("a")).size());
		
		//Step 6 - Selecting "Coupon codes" from "Browse Coupons"
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//a[text()=' Browse Coupons '])[2]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()=' Browse Coupons '])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Coupon Codes'])[2]")).click();
		
		//Step 7 - Clicking on "GAP FACTORY" to look into Offer and Code
		driver.findElement(By.xpath("//img[@alt='Gap Factory Outlet']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
            driver.switchTo().window(window);
            if (driver.getTitle().contains("Gap Factory - Extra 15% Off + Up To 70% Off Storewide")) {
            	Thread.sleep(2000);
            }
         }
		//Step 8(1) - Veriying "Offer"
		String Offer = driver.findElement(By.xpath("//h1[text()='          Extra 15% Off + Up To 70% Off Storewide                ']")).getText();
		Assert.assertTrue((Offer.contains("15%") && Offer.contains("70%")), "Offers from GAP Company should be '70%' + extra '15%'");
		
		//Step 8(1) - Veriying "Coupon Code"
		String CouponCode = driver.findElement(By.xpath("//p[@class='redeem']")).getText();
		Assert.assertTrue(CouponCode.contains("RMN15"), "CouponCode from GAP Company should be 'RMN15'");

		Thread.sleep(1000);
		driver.quit();
		
	}
}
