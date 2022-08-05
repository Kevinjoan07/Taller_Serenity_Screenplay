package com.saucedemo.Stepdefinitions;

import com.saucedemo.Tasks.HomeSectionBlockedUser;
import com.saucedemo.Tasks.StartSuccessfulSection;
import com.saucedemo.Utils.DriverControler;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.io.IOException;
import java.util.Map;

import static com.saucedemo.User_Interfaces.SaucedemoHome.*;

public class LoginStepdefinition {




    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that I find on the website saucedemo\\.com$")
    public void thatIFindOnTheWebsiteSaucedemoCom() {
        OnStage.theActorCalled("kevin").can(BrowseTheWeb.with(DriverControler.chromeHisBrowserWeb().on("https://www.saucedemo.com/")));

    }


    @When("^I login to the site with my credentials$")
    public void iLoginToTheSiteWithMyCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(StartSuccessfulSection.on());

    }

    @When("^I login to the site with my secunds credentials$")
    public void iLoginToTheSiteWithMySecundsCredentials(Map<String,String> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(HomeSectionBlockedUser.in(datos));

    }


    @Then("^validates that title products are present$")
    public void validatesThatTitleProductsArePresent() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TXT_TITLE_PRODUCT), WebElementStateMatchers.containsText("PRODUCTS")));

    }


    @Then("^check the message on the blocked user page$")
    public void checkTheMessageOnTheBlockedUserPage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TXT_ERRO_USER), WebElementStateMatchers.containsText("Epic sadface: Sorry, this user has been locked out.")));

    }



}
