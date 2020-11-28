package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Utils;

public class WebTable_18 extends BaseTest {
	
	@Test
	public void dataTable(){
		
		//DataTablePage dt = new DataTablePage(driver);
		driver.get(Utils.BASE_URLS + "/tables");
		sleepTest(1000);
		
		System.out.println("--------row data & row count-----------");
		String xp_start = "//*[@id='table1']/tbody/tr[";
		String xp_end = "]/td[1]";
		sleepTest(1000);

		int rownum=0;
		for(int i=1; i<=4;i=i+1){
			String x = driver.findElement(By.xpath(xp_start + i + xp_end)).getText();
			rownum++;
			System.out.println(x);
		}
		System.out.println("Row count is : "+rownum);
		
		System.out.println("--------column data & column count-----------");
		String xpcol_start = "//*[@id='table1']/tbody/tr[1]/td[";
		String xpcol_end = "]";
		sleepTest(1000);
		
		int colnum=0;
		for(int i=1; i<=6;i=i+1){
			String x = driver.findElement(By.xpath(xpcol_start + i + xpcol_end)).getText();
			colnum++;
			System.out.println(x);
		}
		System.out.println("Col count is : "+colnum);
		
		System.out.println("--------Extract From entire Table-----------");
		String xpth_start = "//*[@id='table1']/tbody/tr[";
		String xpth_mid = "]/td[";
		String xpth_end = "]";
		sleepTest(1000);
		
		for(int rows=1;rows<=rownum;rows++){
			for(int cols=1;cols<=colnum;cols++){
				String y = driver.findElement(By.xpath(xpth_start+rows+xpth_mid+cols+xpth_end)).getText();
				System.out.println(y);
			}
			System.out.println("=========Printing eatch Row========="); // print all the values in the Seperate line
		}
	}
}
