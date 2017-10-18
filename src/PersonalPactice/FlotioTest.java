package DataDriven;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FlotioTest {

	public static void main(String[] args) throws InterruptedException {		
		
		WebDriver driver = new FirefoxDriver();		
		driver.get("https://challengers.flood.io/start");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        // Step-1 (Start button)
		WebElement Start = driver.findElement(By.name("commit"));
		Start.click();
		
		//Step-2 (select the age and put into the drop-down box)
		Select dropdownList = new Select(driver.findElement(By.id("challenger_age")));
		dropdownList.selectByVisibleText("30");
		
		//(Extract the List of age)
		List<WebElement> DropdownList = driver.findElements(By.tagName("option"));
		System.out.println(DropdownList.size());
		for (int i=0; i<=DropdownList.size(); i++){
			System.out.println(DropdownList.get(i).getAttribute("value"));
				
        //Click on Next Button
		WebElement ClickOnNext = driver.findElement(By.xpath("//*[@id='new_challenger']/input[3]"));
		ClickOnNext.click();
		
		//Step-3 (Please select and enter the largest order value below)
		List<WebElement> radio = driver.findElements(By.className("collection_radio_buttons"));	// List of Radio Button	
		System.out.println(radio.size());    //How many of the radio button
		
		List<Integer> list = new ArrayList<>();		
		for(WebElement radioOptions: radio){		
			list.add(Integer.parseInt(radioOptions.getText()));
			System.out.println(radioOptions.getText());
		}	
		System.out.println("-----Now printing from new list----");
		Collections.sort(list);                   //Sorting Ascending  order
		Collections.reverse(list);		           	//Sorting Descending  order
		for(int x=0; x<list.size(); x++){			
			System.out.println(list.get(x));	    // printing the All values related radio button
			}		
		System.out.println("Highest value is  : "+list.get(0));	  ////Printing the highest value	
		driver.findElement(By.xpath("//*[text()='"+list.get(0)+"']")).click();  ////Selecting the Radio Button
			
		WebElement element = driver.findElement(By.xpath("//*[@id='challenger_largest_order']"));  
		element.sendKeys(Integer.toString(list.get(0)));     //typing the largest value into the input box
		
			
		//Click On Next Button
		WebElement ClickOnNext1 = driver.findElement(By.name("commit"));
		ClickOnNext1.click();
		
		//Step-4 (Click On Next Button) 
	    driver.findElement(By.name("commit")).click();
		
	    
	    //Step-5 (Please enter your one time token above)
	    WebElement OneTimeToken = driver.findElement(By.xpath("//*[@id='new_challenger']/h4/span[2]"));
	    String Number = OneTimeToken.getText();
	    System.out.println(Number);
	    
	     driver.findElement(By.id("challenger_one_time_token")).clear();
	     WebElement TypeOneTimeTokenNumber = driver.findElement(By.id("challenger_one_time_token"));
	     TypeOneTimeTokenNumber.sendKeys(Number);
	    			    
	    
	    //Click On Next Button
	    WebElement ClickNext = driver.findElement(By.name("commit"));
	    ClickNext.click();
	    
	   
	    WebElement YouAreDone = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div/h2"));
	    String Confirm = YouAreDone.getText(); System.out.println(Confirm);
	    Assert.assertEquals("You're Done!", Confirm);
	    System.out.println("Automation Test Is Successfull!");
	    
	    driver.close();
		
		}
	}
}


//or 

public class Flood {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://challengers.flood.io");
        driver.findElement(By.xpath("//*[@id='page-top']/header/div/div/a")).click();
        
        // Step 1
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement startButton = driver.findElement(By.xpath(".//*[@id='new_challenger']/input[3]"));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(startButton));
        startButton.click();
        
        // Step 2
        WebElement agebox = driver.findElement(By.xpath(".//*[@id='challenger_age']"));
        agebox.sendKeys(String.valueOf(getRandomNumber(18, 100)));
        // agebox.sendkeys("30")
        // Select sl = new Select(agebox);
        // sl.selectByVisibleText("30");
        WebElement nextBotton = driver.findElement(By.xpath(".//*[@id='new_challenger']/input[3]"));
        nextBotton.click();

        // Step 3
        WebElement textBox = driver.findElement(By.id("challenger_largest_order"));
        List<WebElement> radioButtonlist = driver.findElements(By.className("collection_radio_buttons"));
        System.out.println("Total Number of Index is " + radioButtonlist.size());
        int maxNumber = 0;
        int index = 0;
        for (int i = 0; i <= radioButtonlist.size(); i++) {
            for (int j = i + 1; j <= radioButtonlist.size(); j++) {

                if (maxNumber <= Integer.valueOf(radioButtonlist.get(i).getText())) {
                    maxNumber = Integer.valueOf(radioButtonlist.get(i).getText());
                }
                if (maxNumber == Integer.valueOf(radioButtonlist.get(i).getText())) {
                    index = i;
                }
            }
        }
        System.out.println(String.valueOf("The MaximumNumber is " + maxNumber));
        textBox.sendKeys(String.valueOf(maxNumber));
        radioButtonlist.get(index).click();

        nextBotton = driver.findElement(By.xpath(".//*[@id='new_challenger']/input[3]"));
        nextBotton.click();

        // Step 4
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        nextBotton = driver.findElement(By.xpath(".//*[@id='new_challenger']/input[3]"));
        // element = wait.until(ExpectedConditions.elementToBeClickable(nextBotton));
        nextBotton.submit();;

        // Step 5
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        WebElement token = driver.findElement(By.className("token"));
        String text = token.getText();
        driver.findElement(By.id("challenger_one_time_token")).sendKeys(text);
        nextBotton = driver.findElement(By.xpath(".//*[@id='new_challenger']/input[3]"));
        nextBotton.click();
        
        
        driver.quit();
    } 
	
	 public static int getRandomNumber(int start, int end) {
        int rdNumber = 0;
        Random rd = new Random();
        rdNumber = rd.nextInt(end + 1 - start) + start;

        return rdNumber;
    }

