package Practice_Generel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class CarrierBuilder_Login {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Search_Google = driver.findElement(By.name("q"));
		Search_Google.sendKeys("Careerbuilder Account login");
		
		WebElement Google_Search = driver.findElement(By.name("btnG"));
		Google_Search.click();
	
		WebElement ClickOnLink= driver.findElement(By.linkText("Login Jobs on CareerBuilder.com"));
		ClickOnLink.click();
		
		WebElement ClickOnSignIn = driver.findElement(By.id("cbhlSignIn"));
		ClickOnSignIn.click();
		
		
		WebElement Type_Name = driver.findElement(By.id("JobSeekerLoginV3_cbsys_login_email"));
		Type_Name.sendKeys("md83shahnewaz@gmail.com");
		

		WebElement Type_Password = driver.findElement(By.name("JobSeekerLoginV3:cbsys_login_password"));
		Type_Password.sendKeys("Shahnewaz1@");
		
		WebElement ClickOnSign_in= driver.findElement(By.xpath("//*[@id='btnsignin']"));
		ClickOnSign_in.click();
		
				
		WebElement MainMenu = driver.findElement(By.id("cbhlFirstName"));
		MainMenu.click();
		
		WebElement SubMenu = driver.findElement(By.id("_ctl1_ucNavBarWhite_cbhlSignOutMenu"));
		SubMenu.click();

		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
