package co.dlacademy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductoPage {

    public static final Target LABEL_TITULO_PAGINA = Target.the("Titulo  de la pagina de productos")
            .located(By.xpath("//span[contains(.,'{0}')]"));
}
