package co.dlacademy.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GuardarInfoCuenta implements Interaction {
    private String clave;
    private Target valor;

    public GuardarInfoCuenta(String clave, Target valor) {
        this.clave = clave;
        this.valor = valor;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String valorClave = valor.resolveFor(actor).getText();
        actor.remember(clave,valorClave);
    }

    public static GuardarInfoCuenta informacionParaDespues(String clave, Target valor){
        return instrumented(GuardarInfoCuenta.class,clave,valor);
    }
}
