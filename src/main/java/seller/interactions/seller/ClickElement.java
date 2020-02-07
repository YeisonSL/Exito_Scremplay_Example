package seller.interactions.seller;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickElement implements Task {

    private Target element;

    public ClickElement(Target element) {
        this.element = element;

    }

    // Iterraciones para dar click en un elemento
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(element));

    }
    public static ClickElement click(Target element) {
        return instrumented(ClickElement.class, element);
    }
}
