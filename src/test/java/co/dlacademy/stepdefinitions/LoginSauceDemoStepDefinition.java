package co.dlacademy.stepdefinitions;

import co.dlacademy.tasks.Autenticacion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.dlacademy.userinterfaces.ProductoPage.LABEL_TITULO_PAGINA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSauceDemoStepDefinition {

    @When("el ingresa sus credenciales")
    public void elIngresaSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(Autenticacion.enSaucedemo());
    }

    @Then("el usuario deberia ingresar a la pagina {word}")
    public void elUsuarioDeberiaIngresarALaPaginaProductos(String nombrePagina) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(LABEL_TITULO_PAGINA).hasText(nombrePagina));
    }
}
