package tcs.wilmar.tcs.pom.wilmar.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import tcs.wilmar.tcs.pom.wilmar.steps.Login_steps;

public class Login_definition {
	
	@Steps
	Login_steps login_steps;
	
	
	@Given("^Ingreso a navegador$")
	public void ingreso_a_navegador() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
	    login_steps.ingreso_a_navegador();
	    
	}

	@When("^Ingresar usuario \"([^\"]*)\"$")
	public void ingresar_usuario(String usuario) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		login_steps.ingresar_usuario(usuario);
	    
	}

	@When("^Ingresar Contraseña \"([^\"]*)\"$")
	public void ingresar_Contraseña(String contrasena) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		login_steps.ingresar_Contraseña(contrasena);
	    
	}

	@When("^Click en boton ingresar$")
	public void click_en_boton_ingresar() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		login_steps.Click_en_boton_ingresar();
	    
	}

	@Then("^se valida ongreso correcto$")
	public void se_valida_ongreso_correcto() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		login_steps.se_valida_ingreso_correcto();
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
