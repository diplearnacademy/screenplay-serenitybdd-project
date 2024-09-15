package co.dlacademy.models.lombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserReg {
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    private String estado;
    private String codigoPostal;
    private String telefono;
    private String ssn;
    private String username;
    private String clave;
    private String claveConfirmacion;
}

