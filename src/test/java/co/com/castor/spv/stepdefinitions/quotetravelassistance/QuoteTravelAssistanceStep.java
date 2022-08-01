package co.com.castor.spv.stepdefinitions.quotetravelassistance;

import co.com.castor.spv.tasks.quotetravelassistance.QuoteTravelAssistanceTKS;
import co.com.castor.spv.tasks.requote.RequoteTKS;
import co.com.castor.spv.utils.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;


public class QuoteTravelAssistanceStep extends HomePage {

    private HomePage homePage = new HomePage();

    @Given("^I want to quote my travel insurance$")
    public void i_want_to_quote_my_travel_insurance() {
        user.can(BrowseTheWeb.with(hisBrowser));
        user.wasAbleTo(Open.browserOn(homePage));
    }

    @When("^Enter my destiny information (.*) and (.*) and (.*) and (.*) and (.*)$")
    public void enter_my_destiny_information(String name, String email,String mobile,String new_destiny, String discount_code) {
        user.wasAbleTo(
                QuoteTravelAssistanceTKS.quoteTravel(name,email,mobile),
                RequoteTKS.requote(new_destiny,discount_code)
        );
    }

    @Then("^I can quote insurance for my trip$")
    public void i_can_quote_insurance_for_my_trip() {

    }
}
