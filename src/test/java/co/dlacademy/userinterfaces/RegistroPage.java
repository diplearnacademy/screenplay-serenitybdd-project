package co.dlacademy.userinterfaces;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;
import org.openqa.selenium.support.FindBy;

import static java.sql.DriverManager.getDriver;
import static java.sql.DriverManager.getDrivers;
import static net.serenitybdd.screenplay.targets.Target.the;

public class RegistroPage {

    public static final Target INPUT_NOMBRE = the("Campo para ingreso de Nombre")
            .located(By.id("customer.firstName"));
    public static final Target INPUT_APELLIDO = the("Campo para ingreso de Apellido")
            .located(By.id("customer.lastName"));
    public static final Target INPUT_DIRECCION = the("Campo para ingreso de Direccion")
            .located(By.id("customer.address.street"));
    public static final Target INPUT_CIUDAD = the("Campo para ingreso de Ciudad")
            .located(By.id("customer.address.city"));
    public static final Target INPUT_ESTADO = the("Campo para ingreso de Estado")
            .located(By.id("customer.address.state"));
    public static final Target INPUT_POSTAL = the("Campo para ingreso de Codigo Postal")
            .located(By.id("customer.address.zipCode"));
    public static final Target INPUT_TELEFONO = the("Campo para ingreso de Telefono")
            .located(By.id("customer.phoneNumber"));
    public static final Target INPUT_SSN = the("Campo para ingreso de SSN")
            .located(By.id("customer.ssn"));
    public static final Target INPUT_USERNAME = the("Campo para ingreso de Nickname")
            .located(By.id("customer.username"));
    public static final Target INPUT_CLAVE = the("Campo para ingreso de Clave")
            .located(By.id("customer.password"));
    public static final Target INPUT_CLAVE_DOS = the("Campo para ingreso de Clave Segunda Vez")
            .located(By.id("repeatedPassword"));
    public static final Target BUTTON_REGISTRAR = the("Boton de Ingreso")
            .locatedBy("//input[@value='Register']");
}

