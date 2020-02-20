package objectPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import coreComponents.browserFactory;

public class NHSUniversalCreditTakeHomePay extends browserFactory {

			browserFactory bf = new browserFactory();

			public NHSUniversalCreditTakeHomePay() {
				PageFactory.initElements(driver, this);
			}

			
			@FindBy(xpath = "//input[@type=\"radio\"]")
			List<WebElement> takeHomePay;
			
			public void universalTakeHomePay(String option)
			{
				for(WebElement TH : takeHomePay)
				{
					if(TH.getAttribute("value").equals(option))
					{
						bf.ActionsElement(TH);
					}
				}
		} 

}
