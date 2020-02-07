package seller.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import seller.interactions.seller.ClickElement;
import seller.interactions.seller.LoginSellerInteraction;
import  static seller.userinterfaces.seller.LoginPage.*;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginSeller implements Task {

    private String user;
    private String pass;


    public LoginSeller(String user, String pass) {
        this.user = user;
        this.pass = pass;

    }

    // Buscar producto y agrrgarlo al carrito
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(LoginSellerInteraction.loginVexInteraction(user,pass, TEXT_USER,TEXT_PASS));
        actor.attemptsTo(ClickElement.click(BTN_ENTER));

    }

    public static Performable loginSeller(String user, String pass) {
        return instrumented(LoginSeller.class, user, pass);
    }
}
