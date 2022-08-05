package com.saucedemo.Tasks;

import com.saucedemo.Utils.Data;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.saucedemo.User_Interfaces.SaucedemoHome.*;


public class StartSuccessfulSection implements Task {


   Data data = new Data();
   String[] dataUser = data.getData();



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataUser[0]).into(TXT_USER),
                Enter.theValue(dataUser[1]).into(TXT_PASSWORD), Click.on(BTN_LOGIN));

    }

    public static StartSuccessfulSection on(){
        return Instrumented.instanceOf(StartSuccessfulSection.class).withProperties();
    }



}
