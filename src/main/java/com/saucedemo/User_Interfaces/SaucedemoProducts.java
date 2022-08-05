package com.saucedemo.User_Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SaucedemoProducts {


   public static final Target BTN_PRODUCT = Target.the("").located(By.id("item_1_title_link"));
   public static final Target BTN_ADD_TO_CARD =Target.the("").located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
   public static final Target BTN_SHOPPING_CART =Target.the("").located(By.id("shopping_cart_container"));
   public static final Target BTN_CHECKOUT = Target.the("").located(By.id("checkout"));
}
