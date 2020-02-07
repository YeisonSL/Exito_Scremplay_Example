package seller.userinterfaces.seller;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target TEXT_USER = Target.the("Text User").located(By.id("input-username"));
    public static final Target TEXT_PASS = Target.the("Text Pass").located(By.id("input-password"));
    public static final  Target BTN_ENTER = Target.the("Button Enter").located(By.className("mat-button-wrapper"));
}


