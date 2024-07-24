package co.dlacademy.models.builders;

import co.dlacademy.models.UsuarioNuevo;
import co.dlacademy.utils.Builder;
import co.dlacademy.utils.GeneradorDatos;
import io.cucumber.datatable.DataTable;

public class UsuarioNuevoBuilder implements Builder<UsuarioNuevo> {

    private String nombre;
    private String apellido;
    private String nick;

    GeneradorDatos generadorDatos = new GeneradorDatos();

    public static UsuarioNuevoBuilder delBanco(){
        return new UsuarioNuevoBuilder();
    }

    public UsuarioNuevoBuilder con(DataTable datos){
        this.nombre = datos.asMaps().get(0).get("nombre");
        this.apellido = datos.asMaps().get(0).get("apellido");
        this.nick = datos.asMaps().get(0).get("nick");
        return this;
    }

    public UsuarioNuevoBuilder conNombre(){
        this.nombre = generadorDatos.generarNombre();
        return this;
    }

    public UsuarioNuevoBuilder apellido(){
        this.apellido = generadorDatos.generarApellido();
        return this;
    }

    public UsuarioNuevoBuilder yNicknameDefinidos(){
        this.nick = generadorDatos.generarApodoBanco();
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public UsuarioNuevo build() {
        return new UsuarioNuevo(this);
    }
}
