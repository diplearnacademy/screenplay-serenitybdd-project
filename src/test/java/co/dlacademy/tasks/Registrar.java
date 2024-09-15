package co.dlacademy.tasks;

import co.dlacademy.models.UsuarioNuevo;
import co.dlacademy.models.lombok.UserReg;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.markers.CanBeSilent;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

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

    public static Performable unUsuarioLombok(UserReg data){
        return instrumented(RegistrarLombok.class, data);
    }
}
