package co.dlacademy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.dlacademy.userinterfaces.DetallesTodasCuentasPage.CUENTA_USUARIO_RECIEN_CREADA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CuentaAhorros implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String cuentaAhorrosCreada = theActorInTheSpotlight().recall("cuentaAhorros");
        return (CUENTA_USUARIO_RECIEN_CREADA.of(cuentaAhorrosCreada).resolveFor(actor).isVisible());

    }

    public static CuentaAhorros haSidoAbiertaExitosamente(){
        return new CuentaAhorros();
    }
}
