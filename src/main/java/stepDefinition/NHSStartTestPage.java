package stepDefinition;

import org.junit.After;

import coreComponents.browserFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import objectPage.NHSClaimBenefits;
import objectPage.NHSCountryObjectPage;
import objectPage.NHSDateOfBirth;
import objectPage.NHSLivewithPartner;
import objectPage.NHSPaidUniversalCredit;
import objectPage.NHSQualifyingUniversalCredit;
import objectPage.NHSStartObjectPage;
import objectPage.NHSUniversalCreditClaim;
import objectPage.NHSUniversalCreditTakeHomePay;

public class NHSStartTestPage {
	browserFactory bf = new browserFactory();
	NHSStartObjectPage startpage;
	NHSCountryObjectPage countrypage;
	NHSDateOfBirth dateofbirthpage;
	NHSLivewithPartner livewithpartnetpage;
	NHSClaimBenefits claimbenefits;
	NHSPaidUniversalCredit universalcredit;
	NHSUniversalCreditClaim universalcreditclaim;
	NHSUniversalCreditTakeHomePay takehomepay;
	NHSQualifyingUniversalCredit qualifyinguniversalcredit;
	public NHSStartTestPage()
	{
		super();
	}
	
	@Before
	public void setUp() throws Exception
	{
		startpage.initialization();
		startpage= new NHSStartObjectPage();
		countrypage = new NHSCountryObjectPage();
		dateofbirthpage = new NHSDateOfBirth();
		livewithpartnetpage = new NHSLivewithPartner();
		claimbenefits = new NHSClaimBenefits();
		universalcredit = new NHSPaidUniversalCredit();
		universalcreditclaim = new NHSUniversalCreditClaim();
		takehomepay = new NHSUniversalCreditTakeHomePay();
		qualifyinguniversalcredit = new NHSQualifyingUniversalCredit();
		startpage.clickStartIcon();
		
	}	
	@Given("^I am a person from Wales \"([^\"]*)\"$")
	public void i_am_a_person_from_Wales(String arg1) throws Throwable {
		countrypage.selectcountry(arg1);
		countrypage.clickNextIcon();
	  }

	@When("^I put my circumstances into the Checker tool \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_put_my_circumstances_into_the_Checker_tool(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
		dateofbirthpage.enterDay(arg1);
		dateofbirthpage.enterMonth(arg2);
		dateofbirthpage.enterYear(arg3);
	   countrypage.clickNextIcon();
	   livewithpartnetpage.selectPartner(arg4);
	   countrypage.clickNextIcon();
	   claimbenefits.claimBenefitsTax(arg5);
	   countrypage.clickNextIcon();
	   universalcredit.paidUniversalCredit(arg6);
	   countrypage.clickNextIcon();
	   universalcreditclaim.universalCreditClaim(arg7);
	   countrypage.clickNextIcon();
	   takehomepay.universalTakeHomePay(arg8);
	   countrypage.clickNextIcon();
	   
	}

	@Then("^I should get a result of whether I will get help or not$")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not() throws Throwable {
		qualifyinguniversalcredit.qualifyingstatus(); 
	}


@After
public void afterScenario(Scenario sc) throws Exception
{
	System.out.println("After method is working ");
	try
	{
	if(sc.isFailed())
	{
		String name = sc.getName();
		bf.screenShot(name);
		
	}}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}


}
