package PersonalPactice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArrayLargestValue {
    static int i,j,res,max,temp=0,a[];
    
    public static void main(String args[])
    {
    	
    	 WebDriver driver = new FirefoxDriver();
			
			driver.get("https://challengers.flood.io/start");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	
    	WebElement NUMBER1 = driver.findElement(By.xpath("//*[@id='new_challenger']/table/tbody/tr[2]/td[1]/div/span/label"));
		WebElement NUMBER2 = driver.findElement(By.xpath("//*[@id='new_challenger']/table/tbody/tr[3]/td[1]/div/span/label"));
		WebElement NUMBER3 = driver.findElement(By.xpath("//*[@id='new_challenger']/table/tbody/tr[4]/td[1]/div/span/label"));
		WebElement NUMBER4 = driver.findElement(By.xpath("//*[@id='new_challenger']/table/tbody/tr[5]/td[1]/div/span/label"));
		WebElement NUMBER5 = driver.findElement(By.xpath("//*[@id='new_challenger']/table/tbody/tr[6]/td[1]/div/span/label"));
    	
    	
    	
    	
    	Integer.parseInt("NUMBER1");
    	
        res=ArrayLargestValue.max(new int []{173,29,391,41});
        System.out.println ("Largest value in the given array is  : "+  res );
    }
    static int max(int a[])
    {
        max=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]>=a[max])
            max=i;
            
        }
        return (a[max]);
    }
}