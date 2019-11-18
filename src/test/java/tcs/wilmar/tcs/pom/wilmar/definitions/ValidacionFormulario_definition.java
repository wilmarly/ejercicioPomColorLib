package tcs.wilmar.tcs.pom.wilmar.definitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import tcs.wilmar.tcs.pom.wilmar.steps.validacionDeFormulario_steps;

public class ValidacionFormulario_definition {

	@Steps
	validacionDeFormulario_steps step;

	@Given("^Iniciar sesion \"([^\"]*)\"\"([^\"]*)\"$")
	public void iniciar_sesion(String usuario, String contrasena) throws Exception {
		step.Iniciar_sesion(usuario, contrasena);
	}

	@When("^Seleccionar formularios$")
	public void seleccionar_formularios() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		step.seleccionar_formularios();

	}
	
	@When("^Diligenciar Formulario uno con los siguiente datos \"([^\"]*)\"$")
	public void diligenciar_Formulario_uno_con_los_siguiente_datos(int arg1) throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		step.readEcxel_and_fill_one_form(arg1);
	}

}



