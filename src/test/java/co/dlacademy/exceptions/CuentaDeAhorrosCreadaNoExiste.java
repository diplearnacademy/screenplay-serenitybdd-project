package co.dlacademy.exceptions;

public class CuentaDeAhorrosCreadaNoExiste extends AssertionError{
    public static final String MENSAJE_ERROR_CREACION_CUENTA_AHORROS = "La cuenta de ahorros creada no esta listada en la pagina";

    public CuentaDeAhorrosCreadaNoExiste(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
