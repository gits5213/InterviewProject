package PersonalPactice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Box_Log_In {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		WebElement SearchBox = driver.findElement(By.name("q"));
		SearchBox.sendKeys("Box: Customer Log In");
		driver.findElement(By.name("btnG")).click();	
		driver.findElement(By.linkText("Box: Customer Log In")).click();
		
		
		WebElement TypeEmail = driver.findElement(By.name("login"));
		TypeEmail.sendKeys("mdszaman83@gmail.com");
		//SearchBox.sendKeys("shanto191183@gmail.com");
		//SearchBox.sendKeys("2automationremoteschool@gmail.com");
		
		
		WebElement TypePassword = driver.findElement(By.name("password"));
		TypePassword.sendKeys("01716593313");
		driver.findElement(By.id("continue")).click();
		
		
		
		//driver.manage().deleteAllCookies();
		//driver.quit();

	}

}
