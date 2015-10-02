package Practice_Generel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Open {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://gmail.com");
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Gmail = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		Gmail.click();
		
		WebElement Sign_in = driver.findElement(By.xpath("//*[@id='gmail-sign-in']"));
		Sign_in.click();
		
		WebElement EnterYourEmail = driver.findElement(By.xpath("//*[@id='Email']"));
		EnterYourEmail.sendKeys("mshahnewaz1@gmail.com");
		//EnterYourEmail.sendKeys("md83shahnewaz@gmail.com");
		
		WebElement Next1 = driver.findElement(By.xpath("//*[@id='next']"));
		Next1.click();
		
		WebElement Password = driver.findElement(By.xpath("//*[@id='Passwd']"));
		Password.sendKeys("01716593313");
		
		WebElement Next2 = driver.findElement(By.xpath("//*[@id='signIn']"));
		Next2.click();
		
		WebElement Dynamic_Inbox = driver.findElement(By.xpath("//*[contains(@title,'Inbox')]"));
		Dynamic_Inbox.click();
		
		
		
		
		
		
		
		
		
		

	}

}
