package tcs.wilmar.tcs.pom.wilmar.steps;

import net.thucydides.core.annotations.Step;
import tcs.wilmar.tcs.pom.wilmar.pageObjects.Login_pageObject;

public class Login_steps {
	
	Login_pageObject login_pageObject;
	@Step
	public void ingreso_a_navegador() {
			login_pageObject.open();
	}
	@Step
	public void ingresar_usuario(String usuario) {
		login_pageObject.ingresar_usuario(usuario);		
	}
	@Step
	public void ingresar_Contraseña(String contrasena) {
		login_pageObject.ingresar_Contraseña(contrasena);		
	}
	
	@Step
	public void Click_en_boton_ingresar() {
		login_pageObject.Click_en_boton_ingresar();		
	}
	
	@Step
	public void se_valida_ingreso_correcto(){
		login_pageObject.se_valida_ingreso_correcto();
	}

}
