package com.saucedemo.User_Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SaucedemoCheckOut {

    public static final Target TXT_NAME = Target.the("").located(By.id("first-name"));
    public static final Target TXT_LASTNAME = Target.the("").located(By.id("last-name"));
    public static final Target TXT_ZIP_CODE = Target.the("").located(By.id("postal-code"));
    public static final Target BTN_CONTINUE =Target.the("").located(By.id("continue"));

    public static final Target BTN_FINISH = Target.the("").located(By.id("finish"));

    public static final Target TXT_CHECKOUT_COMPLETE = Target.the("").locatedBy("//h2[@class='complete-header']");
}
