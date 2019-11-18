package tcs.wilmar.tcs.pom.wilmar.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features ="src/test/resources/features/validacionDeFormulario.feature", glue = {"tcs.wilmar.tcs.pom.wilmar.definitions"})

public class RunnerLogin {

}
