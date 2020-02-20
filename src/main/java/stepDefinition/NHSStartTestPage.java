package stepDefinition;

import org.junit.After;

import coreComponents.browserFactory;
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
	NHSStartObjectPage SP;
	NHSCountryObjectPage CP;
	NHSDateOfBirth DB;
	NHSLivewithPartner LP;
	NHSClaimBenefits CB;
	NHSPaidUniversalCredit UC;
	NHSUniversalCreditClaim UCC;
	NHSUniversalCreditTakeHomePay THP;
	NHSQualifyingUniversalCredit QUC;
	public NHSStartTestPage()
	{
		super();
	}
	
	@Before
	public void setUp() throws Exception
	{
		SP.initialization();
		SP = new NHSStartObjectPage();
		CP = new NHSCountryObjectPage();
		DB = new NHSDateOfBirth();
		LP = new NHSLivewithPartner();
		CB = new NHSClaimBenefits();
		UC = new NHSPaidUniversalCredit();
		UCC = new NHSUniversalCreditClaim();
		THP = new NHSUniversalCreditTakeHomePay();
		QUC = new NHSQualifyingUniversalCredit();
		SP.clickStartIcon();
		
	}	
	@Given("^I am a person from Wales \"([^\"]*)\"$")
	public void i_am_a_person_from_Wales(String arg1) throws Throwable {
	CP.selectcountry(arg1);
	CP.clickNextIcon();
	  }

	@When("^I put my circumstances into the Checker tool \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_put_my_circumstances_into_the_Checker_tool(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
	   DB.enterDay(arg1);
	   DB.enterMonth(arg2);
	   DB.enterYear(arg3);
	   CP.clickNextIcon();
	   LP.selectPartner(arg4);
	   CP.clickNextIcon();
	   CB.claimBenefitsTax(arg5);
	   CP.clickNextIcon();
	   UC.paidUniversalCredit(arg6);
	   CP.clickNextIcon();
	   UCC.universalCreditClaim(arg7);
	   CP.clickNextIcon();
	   THP.universalTakeHomePay(arg8);
	   CP.clickNextIcon();
	   
	}

	@Then("^I should get a result of whether I will get help or not$")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not() throws Throwable {
	   QUC.qualifyingstatus(); 
	}


@After
public void homeScreen()
{
	System.out.println("Pass1");
	
	
}


}
