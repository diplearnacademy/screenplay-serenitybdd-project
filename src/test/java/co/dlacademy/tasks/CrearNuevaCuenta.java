package co.dlacademy.tasks;

import co.dlacademy.interaction.GuardarInfoCuenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.dlacademy.userinterfaces.AbrirCuentaNuevaPage.*;
import static co.dlacademy.userinterfaces.DetalleCuentaiInfoPage.*;
import static co.dlacademy.userinterfaces.DetallePerfilPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearNuevaCuenta implements Task {
    private  String tipoCuenta;

    public CrearNuevaCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_ABRIR_NUEVA_CUENTA),
                SelectFromOptions.byVisibleText(tipoCuenta).from(SELECT_TIPO_CUENTA),
                Click.on(BUTTON_ABRIR_CUENTA_NUEVA),
                //GuardarInfoCuenta.informacionParaDespues("cuentaAhorros",LINK_NUEVA_CUENTA_ABIERTO)
                GuardarInfoCuenta.informacionParaDespues("cuentaAhorros","test")

        );
    }

    public static CrearNuevaCuenta deAhorros(String tipoCuenta){
        return instrumented(CrearNuevaCuenta.class,tipoCuenta);
    }
}
