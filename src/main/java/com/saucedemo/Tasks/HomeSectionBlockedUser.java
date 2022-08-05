package com.saucedemo.Tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static com.saucedemo.User_Interfaces.SaucedemoHome.*;

public class HomeSectionBlockedUser implements Task {

    public String user, password;

    public HomeSectionBlockedUser(Map<String,String> dta){
        this.user=dta.get("user");
        this.password=dta.get("password");
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(TXT_USER),
                Enter.theValue(password).into(TXT_PASSWORD), Click.on(BTN_LOGIN),
                WaitUntil.the(TXT_ERRO_USER, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds());

    }

    public static HomeSectionBlockedUser in(Map<String, String> datos){
        return Instrumented.instanceOf(HomeSectionBlockedUser.class).withProperties(datos);
    }
}
