import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Tab_Popup {

	public static void main(String[] args) {
	

		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		Set<String> WindowId = driver.getWindowHandles();
		Iterator<String> iterator = WindowId.iterator();
		
		System.out.println(iterator.next());
		
		
		Set<String> WindowID = driver.getWindowHandles();
		Iterator<String> iterator1 = WindowID.iterator();
		
		
		
		System.out.println(iterator1.next());
		
		
		
		
		
		
	}

}
