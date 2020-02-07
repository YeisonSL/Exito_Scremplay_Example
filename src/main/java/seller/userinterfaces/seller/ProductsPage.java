package seller.userinterfaces.seller;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {
    public static final Target BTN_FILTER_OPTIONS =Target.the("Button Filter").located(By.className("//*[@class='mat-button-wrapper']//*[text()='filter_list']"));
    public static final Target NAME_PRODUCT = Target.the("Name Product").located(By.xpath("//*[contains(text(),'EAN:')]// following::p[1]"));
    public static final Target TEXT_EAN_FILTER = Target.the("Text Filter Ean").located(By.xpath("//*[@formcontrolname='ean']"));
    public static final  Target BTN_FILTER = Target.the("Button Filter").located(By.className("//*[@class='mat-flat-button mat-primary']"));
}
//*[@class='mat-button-wrapper']//*[text()='filter_list']