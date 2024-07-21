package co.dlacademy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class DetallesTodasCuentasPage {

   // public static final Target LISTA_CUENTAS_USUARIO = the("# Cuenta del Usuario").located(By.xpath("//table[@id='accountTable']/tbody/tr/td/a"));
    public static final Target CUENTA_USUARIO_RECIEN_CREADA = the("# Cuenta del Usuario")
            .locatedBy("//table[@id='accountTable']//td//a[contains(.,'{0}')]");
}