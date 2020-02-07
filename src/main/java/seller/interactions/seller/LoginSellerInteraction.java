package seller.interactions.seller;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginSellerInteraction implements Interaction  {

        private String user;
        private String pass;
        private Target userElement;
        private Target passElement;

	public LoginSellerInteraction(String user, String pass, Target userElement, Target passElement) {

        this.user = user;
        this.pass = pass;
        this.userElement = userElement;
        this.passElement = passElement;
    }

        // Escribir usuario y contraseña
        @Override
        public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(user).into(userElement));
        //actor.attemptsTo(Enter.theValue(pass).into(passElement), Hit.the(Keys.ENTER).into(passElement));
        actor.attemptsTo(Enter.theValue(pass).into(passElement));

    }

        public static LoginSellerInteraction loginVexInteraction(String user, String pass, Target userElement, Target passElement) {
        return instrumented(LoginSellerInteraction.class, user, pass, userElement, passElement);

    }
    }
