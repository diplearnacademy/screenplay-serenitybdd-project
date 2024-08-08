package co.dlacademy.tasks;

import co.dlacademy.interactions.Guardar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.dlacademy.userinterfaces.AbrirCuentaNuevaPage.BUTTON_ABRIR_CUENTA_NUEVA;
import static co.dlacademy.userinterfaces.AbrirCuentaNuevaPage.SELECT_TIPO_CUENTA;
import static co.dlacademy.userinterfaces.DetallesCuentaAbiertaPage.LINK_NUEVA_CUENTA_ABIERTO;
import static co.dlacademy.userinterfaces.DetallesPerfilPage.LINK_ABRIR_NUEVA_CUENTA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class CrearNuevaCuenta implements Task {

    private String tipoCuenta;

    public CrearNuevaCuenta(String tipoCuenta){
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_ABRIR_NUEVA_CUENTA),
                SelectFromOptions.byVisibleText(tipoCuenta).from((SELECT_TIPO_CUENTA)),
                Click.on(BUTTON_ABRIR_CUENTA_NUEVA),
                WaitUntil.the(LINK_NUEVA_CUENTA_ABIERTO, isPresent()).forNoMoreThan(Duration.ofSeconds(8)),
                Guardar.informacionParaDespues("cuentaAhorros", LINK_NUEVA_CUENTA_ABIERTO)
        );
    }

    public static Performable deAhorros(String tipoCuenta){
        return instrumented(CrearNuevaCuenta.class, tipoCuenta);
    }
}
