package testCases;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import testPages.DynamicLoadingPage;
import utilities.Utils;

public class Nine_DynamicLoading extends BaseTest {
	@Test
	public void dynamicLoading_9(){
		
		DynamicLoadingPage dl = new DynamicLoadingPage(driver);
		driver.get(Utils.BASE_URLS + "/dynamic_loading/2");
		sleepTest(1000);
		
		//Test clicks the start button and uses explicit wait.
		//Test asserts that “Hello World!” text is displayed.
		
		dl.getStartBtn().click();
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));
		String helloText = dl.getHelloWorld().getText();
		assertEquals(Utils.HELLO_WORLD_TEXT, helloText);		
	}
/*
//https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver
alertIsPresent()
elementSelectionStateToBe()
elementToBeClickable()
elementToBeSelected()
frameToBeAvaliableAndSwitchToIt()
invisibilityOfTheElementLocated()
invisibilityOfElementWithText()
presenceOfAllElementsLocatedBy()
presenceOfElementLocated()
textToBePresentInElement()
textToBePresentInElementLocated()
textToBePresentInElementValue()
titleIs()
titleContains()
visibilityOf()
visibilityOfAllElements()
visibilityOfAllElementsLocatedBy()
visibilityOfElementLocated()
*/
}
