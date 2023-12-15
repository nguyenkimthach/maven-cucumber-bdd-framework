package nopCommerce.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class RegexSteps {
	@When("^I input (first|second|third) Account ID$")
	public void iInputFirstAccountID(String account) {
		if (account.equalsIgnoreCase("first")) {
			// transactionPage.inputAcountNo(shareData.firstAccountID);
		}
		if (account.equalsIgnoreCase("second")) {
			// transactionPage.inputAcountNo(shareData.secondAccount ID);
		}
	}

	@And("^I (transfer|withdraw) to \"(.*?)\" USD$")
	public void iTransferOrWithdrawToSomethingUSD(String amount) {
		// transactionPage.inputAmount (amount);
	}
}
