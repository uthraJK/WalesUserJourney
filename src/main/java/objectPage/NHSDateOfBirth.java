package objectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import coreComponents.browserFactory;

public class NHSDateOfBirth extends browserFactory {
	
	browserFactory bf = new browserFactory();
	 
	
	public NHSDateOfBirth()
{
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath ="//input[@id=\"dob-day\"]")
	private WebElement dobDay;
	
	public void enterDay(String Day)
	{
		bf.setText(dobDay, Day);
	}
	@FindBy(xpath ="//input[@id=\"dob-month\"]")
	private WebElement dobMonth;
	
	public void enterMonth(String Month)
	{
		bf.setText(dobMonth, Month);
	}
	
	@FindBy(xpath ="//input[@id=\"dob-year\"]")
	private WebElement dobYear;
	
	public void enterYear(String Year)
	{
		bf.setText(dobYear, Year);
	}
	
	
}
