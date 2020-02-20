package objectPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import coreComponents.browserFactory;
import org.junit.Assert;

public class NHSQualifyingUniversalCredit extends browserFactory {

	browserFactory bf = new browserFactory();

	public NHSQualifyingUniversalCredit() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//h2[@class=\"heading-large\"]")
	private WebElement status;
	
	public void qualifyingstatus()
	{
	Assert.assertTrue(status.getText().contains("You get help with NHS costs"));
			
			
			
		
	}

}
