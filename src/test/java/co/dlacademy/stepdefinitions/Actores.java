package co.dlacademy.stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.core.Serenity.getDriver;

public class Actores {
    public static Actor JUAN = Actor.named("Juan");
    public static Actor PEDRO = Actor.named("Pedro");

    static {
        JUAN.can(BrowseTheWeb.with(getDriver()));
        PEDRO.can(BrowseTheWeb.with(getDriver()));
    }
}
