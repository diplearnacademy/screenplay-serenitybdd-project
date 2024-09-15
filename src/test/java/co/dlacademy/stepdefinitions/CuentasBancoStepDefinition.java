package co.dlacademy.stepdefinitions;

import co.dlacademy.exceptions.CuentaAhorrosCreadaNoExiste;
import co.dlacademy.models.UsuarioNuevo;
import co.dlacademy.models.builders.UsuarioNuevoBuilder;
import co.dlacademy.models.lombok.UserReg;
import co.dlacademy.questions.CuentaAhorros;
import co.dlacademy.tasks.CrearNuevaCuenta;
import co.dlacademy.tasks.Registrar;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import static co.dlacademy.exceptions.CuentaAhorrosCreadaNoExiste.MENSAJE_ERROR_CREACION_CUENTA_AHORROS;
import static co.dlacademy.models.builders.UsuarioNuevoBuilder.delBanco;
import static co.dlacademy.userinterfaces.DetallesPerfilPage.LINK_DETALLES_NUEVA_CUENTA;
import static co.dlacademy.userinterfaces.HomePage.LINK_REGISTRO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class CuentasBancoStepDefinition {

    @And("realiza el registro como nuevo usuario")
    public void realizaElRegistroComoNuevoUsuario(DataTable credenciales)  {
        withCurrentActor();
        theActorInTheSpotlight().attemptsTo(
                Click.on(LINK_REGISTRO),
                Registrar.unUsuarioNuevo(credenciales)
        );
    }


/*    @And("realiza el registro para un nuevo usuario")
    public void realizaElRegistroParaNuevoUsuario()  {
        withCurrentActor();
        theActorInTheSpotlight().attemptsTo(
                Click.on(LINK_REGISTRO),
                //Registrar.unUsuarioNuevo(delBanco().con(credenciales).build())
                Registrar.unUsuarioNuevo(
                        delBanco()
                                .conNombre()
                                .apellido()
                                .yNicknameDefinidos()
                                .build())
               // Registrar.unUsuarioNuevo(delBanco().conNombre(credenciales).conNick(credenciales).build()),
                //Registrar.unUsuarioNuevo(delBanco().conNick(credenciales).build())

        );
    }*/


    @And("realiza el registro para un nuevo usuario")
    public void realizaElRegistroParaNuevoUsuarioLombok()  {
        withCurrentActor();
        UserReg data = UserReg.builder()
                .nombre("Pedro")
                .apellido("Acosta")
                .direccion("CLL 77 SUR")
                .ciudad("Sabaneta")
                .estado("Antioquia")
                .codigoPostal("050505")
                .telefono("3223223232")
                .ssn("ABC")
                .username("pedroacosta")
                .clave("123456")
                .claveConfirmacion("123456")
                .build();

        theActorInTheSpotlight().attemptsTo(
                Click.on(LINK_REGISTRO),
                Registrar.unUsuarioLombok(data)
                // Registrar.unUsuarioNuevo(delBanco().conNombre(credenciales).conNick(credenciales).build()),
                //Registrar.unUsuarioNuevo(delBanco().conNick(credenciales).build())

        );
    }


    @And("realiza el registro a un nuevo usuario")
    public void realizaElRegistroUnNuevoUsuario()  {
        withCurrentActor();
        theActorInTheSpotlight().attemptsTo(
                Click.on(LINK_REGISTRO),
                Registrar.unUsuarioNuevo()
        );
    }


    @When("abre una cuenta de {word}")
    public void abreUnaCuenta(String tipoCuenta) {
        theActorInTheSpotlight().attemptsTo(
                CrearNuevaCuenta.deAhorros(tipoCuenta),
                Click.on(LINK_DETALLES_NUEVA_CUENTA)
        );
    }

    @Then("el deberia de ver su cuenta creada de manera exitosa")
    public void elDeberiaDeVerSuCuentaCreadaDeManeraExitosa() {
        theActorInTheSpotlight().should(seeThat(
                        CuentaAhorros.haSidoAbiertaExitosamente()
                ).orComplainWith(CuentaAhorrosCreadaNoExiste.class, MENSAJE_ERROR_CREACION_CUENTA_AHORROS)
        );
    }
}
