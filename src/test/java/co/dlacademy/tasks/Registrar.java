package co.dlacademy.tasks;

import co.dlacademy.models.UsuarioNuevo;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.markers.CanBeSilent;
import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.SilentTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.type.Type;

import javax.xml.crypto.Data;

import static co.dlacademy.userinterfaces.RegistroPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public abstract class Registrar implements Task, CanBeSilent {

    public static Performable unUsuarioNuevo(){
        return instrumented(RegistrarDatos.class);
    }

    public static Performable unUsuarioNuevo(DataTable datos){
        return instrumented(RegistrarDatable.class, datos);
    }

    public static Performable unUsuarioNuevo(UsuarioNuevo datos){
        return instrumented(RegistrarModelo.class, datos);
    }
}
