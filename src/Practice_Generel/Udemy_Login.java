package Practice_Generel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Udemy_Login {

	public static void main(String[] args) {
	
		
		
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_Win32_2.44.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(cap);
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Search_Google = driver.findElement(By.name("q"));
		Search_Google.sendKeys("udemy");
		
		WebElement Google_Search = driver.findElement(By.name("btnG"));
		Google_Search.click();
	
		WebElement ClickOnLink= driver.findElement(By.linkText("Login"));
		ClickOnLink.click();
		
		WebElement TypeUserName = driver.findElement(By.id("id_email"));
		TypeUserName.sendKeys("mdszaman83@gmail.com");
		
		WebElement TypePassword = driver.findElement(By.id("id_password"));
		TypeUserName.sendKeys("01716593313");
		
		WebElement ClickOnLogin = driver.findElement(By.id("submit-id-submit"));
		ClickOnLogin.click();
		
		WebElement MyCourses = driver.findElement(By.xpath("//*[@id='udemy']/div[2]/div/div[2]/a[2]"));
		MyCourses.click();
		
		WebElement Selenium = driver.findElement(By.xpath("//*[@id='udemy']/div[3]/div[2]/div[2]/div[1]/div[12]/div/a/div[1]/img"));
		Selenium.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
