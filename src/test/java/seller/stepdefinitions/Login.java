package seller.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import seller.interactions.seller.InicarNavegador;
import seller.questions.seller.ValidateLogin;
import seller.tasks.LoginSeller;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Login {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) wants to login$")
    public void thatMikeWantsToEnterSeller(String name) throws Exception {
        theActorCalled(name).attemptsTo(InicarNavegador.theWeb());
    }

    @When("^he entered username (.*) and password (.*)$")
    public void heEnterUserAndPas(String user, String pass) throws Exception {
        theActorInTheSpotlight().attemptsTo(LoginSeller.loginSeller(user, pass));
    }

    @Then("^he should see on the home page (.*)$")
    public void heShouldSeeUsername(String username) throws Exception {
        theActorInTheSpotlight().should(seeThat(ValidateLogin.validate(username)));
    }
}
