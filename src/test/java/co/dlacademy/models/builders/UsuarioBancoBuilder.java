package co.dlacademy.models.builders;

import co.dlacademy.models.UsuarioBanco;
import co.dlacademy.utils.Builder;
import io.cucumber.datatable.DataTable;

public class UsuarioBancoBuilder implements Builder<UsuarioBanco>  {
    private String nombre;
    private String apellido;
    private String nick;

    public static UsuarioBancoBuilder delBancoParabank( ){
        return new UsuarioBancoBuilder();
    }

    public UsuarioBancoBuilder con(DataTable credenciales){
        this.nombre = credenciales.asMaps().get(0).get("nombre");
        this.apellido = credenciales.asMaps().get(0).get("apellido");
        this.nick = credenciales.asMaps().get(0).get("nick");
        return this;
    }

    public UsuarioBancoBuilder llamado(){
        this.nombre = "Juan";
        return this;
    }

    public UsuarioBancoBuilder conApellido(){
        this.nombre = "Fernandez";
        return this;
    }

    public UsuarioBancoBuilder yNickname(){
        this.nombre = "juan50";
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
    public UsuarioBanco build() {
        return new UsuarioBanco(this);
    }
}
