package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target ContentListCode  = Target.the("list code country")
            .located(By.cssSelector("#content > section > div > div > form > div.container-form > div.input-country > div.wrap-select-country > select-country > div > div"));
    public static final Target CodeCountry  = Target.the("code country")
            .located(By.cssSelector("#content > section > div > div > form > div.container-form > div.input-country > div.wrap-select-country > select-country > div > ul > li:nth-child(1) > div > div:nth-child(2) > p"));
    public static final Target PhoneNumberText   = Target.the("number phone")
            .located(By.id("j_username"));
    public static final Target PassText   = Target.the("passwork")
            .located(By.id("j_password"));
    public static final Target TokenText   = Target.the("key Dynamic")
            .located(By.id("j_token"));


    public static final Target CASILLA_VERIFICACION_CAPTCHA = Target.the("Casilla de verificación del captcha")
            .locatedBy("#recaptcha-anchor");

}
