package co.dlacademy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class DetallesPerfilPage {

    public static final Target LINK_ABRIR_NUEVA_CUENTA = the("Link abrir nueva cuenta").located(By.xpath("//h2//following-sibling::ul//a[contains(.,'Open New')]"));
    public static final Target LINK_DETALLES_NUEVA_CUENTA = the("Link abrir detalles de cuenta").located(By.xpath("//h2//following-sibling::ul//a[contains(.,'Over')]"));

}
