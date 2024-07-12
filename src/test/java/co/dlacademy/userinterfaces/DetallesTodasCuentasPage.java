package co.dlacademy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class DetallesTodasCuentasPage {

    public static final Target CUENTA_USUARIO_RECIEN_CREADA = the("# Cuenta del Usuario")
            .locatedBy("//table[@id='accountTable']//td//a[contains(.,'{0}')]");
}
