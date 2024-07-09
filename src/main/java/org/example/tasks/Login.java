package org.example.tasks;

import net.serenitybdd.screenplay.actions.Click;
import org.example.models.UserLoombokData;
import org.example.userinterfaces.LoginPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.WaitFor;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userinterfaces.LoginPage.CASILLA_VERIFICACION_CAPTCHA;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
public class Login implements Task{
    UserLoombokData userLoombokData;

    public Login(UserLoombokData userLoombokData) {
        this.userLoombokData = userLoombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.ContentListCode),
                Click.on(LoginPage.CodeCountry),

                Enter.theValue(userLoombokData.getUser()).into(LoginPage.TXT_USER),
                Enter.theValue(userLoombokData.getPass()).into(LoginPage.TXT_PASS),
                JavaScriptClick.on(LoginPage.BTN_SUBMIT),
                WaitUntil.the(LoginPage.TXT_VALIDATION, isVisible()).forNoMoreThan(10).seconds()
                WaitFor.the(LoginPage.CASILLA_VERIFICACION_CAPTCHA).isVisible(),
                Click.on(CASILLA_VERIFICACION_CAPTCHA)
        );
    }

    public static Login onTheSite(UserLoombokData userLoombokData){
        return Instrumented.instanceOf(Login.class).withProperties(userLoombokData);
    }
}
