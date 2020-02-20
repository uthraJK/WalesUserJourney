package objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import coreComponents.browserFactory;

public class NHSCountryObjectPage extends browserFactory {
	
	browserFactory bf = new browserFactory();
	
	
	
	public NHSCountryObjectPage()
{
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath ="//label[@id='label-england']")
	private WebElement countryEngland;
	

	@FindBy(xpath ="//label[@id='label-scotland']")
	private WebElement countryScotland;
	

	@FindBy(xpath ="//label[@id='label-wales']")
	private WebElement countryWales;

	@FindBy(xpath ="//label[@id='label-nire']")
	private WebElement countryIreland;
	
	@FindBy(xpath ="//input[@type=\"submit\"]")
	private WebElement clickNext;
	
	public void selectcountry(String countryname) 
	{
		if(countryname.equals("England")) {
			countryEngland.click();
		}else if(countryname.equals("Scotland")) {
			countryScotland.click();
		}else if(countryname.equals("Wales")) {
			countryWales.click();
		}else {
			countryIreland.click();
		}
		
	}	
		public void clickNextIcon() throws Exception
		{
			clickNext.click();
		}
			
	}
	
