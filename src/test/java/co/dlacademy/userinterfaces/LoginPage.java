package co.dlacademy.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target INPUT_USUARIO = Target.the("Campo de ingreso usuario").
            located(By.id("user-name"));

    public static final  Target INPUT_PASSWORD = Target.the("Campo ingreso password").
            located(By.xpath("//input[@data-test='password']"));

    public  static final  Target BOTON_LOGIN = Target.the("Boton inicio Session").located(By.name("login-button"));
}
