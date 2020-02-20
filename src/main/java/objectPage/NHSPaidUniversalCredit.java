package objectPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import coreComponents.browserFactory;

public class NHSPaidUniversalCredit extends browserFactory {

	browserFactory bf = new browserFactory();

	public NHSPaidUniversalCredit() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@type=\"radio\"]")
	List<WebElement> universalCredit;
	
	public void paidUniversalCredit(String option)
	{
		for(WebElement UC : universalCredit)
		{
			if(UC.getAttribute("value").contains(option.toUpperCase()))
			{
				bf.ActionsElement(UC);
			}
		}
}
}