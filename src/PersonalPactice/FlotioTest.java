package PersonalPactice;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FlotioTest {
	
	
	  

	
	public static void main(String[] args) {
		
		 
		//WebDriver driver = new HtmlUnitDriver();
		
				//DesiredCapabilities caps = new DesiredCapabilities();
			  // caps.setJavascriptEnabled(true);
			   //caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\Selenium\\phantomjs-2.0.0-windows\\phantomjs-2.0.0-windows\\bin\\phantomjs.exe");
			   //WebDriver driver = new PhantomJSDriver(caps);
			    
		        WebDriver driver = new FirefoxDriver();
				
				driver.get("https://challengers.flood.io/start");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				

				WebElement Start = driver.findElement(By.name("commit"));
				Start.click();
				
				Select dropdownList = new Select(driver.findElement(By.id("challenger_age")));
				dropdownList.selectByVisibleText("30");
				
				/*
				List<WebElement> options = driver.findElements(By.tagName("option"));
				System.out.println(options.size());
				for (int i=0; i<options.size (); i++){
					System.out.println(options.get(i).getText());
				*/
						

				WebElement ClickOnNext = driver.findElement(By.xpath("//*[@id='new_challenger']/input[3]"));
				ClickOnNext.click();
						
								
				WebElement NUMBER1 = driver.findElement(By.xpath("//*[@id='new_challenger']/table/tbody/tr[2]/td[1]/div/span/label"));	
				WebElement NUMBER2 = driver.findElement(By.xpath("//*[@id='new_challenger']/table/tbody/tr[3]/td[1]/div/span/label"));
				WebElement NUMBER3 = driver.findElement(By.xpath("//*[@id='new_challenger']/table/tbody/tr[4]/td[1]/div/span/label"));
				WebElement NUMBER4 = driver.findElement(By.xpath("//*[@id='new_challenger']/table/tbody/tr[5]/td[1]/div/span/label"));
				WebElement NUMBER5 = driver.findElement(By.xpath("//*[@id='new_challenger']/table/tbody/tr[6]/td[1]/div/span/label"));
				

				String [] Value = {NUMBER1.getText(), NUMBER2.getText(), NUMBER3.getText(), NUMBER4.getText(), NUMBER5.getText()};
				for(int i1=0; i1<Value.length; i1++){
					System.out.println(Value[i1]);
				}
				
				List b = Arrays.asList(Value);
     			System.out.println(Collections.min(b));
			
				
     			WebElement Select1 = driver.findElement(By.xpath("//*[@id='challenger_order_selected_veh3z0x5rgpoaw1fk3fxnss5ejjyut09ls1ickdhczhtdzc5shhjcenxq3uxsjlbpt0--fe11d01de2730dc3009401517c7de671ed9d659b']"));	
				WebElement Select2 = driver.findElement(By.xpath("//*[@id='challenger_order_selected_wjv0wmljstb0exbydhhtm2nwtuhzdz09ls1uwvi5ywzkewdywuddvtzty2fgvfrrpt0--8cdae37d64751b04e0a396dc36ca1836d12acc6a']"));
				WebElement Select3 = driver.findElement(By.xpath("//*[@id='challenger_order_selected_mmp0yndlqzdrtdbmskftymhvaurxzz09ls1qd1h6zxnobfq1rlzmszzqs1rgs1z3pt0--4554e4d5bf32e30e7ed70efa256a10d81687c6b9']"));
				WebElement Select4 = driver.findElement(By.xpath("//*[@id='challenger_order_selected_cxdawwhak2d3uwxiswxidtn5qtgvdz09ls1yqtdut2orde1aceexswtrk0zsdldnpt0--fe9852d5addbdc96bdc523e44780af9ca885a12e']"));
				WebElement Select5 = driver.findElement(By.xpath("//*[@id='challenger_order_selected_mldlrkirnmpkuwvsuudxcctjyug1zz09ls1uaufxslpuohbsdtczrk1kv2p2zxprpt0--b84b0e36706cec62376067f03ef008d4a821d743']"));
				
				
				//b contains miximum values then click on the radio button
				
				if (b == Collections.min(b))
				{
					Select1.click();
				}
				else if (b == Collections.min(b))
				{
					Select2.click();
				}
				else if (b == Collections.min(b))
				{
					Select3.click();
				}
				else if (b == Collections.min(b))
				{
					Select4.click();
				}
				else if (b == Collections.min(b))
				{
					Select5.click();
				}
				
				
				

				
				}	

			}


	




