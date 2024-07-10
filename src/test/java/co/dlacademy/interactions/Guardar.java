package co.dlacademy.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Guardar implements Interaction {

    private String clave;
    private Target valor;

    public Guardar(String clave, Target valor) {
        this.clave = clave;
        this.valor = valor;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String valorCLAVE = valor.resolveFor(actor).getText();
        actor.remember(clave,valor.resolveFor(actor).getText());
        System.out.println(valorCLAVE);
    }

    public static Performable informacionParaDespues(String clave, Target valor){
        return instrumented(Guardar.class, clave, valor);
    }
}
