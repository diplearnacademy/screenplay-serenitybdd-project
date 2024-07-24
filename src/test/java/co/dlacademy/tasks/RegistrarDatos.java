package co.dlacademy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.dlacademy.userinterfaces.RegistroPage.*;
import static co.dlacademy.userinterfaces.RegistroPage.BUTTON_REGISTRAR;

public  class RegistrarDatos extends Registrar {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue("asdas").into(INPUT_NOMBRE),
                Type.theValue("sads").into(INPUT_APELLIDO),
                Type.theValue("CLL 77 SUR").into(INPUT_DIRECCION),
                Type.theValue("Sabaneta").into(INPUT_CIUDAD),
                Enter.theValue("Antioquia").into(INPUT_ESTADO),
                SendKeys.of("050505").into(INPUT_POSTAL),
                SendKeys.of("3223223232").into(INPUT_TELEFONO),
                SendKeys.of("ABC").into(INPUT_SSN),
                SendKeys.of("pedroacosta").into(INPUT_USERNAME),
                SendKeys.of("123456").into(INPUT_CLAVE),
                SendKeys.of("123456").into(INPUT_CLAVE_DOS),
                Click.on(BUTTON_REGISTRAR)
        );
    }

    @Override
    public boolean isSilent() {
        return true;
    }
}
