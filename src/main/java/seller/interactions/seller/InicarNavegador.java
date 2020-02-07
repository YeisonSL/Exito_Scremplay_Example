package seller.interactions.seller;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InicarNavegador implements Interaction {

    // Iterracion de abrir navegador e ingresar a una URL
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://sellercenter.pragma.com.co/home")

        );
    }

    public static Performable theWeb() {
        return instrumented(InicarNavegador.class);
    }

}
