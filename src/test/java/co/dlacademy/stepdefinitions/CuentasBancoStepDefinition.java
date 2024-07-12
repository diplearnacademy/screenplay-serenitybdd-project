package co.dlacademy.stepdefinitions;

import co.dlacademy.exceptions.CuentaAhorrosCreadaNoExiste;
import co.dlacademy.interactions.Maximizar;
import co.dlacademy.questions.CuentaAhorros;
import co.dlacademy.tasks.CrearNuevaCuenta;
import co.dlacademy.tasks.Registrar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.dlacademy.exceptions.CuentaAhorrosCreadaNoExiste.MENSAJE_ERROR_CREACION_CUENTA_AHORROS;
import static co.dlacademy.userinterfaces.DetallesPerfilPage.LINK_DETALLES_NUEVA_CUENTA;
import static co.dlacademy.userinterfaces.HomePage.LINK_REGISTRO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CuentasBancoStepDefinition {

    @Given("que {word} esta en la pagina del banco")
    public void queElUsuarioEstaEnLaPaginaDelBanco(String nombre) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(nombre).wasAbleTo(
                Open.url("https://parabank.parasoft.com/"),
                Maximizar.elNavegador()
        );
    }

    @And("realiza el registro como nuevo usuario")
    public void realizaElRegistroComoNuevoUsuario()  {
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
