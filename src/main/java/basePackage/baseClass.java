package basePackage;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseClass {
	
	public static WebDriver driver;
	
	public boolean ElementFound(WebElement element)
	{
		boolean res = false;
		try
		{
		res = element.isDisplayed();
		
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
		return res;
	}
	
	public void javaScriptExecutor(WebElement element)
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println("yes");
	}
	public String selectFromDropdown(String option,WebElement element)
	{
		Select se = new Select(element);
		se.selectByValue(option);
		String selectedValue = se.getFirstSelectedOption().getText();
		return selectedValue;
		
	}
	public String selectFromDropdownVisibleText(WebElement element, String option)
	{
		Select select = new Select(element);
		select.selectByVisibleText(option);
		return select.getFirstSelectedOption().getText();
	}
	public String getAttribute(WebElement element )
	{
	return element.getAttribute("value");
	}


	public void setText(WebElement element,String name)
	{
		if(name!=null)
		{
			element.click();
			element.clear();
			element.sendKeys(name);
		}
	}
	public String getText(WebElement element)
	{
		return element.getText();
	}
	public String getTitle()
	{
		return driver.getTitle();
	}

	public void ActionsElement(WebElement element)
	{
	Actions ac = new Actions(driver);
	ac.moveToElement(element).click().build().perform();
	}
	public boolean isElementVisible(WebElement element)
	{
		boolean res= false;
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOf(element));
			res = true;
			return res;
			
		}
		catch(Exception e)
		{
		e.printStackTrace();
		
		}
		return res;
		}



	public void screenShot(String name) throws Exception 
	{
		TakesScreenshot snap = (TakesScreenshot) driver;
		FileHandler.copy(snap.getScreenshotAs(OutputType.FILE), new File("" +name+".png"));
	}


}
