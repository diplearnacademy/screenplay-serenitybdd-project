package co.dlacademy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class DetalleCuentaiInfoPage {
    public static final Target LINK_NUEVA_CUENTA_ABIERTO = the("Detalle de la cuenta abierta").located(By.id("newAccountId"));

}
