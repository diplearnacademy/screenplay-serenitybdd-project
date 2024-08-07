package co.dlacademy.questions;

import co.dlacademy.exceptions.CuentaAhorrosCreadaNoExiste;
import co.dlacademy.stepdefinitions.Actores;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static co.dlacademy.exceptions.CuentaAhorrosCreadaNoExiste.MENSAJE_ERROR_CREACION_CUENTA_AHORROS;
import static co.dlacademy.userinterfaces.DetallesTodasCuentasPage.LISTA_CUENTAS_USUARIO;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

public class CuentaAhorros implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String cuentaAhorrosCreada = givenThat(Actores.PEDRO).recall("cuentaAhorros");
        boolean cuentaExiste =false;
        List<WebElementFacade> cuentasUsuario = LISTA_CUENTAS_USUARIO.resolveAllFor(actor);
        try {
            for (int i=0; i <= cuentasUsuario.size(); i++){
                if(cuentaAhorrosCreada.equals(cuentasUsuario.get(i).getText())){
                    cuentaExiste = true;
                    break;
                }else{
                    cuentaExiste = false;
                }
            }
        } catch (Throwable causa) {
                throw new CuentaAhorrosCreadaNoExiste(MENSAJE_ERROR_CREACION_CUENTA_AHORROS, causa);
           }
        return cuentaExiste;
    }

    public static CuentaAhorros haSidoAbiertaExitosamente(){
        return new CuentaAhorros();
    }
}
