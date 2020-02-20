package objectPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import coreComponents.browserFactory;

public class NHSUniversalCreditClaim extends browserFactory {

	browserFactory bf = new browserFactory();

	public NHSUniversalCreditClaim() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@type=\"radio\"]")
	List<WebElement> jointUniversal;
	
	public void universalCreditClaim(String option)
	{
		for(WebElement JU : jointUniversal)
		{
			if(JU.getAttribute("value").equals(option))
			{
				bf.ActionsElement(JU);
			}
		}
} 
}