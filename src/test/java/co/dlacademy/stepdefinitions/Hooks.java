package co.dlacademy.stepdefinitions;

import co.dlacademy.interactions.Abrir;
import co.dlacademy.interactions.Maximizar;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Hooks {

    @Before
    public void preparacionEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que {word} se encuentra en la pagina")
    public void queElUsuarioEstaEnLaPaginaDelBanco(String nombre) {
        theActorCalled(nombre).wasAbleTo(
                Abrir.elNavegador(),
                Maximizar.elNavegador()
        );
    }

    @After
    public void finEscenario() {
        //TODO: Aqui el codigo que quieras si necesitas ejecutar algo despues del escenario
    }
}
