package co.dlacademy.tasks;

import co.dlacademy.models.lombok.UserReg;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static co.dlacademy.userinterfaces.RegistroPage.*;

public  class RegistrarLombok extends Registrar {

    private final UserReg data;

    public RegistrarLombok(UserReg data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.getNombre()).into(INPUT_NOMBRE),
                Enter.theValue(data.getApellido()).into(INPUT_APELLIDO),
                Enter.theValue(data.getDireccion()).into(INPUT_DIRECCION),
                Enter.theValue(data.getCiudad()).into(INPUT_CIUDAD),
                Enter.theValue(data.getEstado()).into(INPUT_ESTADO),
                SendKeys.of(data.getCodigoPostal()).into(INPUT_POSTAL),
                SendKeys.of(data.getTelefono()).into(INPUT_TELEFONO),
                SendKeys.of(data.getSsn()).into(INPUT_SSN),
                SendKeys.of(data.getUsername()).into(INPUT_USERNAME),
                SendKeys.of(data.getClave()).into(INPUT_CLAVE),
                SendKeys.of(data.getClaveConfirmacion()).into(INPUT_CLAVE_DOS),
                Click.on(BUTTON_REGISTRAR)
        );
    }

    @Override
    public boolean isSilent() {
        return false;
    }
}