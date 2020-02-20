package objectPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import coreComponents.browserFactory;

public class NHSLivewithPartner extends browserFactory {

	browserFactory bf = new browserFactory();

	public NHSLivewithPartner() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@type=\"radio\"]")
	List<WebElement> partnerRadio;
	
	public void selectPartner(String option)
	{
		for(WebElement PR : partnerRadio)
		{
			if(PR.getAttribute("value").equals(option))
			{
				bf.ActionsElement(PR);
			}
		}
}
}
