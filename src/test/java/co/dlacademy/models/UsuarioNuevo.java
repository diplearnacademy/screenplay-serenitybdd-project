package co.dlacademy.models;

import co.dlacademy.models.builders.UsuarioNuevoBuilder;

public class UsuarioNuevo {

    private String nombre;
    private String apellido;
    private String nick;

    public UsuarioNuevo(UsuarioNuevoBuilder usuarioNuevoBuilder) {
        this.nombre = usuarioNuevoBuilder.getNombre();
        this.apellido = usuarioNuevoBuilder.getApellido();
        this.nick = usuarioNuevoBuilder.getNick();
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
}
