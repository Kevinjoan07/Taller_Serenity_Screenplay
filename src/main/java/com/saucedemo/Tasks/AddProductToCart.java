package com.saucedemo.Tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.saucedemo.User_Interfaces.SaucedemoProducts.*;

public class AddProductToCart implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_PRODUCT),
                Click.on(BTN_ADD_TO_CARD),Click.on(BTN_SHOPPING_CART),
                Click.on(BTN_CHECKOUT));

    }

    public static AddProductToCart doit(){
        return Instrumented.instanceOf(AddProductToCart.class).withProperties();
    }
}
