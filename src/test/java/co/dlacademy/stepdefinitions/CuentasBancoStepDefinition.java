package co.dlacademy.stepdefinitions;

/*import co.dlacademy.interactions.Maximizar;
import co.dlacademy.tasks.CrearNuevaCuenta;
import co.dlacademy.tasks.Registrar;*/
import co.dlacademy.exceptions.CuentaDeAhorrosCreadaNoExiste;
import co.dlacademy.interaction.Abrir;
import co.dlacademy.interaction.Maximizar;
import co.dlacademy.questions.CuentaAhorros;
import co.dlacademy.tasks.CrearNuevaCuenta;
import co.dlacademy.tasks.Registrar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

//import static co.dlacademy.tasks.Registrar.unUsuarioNuevo;
import java.util.List;

import static co.dlacademy.exceptions.CuentaDeAhorrosCreadaNoExiste.MENSAJE_ERROR_CREACION_CUENTA_AHORROS;
import static co.dlacademy.userinterfaces.DetallePerfilPage.LINK_DETALLES_NUEVA_CUENTA;
import static co.dlacademy.userinterfaces.HomePage.LINK_REGISTRO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CuentasBancoStepDefinition {

    @Given("que {word} esta en la pagina del banco")
    public void queElUsuarioEstaEnLaPaginaDelBanco(String nombre) {
        //preparo el escenario para el actor
        //wasAbleto se usa para interaccion
        //attemsto se una para tareas
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(nombre).wasAbleTo(
                Abrir.elNavegador(),
                Maximizar.elNavegador()
        );
    }

    @And("realiza el registro como nuevo usuario")
    public void realizaElRegistroComoNuevoUsuario()  {
        theActorInTheSpotlight().wasAbleTo( //cosas muy tecnicas el wasable to
                Click.on(LINK_REGISTRO),
                Registrar.registrarUnUsuarioNuevo()
                //puedes llamar a la clase o solo al metodo estatico,
                // pero puede pasar que haya confusion porque un metodo se puede llamar igual en diferentes clases
                    // registrarUnUsuarioNuevo()
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
/*        String cuentaAhorrosCreada = theActorInTheSpotlight().recall("cuentaAhorros");
        List<String> cuentasAhorroUsuario = LISTA_CUENTAS_USUARIO.resolveAllFor(theActorInTheSpotlight()).texts();
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(cuentaAhorrosCreada).isIn(cuentasAhorroUsuario)
        );*/

        theActorInTheSpotlight().should(seeThat(
                CuentaAhorros.HaSidoAbiertaExitosamente()
        ).orComplainWith(CuentaDeAhorrosCreadaNoExiste.class,MENSAJE_ERROR_CREACION_CUENTA_AHORROS) );
    }

}