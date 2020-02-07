package seller.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import org.openqa.selenium.support.ui.ExpectedConditions;
import seller.interactions.seller.ClickElement;
import seller.interactions.seller.WaitForElement;

import static seller.userinterfaces.seller.HomePage.*;
import static seller.userinterfaces.seller.ProductsPage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SearchProductEan  implements Task {
    private String ean;

    public SearchProductEan(String ean) {
        this.ean = ean;

    }

    // Buscar producto y agrrgarlo al carrito
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitForElement.visibility(BTN_PRODUCTS, 20));
        actor.attemptsTo(ClickElement.click(BTN_PRODUCTS));
        actor.attemptsTo(WaitForElement.visibility(BTN_PRODUCTS, 2));
        actor.attemptsTo(ClickElement.click(BTN_LIST_PRODUCTS));
        actor.attemptsTo(WaitForElement.visibility(BTN_PRODUCTS, 5));
        actor.attemptsTo(ClickElement.click(BTN_FILTER_OPTIONS));
        actor.attemptsTo(Enter.theValue(ean).into(TEXT_EAN_FILTER));
        actor.attemptsTo(ClickElement.click(BTN_FILTER));

    }

    public static Performable searchProductEan(String ean) {
        return instrumented(SearchProductEan.class, ean);
    }
}
