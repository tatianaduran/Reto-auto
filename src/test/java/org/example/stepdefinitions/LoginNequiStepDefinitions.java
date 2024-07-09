package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import org.example.models.UserLoombokData;
import org.example.tasks.Login;
import org.example.utils.GlobalData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginNequiStepDefinitions {

    @Given("the user is on the nequi page")
    public void theUserIsOnTheNequiPage() {
        OnStage.theActorCalled(GlobalData.ACTOR).wasAbleTo(Open.url(GlobalData.URL));
    }
    @When("attempts to login")
    public void attemptsToLogin(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onTheSite(UserLoombokData.setData(dataTable).get(0))
        );
    }



   /* @Then("validate the text on screen TATIANA DURAN")
    public void validateTheTextOnScreenTATIANADURAN() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/
}
