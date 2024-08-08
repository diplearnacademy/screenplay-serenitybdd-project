package co.dlacademy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class AbrirCuentaNuevaPage {

    public static final Target SELECT_TIPO_CUENTA = the("Lista Desplegable con Tipos de Cuenta").located(By.id("type"));
    public static final Target BUTTON_ABRIR_CUENTA_NUEVA = the("Boton para crear una Cuenta").located(By.xpath("//input[@value='Open New Account']"));
}
