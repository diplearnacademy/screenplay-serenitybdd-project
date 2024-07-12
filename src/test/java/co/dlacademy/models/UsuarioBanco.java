package co.dlacademy.models;

import co.dlacademy.models.builders.UsuarioBancoBuilder;

public class UsuarioBanco {
    private String nombre;
    private String apellido;
    private String nick;

    public UsuarioBanco(UsuarioBancoBuilder usuarioBancoBuilder) {
        this.nombre = usuarioBancoBuilder.getNombre();
        this.apellido = usuarioBancoBuilder.getApellido();
        this.nick = usuarioBancoBuilder.getNick();
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
