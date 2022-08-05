package com.saucedemo.User_Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SaucedemoHome {

    public static final Target TXT_USER = Target.the("").located(By.id("user-name"));
    public static final Target TXT_PASSWORD = Target.the("").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("").located(By.id("login-button"));

    public static final Target TXT_TITLE_PRODUCT = Target.the("").locatedBy("//span[@class='title']");

    public static final Target TXT_ERRO_USER =  Target.the("").locatedBy("//h3[text()='Epic sadface: Sorry, this user has been locked out.']");



}
