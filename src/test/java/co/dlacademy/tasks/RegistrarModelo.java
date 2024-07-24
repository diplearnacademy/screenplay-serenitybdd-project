package co.dlacademy.tasks;

import co.dlacademy.models.UsuarioNuevo;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.dlacademy.userinterfaces.RegistroPage.*;

public class RegistrarModelo extends Registrar {

    private UsuarioNuevo datos;

    public RegistrarModelo(UsuarioNuevo datos){
        this.datos = datos;
    }

    @Step("{0} esta dandose de alta en el banco")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue(datos.getNombre()).into(INPUT_NOMBRE),
                Type.theValue(datos.getApellido()).into(INPUT_APELLIDO),
                Type.theValue("CLL 77 SUR").into(INPUT_DIRECCION),
                Type.theValue("Sabaneta").into(INPUT_CIUDAD),
                Enter.theValue("Antioquia").into(INPUT_ESTADO),
                SendKeys.of("050505").into(INPUT_POSTAL),
                SendKeys.of("3223223232").into(INPUT_TELEFONO),
                SendKeys.of("ABC").into(INPUT_SSN),
                SendKeys.of(datos.getNick()).into(INPUT_USERNAME),
                SendKeys.of("123456").into(INPUT_CLAVE),
                SendKeys.of("123456").into(INPUT_CLAVE_DOS),
                Click.on(BUTTON_REGISTRAR)
        );
    }

    @Override
    public boolean isSilent() {
        return false;
    }
}
