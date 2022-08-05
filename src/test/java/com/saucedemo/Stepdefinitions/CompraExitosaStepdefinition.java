package com.saucedemo.Stepdefinitions;

import com.saucedemo.Tasks.AddProductToCart;
import com.saucedemo.Tasks.CheckoutProduct;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static com.saucedemo.User_Interfaces.SaucedemoCheckOut.TXT_CHECKOUT_COMPLETE;

public class CompraExitosaStepdefinition {

    @When("^I buy a product$")
    public void iBuyAProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductToCart.doit(),
                CheckoutProduct.on());

    }


    @Then("^I check the order confirmed message$")
    public void iCheckTheOrderConfirmedMessage() {
        OnStage.theActorInTheSpotlight().
                should(GivenWhenThen.seeThat
                        (WebElementQuestion.the
                                (TXT_CHECKOUT_COMPLETE), WebElementStateMatchers.containsText("THANK YOU FOR YOUR ORDER")));

    }

}
