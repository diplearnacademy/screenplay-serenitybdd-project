package co.dlacademy.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/ahorros/cuentas_ahorros_banco.feature",
        glue = "co.dlacademy.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CuentasAhorrosBancoRunner {
}
