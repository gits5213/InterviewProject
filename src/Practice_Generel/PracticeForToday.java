package Practice_Generel;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class PracticeForToday {

	public static void main(String[] args) throws InterruptedException {
		 
		//WebDriver driver = new HtmlUnitDriver();
		
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setJavascriptEnabled(true);
	    caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\Selenium\\phantomjs-2.0.0-windows\\phantomjs-2.0.0-windows\\bin\\phantomjs.exe");
	    WebDriver driver = new PhantomJSDriver(caps);
	    
		
		driver.get("https://challengers.flood.io/start");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		WebElement Start = driver.findElement(By.xpath("//*[@id='new_challenger']/input[3]"));
		Start.click();

		Select dropdownList = new Select(driver.findElement(By.xpath("//*[@id='challenger_age']")));
		dropdownList.selectByVisibleText("30");
		
		WebElement ClickOnNext = driver.findElement(By.xpath("//*[@id='new_challenger']/input[3]"));
		ClickOnNext.click();
	     
		
		List <WebElement> RadioButton = driver.findElements(By.name("challenger[order_selected]")); 
	    System.out.println(RadioButton.get(3).getAttribute("value"));  //index number 
		RadioButton.get(3).click();
	
		WebElement Number = driver.findElement(By.xpath("//*[@id='new_challenger']/table/tbody/tr[3]/td[1]/div/span/label"));
		WebElement typeInsideBox = driver.findElement(By.id("challenger_largest_order"));
		typeInsideBox.sendKeys("RadioButton");
		
		
		
		
		
		Actions action = new Actions(driver);
		action.moveToElement(typeInsideBox);
		
		WebElement NextButton = driver.findElement(By.xpath("//*[@id='new_challenger']/input[3]"));
		NextButton.click();
		
		WebElement Next3Button = driver.findElement(By.xpath("//*[@id='new_challenger']/input[3]"));
		Next3Button.click();
		
		WebElement Token = driver.findElement(By.xpath("//*[@id='new_challenger']/h4/span[2]"));
		WebElement TypeToken = driver.findElement(By.xpath("//*[@id='challenger_one_time_token']"));
		
		Actions action1 = new Actions(driver);
		action.moveToElement(TypeToken);
		
		
		WebElement Next4Button = driver.findElement(By.xpath("//*[@id='new_challenger']/input[3]"));
		Next4Button.click();
		
		
		
		
	
	
		driver.quit();
		

	}

}
