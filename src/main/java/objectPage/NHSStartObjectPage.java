package objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import coreComponents.browserFactory;
import cucumber.api.java.Before;

public class NHSStartObjectPage extends browserFactory {
	browserFactory bf = new browserFactory();
		public NHSStartObjectPage()
		
	{
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(xpath ="//input[@id= 'next-button']")
	private WebElement startIcon;

	public void clickStartIcon() throws Exception
	{
			startIcon.click();
	}
	
	

	
	
}

