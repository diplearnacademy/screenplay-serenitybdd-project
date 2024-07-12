package co.dlacademy.interactions;

import co.dlacademy.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Interaction {

    @Page
    HomePage homePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(homePage)
        );
    }

    public static Performable elNavegador(){
        return instrumented(Abrir.class);
    }
}
