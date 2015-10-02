package Practice_Generel;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class YahooMail_com {
	
	
public static String decode(String encodedPassword){   //Return type is String  //this is the one of the method is created 
		
		byte[] valueDecoded= Base64.decodeBase64(encodedPassword );
		return new String(valueDecoded);
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		   /*
	       // encode data on your side using BASE64
			byte[]   bytesEncoded = Base64.encodeBase64("01716593313" .getBytes());
			System.out.println("ecncoded value is " + new String(bytesEncoded ));

			// Decode data on other side, by processing encoded data
			byte[] valueDecoded= Base64.decodeBase64(bytesEncoded );
			System.out.println("Decoded value is " + new String(valueDecoded));
			
		    //System.out.println(decode("MDE3MTY1OTMzMTM="));
		*/
		
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://gmail.com");
		driver.get("http://yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Sign_In = driver.findElement(By.xpath("//*[contains(@title,'Sign In')]"));    
		Sign_In.click();
		
		WebElement TypeEmail = driver.findElement(By.id("login-username"));
		TypeEmail.sendKeys("shahnewazzaman@yahoo.com");
		
		WebElement TypePassword = driver.findElement(By.id("login-passwd"));
		TypePassword.sendKeys("01716593313");
		
		WebElement Sign_in = driver.findElement(By.id("login-signin"));
		Sign_in.click();
		
		//WebElement Mail = driver.findElement(By.xpath("//img[alt='Mail']"));
		//Mail.click();
		
		//driver.manage().deleteAllCookies();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.quit();
		
	

	}

}
