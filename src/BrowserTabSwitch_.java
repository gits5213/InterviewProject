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
		
		
		
		//Open rediff page in chrome browser
		driver.get(“http://www.rediffmail.com”);
		//wait for page to load
		Thread.sleep(5000);
		// It will get and store the main window page handle or id
		String mainpage = driver.getWindowHandle();
		String subwinhandleString = null;
		//set a loop which will store all window pop up handles
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> iterator = handle.iterator();
		while(iterator.hasNext ()) {
		subwinhandleString = iterator.next( );
		}
		driver.switchTo().window(subwinhandleString);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		//Again switch back to main window
		driver.switchTo().window(mainpage);
		System.out.println(driver.getTitle());

		
		
	}

}
