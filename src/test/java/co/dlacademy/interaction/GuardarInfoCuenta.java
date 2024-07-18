package co.dlacademy.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GuardarInfoCuenta implements Interaction {
    private String clave;
    private String valor;

    public GuardarInfoCuenta(String clave, String valor) {
        this.clave = clave;
        this.valor = valor;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(clave,valor);
    }

    public static GuardarInfoCuenta informacionParaDespues(String clave, String valor){
        return instrumented(GuardarInfoCuenta.class,clave,valor);
    }
}
