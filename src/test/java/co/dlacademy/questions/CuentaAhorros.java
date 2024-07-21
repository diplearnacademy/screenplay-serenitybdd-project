package co.dlacademy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.dlacademy.userinterfaces.DetallesTodasCuentasPage.CUENTA_USUARIO_RECIEN_CREADA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CuentaAhorros implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String cuentaAhorrosCreada = theActorInTheSpotlight().recall("cuentaAhorros");
        if (CUENTA_USUARIO_RECIEN_CREADA.of(cuentaAhorrosCreada).resolveFor(actor).isVisible())
            return true;
        return false;
    }

    public static CuentaAhorros HaSidoAbiertaExitosamente(){
        return  new CuentaAhorros();
    }
}
