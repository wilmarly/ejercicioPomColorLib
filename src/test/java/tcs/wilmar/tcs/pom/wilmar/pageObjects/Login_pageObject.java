package tcs.wilmar.tcs.pom.wilmar.pageObjects;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class Login_pageObject extends PageObject {
	
	String txt_Usuario="//input[@placeholder='Username']";
	String txt_Contraseña="//input[@placeholder='Password']";
	String btn_singIn ="//button[@class='btn btn-lg btn-primary btn-block']";
	
	public void ingresar_usuario(String usuario) {
		find(By.xpath(txt_Usuario)).sendKeys(usuario);
	}
	
	public void ingresar_Contraseña(String contrasena) {
		find(By.xpath(txt_Contraseña)).sendKeys(contrasena);
	}

	public void Click_en_boton_ingresar() {
		find(By.xpath(btn_singIn)).click();
	}
	
	public void se_valida_ingreso_correcto () {

		assertEquals("Metis",getDriver().getTitle());
	}

}
