package co.dlacademy.stepdefinitions;

import co.dlacademy.interactions.Maximizar;
import co.dlacademy.tasks.CrearNuevaCuenta;
import co.dlacademy.tasks.Registrar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.dlacademy.tasks.Registrar.unUsuarioNuevo;
import static co.dlacademy.userinterfaces.HomePage.LINK_REGISTRO;
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
                CrearNuevaCuenta.deAhorros(tipoCuenta)
        );
    }

    @Then("el deberia de ver su cuenta creada de manera exitosa")
    public void elDeberiaDeVerSuCuentaCreadaDeManeraExitosa() {

    }

}
