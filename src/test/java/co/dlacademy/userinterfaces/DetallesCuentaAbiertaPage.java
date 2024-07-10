package co.dlacademy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class DetallesCuentaAbiertaPage {

    public static final Target LINK_NUEVA_CUENTA_ABIERTO = the("Detalle de la cuenta abierta").located(By.id("newAccountId"));

}
