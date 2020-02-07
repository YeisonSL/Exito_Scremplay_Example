package seller.questions.seller;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static seller.userinterfaces.seller.HomePage.USER_NAME;


public class ValidateLogin implements Question<Boolean> {

    private String userName;

    public ValidateLogin(String userName) {
        this.userName = userName;

    }

    // Validar si el nombre del Usuario esta en el home de Seller
    @Override
    public Boolean answeredBy(Actor actor) {

        return USER_NAME.resolveFor(actor).getText().contains(userName);

    }

    public static Question<Boolean> validate(String userName) {
        return new ValidateLogin(userName);
    }

}
