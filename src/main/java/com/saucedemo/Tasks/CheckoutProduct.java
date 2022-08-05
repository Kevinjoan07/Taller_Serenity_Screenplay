package com.saucedemo.Tasks;

import com.saucedemo.Utils.Data;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.saucedemo.User_Interfaces.SaucedemoCheckOut.*;


public class CheckoutProduct implements Task {


    Data data = new Data();
    String[] dataInfo = data.getInfo();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataInfo[0]).into(TXT_NAME),
                Enter.theValue(dataInfo[1]).into(TXT_LASTNAME),
                Enter.theValue(dataInfo[2]).into(TXT_ZIP_CODE),
                Click.on(BTN_CONTINUE), Click.on(BTN_FINISH),
                WaitUntil.the(TXT_CHECKOUT_COMPLETE, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds());

    }


    public static CheckoutProduct on(){
        return Instrumented.instanceOf(CheckoutProduct.class).withProperties();
    }
}
