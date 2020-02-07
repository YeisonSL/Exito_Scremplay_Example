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
import seller.tasks.SearchProductEan;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchProductToEan {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) wants to login he entered username (.*) and password (.*)$")
    public void thatMikeWantsToEnterSeller(String name, String user, String pass) throws Exception {
        theActorCalled(name).attemptsTo(InicarNavegador.theWeb());
        theActorInTheSpotlight().attemptsTo(LoginSeller.loginSeller(user, pass));
    }

    @When("^he is looking for a product with EAN (.*)$")
    public void heEnterUserAndPas(String ean) throws Exception {
        theActorInTheSpotlight().attemptsTo(SearchProductEan.searchProductEan(ean));
    }

    @Then("^he should see on the page (.*)$")
    public void heShouldSeeUsername(String username) throws Exception {

        theActorInTheSpotlight().should(seeThat(ValidateLogin.validate(username)));
    }
}

