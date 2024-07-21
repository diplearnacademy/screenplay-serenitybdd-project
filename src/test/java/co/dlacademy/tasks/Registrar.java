package co.dlacademy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.dlacademy.userinterfaces.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registrar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        //el unico que ejecuta tareas tipo perfomable es el actor
        actor.attemptsTo(
                Type.theValue("pepe").into(INPUT_NOMBRE),
                Type.theValue("probador").into(INPUT_APELLIDO),
                Type.theValue("p Sherman c wallaby 42 sidney").into(INPUT_DIRECCION),
                Type.theValue("Sidney").into(INPUT_CIUDAD),//Simula un typeado tecla por tecla
                Enter.theValue("Antioquia").into(INPUT_ESTADO), //simula un enter despues de escribir un texto
                SendKeys.of("00500").into(INPUT_POSTAL), //pERMITE ENVIAR POR EJEMPLO UN ENTER
                SendKeys.of("3004405642").into(INPUT_TELEFONO),
                SendKeys.of("abc").into(INPUT_SSN),
                SendKeys.of("elpepe5").into(INPUT_USERNAME),
                SendKeys.of("00500").into(INPUT_CLAVE),
                SendKeys.of("00500").into(INPUT_CLAVE_DOS),
                Click.on(BUTTON_REGISTRAR)
        );

    }

    //este metodo se encarga basicamente de ejecutar el contenido de la clase que le mando por parametro
    
    public static Registrar registrarUnUsuarioNuevo(){ //va fucnionar si le coloco registrar ya que hereda
        return instrumented(Registrar.class);
    }
}
