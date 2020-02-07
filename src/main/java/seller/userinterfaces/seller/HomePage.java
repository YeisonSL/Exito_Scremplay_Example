package seller.userinterfaces.seller;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static final Target USER_NAME = Target.the("User Name").located(By.xpath("//*[@id='principal-toolbar']/p/b"));
    public static final Target BTN_PRODUCTS = Target.the("Button Products").located(By.xpath("//*[@id='dropdown-status-orders']//*[text()=' Productos ']"));
    public static final Target BTN_LIST_PRODUCTS = Target.the("Button List Products").located(By.xpath("//*[@role='menu']//*[text()='Listado de productos']"));

    public  static final  Target eje = Target.the("eje").located(By.xpath("//*[@role='menu']//*[text()='Listado de productos']"));
}
