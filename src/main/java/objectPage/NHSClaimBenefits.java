package objectPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import coreComponents.browserFactory;

public class NHSClaimBenefits extends browserFactory {

	browserFactory bf = new browserFactory();

	public NHSClaimBenefits() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@type=\"radio\"]")
	List<WebElement> claimBenefit;
	
	public void claimBenefitsTax(String option)
	{
		for(WebElement CB : claimBenefit)
		{
			if(CB.getAttribute("value").equals(option))
			{
				bf.ActionsElement(CB);
			}
		}
}
}
