package tcs.wilmar.tcs.pom.wilmar.pageObjects;


import java.io.IOException;

import com.mifmif.common.regex.Generex;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import tcs.wilmar.tcs.pom.wilmar.utilidades.Utilidades;


public class validacionDeFormulario_pageObject extends PageObject {
	
	Utilidades utilidades = new Utilidades();
	String correoAleatorio = "\\w{10}\\@gmail\\.com";
	String telefonoAleatorio = "320(1|3|7|8)\\d{7}";
	
    //Localizadores
    @FindBy(how = How.XPATH,using = "//a[@class='dropdown-toggle']")
    private WebElementFacade fromelements;
    
    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Validation')]")
    private WebElementFacade validationform;
	
    @FindBy(how = How.XPATH,using = "//input[@id='req']")
    private WebElementFacade txRequired;
    
    @FindBy(how = How.XPATH,using = "//select[@id='sport']")
    private WebElementFacade selectSport;
		
    @FindBy(how = How.XPATH,using = "")
    private WebElementFacade optionSport;
    
    @FindBy(how = How.XPATH,using = "//input[@id='url1']")
    private WebElementFacade txtUrl;
    
    @FindBy(how = How.XPATH,using = "//input[@id='email1']")
    private WebElementFacade txtEmail;
    
    @FindBy(how = How.XPATH,using = "//input[@id='pass1']")
    private WebElementFacade txtPassword;
        
    @FindBy(how = How.XPATH,using = "//input[@id='pass2']")
    private WebElementFacade txtConfirmPassword;
    
    @FindBy(how = How.XPATH,using = "//input[@id='minsize1']")
    private WebElementFacade txtMinimumSize;
    
    @FindBy(how = How.XPATH,using = "//input[@id='maxsize1']")
    private WebElementFacade txtMaximumSize;

    @FindBy(how = How.XPATH,using = "//input[@id='number2']")
    private WebElementFacade txtNumber;
    
    @FindBy(how = How.XPATH,using = "//input[@id='ip']")
    private WebElementFacade txtIp;
    
    @FindBy(how = How.XPATH,using = "//input[@id='date3']")
    private WebElementFacade txtDate;
    
    @FindBy(how = How.XPATH,using = "//input[@id='past']")
    private WebElementFacade txtDateEarlier;
    
    
	public void seleccionar_formularios() {
		fromelements.click();
	}
	
	public void seleccionar_validationform() {
		validationform.click();
	}
	public void diligenciar_campo_required(String arg1) {
		txRequired.sendKeys(arg1);
	}
	
	public void selectSport() {
		selectSport.click();
	}

	public void optionSport(String arg) {
		find(By.xpath("//select[@id='sport']//option[contains(text(),'"+arg+"')]")).click();
	}
	
	public void multipleSelectSport(String arg) {
		find(By.xpath("//select[@id='sport2']//option[contains(text(),'"+arg+"')]")).click();

	}
	
	public void diligenciar_campo_Url(String arg) {
		txtUrl.sendKeys(arg);
	}
	
	public void diligenciar_campo_email(String arg) {
		txtEmail.sendKeys(arg);
	}
	
	public void generar_correo_aleatorio(){
		txtEmail.sendKeys(new Generex(correoAleatorio).random());
	}
	
	public void diligenciar_campo_password(String arg) {
		txtPassword.sendKeys(arg);
	}
	
	public void diligenciar_campo_confirm_password(String arg) {
		txtConfirmPassword.sendKeys(arg);
	}
	
	public void diligenciar_campo_minimum_size(String arg) {
		txtMinimumSize.sendKeys(arg);
	}
	
	public void generar_telefono_aleatorio() {
		txtMinimumSize.clear();
		txtMinimumSize.sendKeys(new Generex(telefonoAleatorio).random());	
	}
	
	public void diligenciar_campo_maximum_size(String arg) {
		txtMaximumSize.clear();
		txtMaximumSize.sendKeys(arg);
	}
	
	public void diligenciar_campo_number(String arg) {
		txtNumber.clear();
		txtNumber.sendKeys(arg);
	}
	
	public void diligenciar_campo_ip(String arg) {
		txtIp.clear();
		txtIp.sendKeys(arg);
	}
	
	public void diligenciar_campo_date(String arg) {
		txtDate.clear();
		txtDate.sendKeys(arg);
	}
	
	public void diligenciar_campo_date_earlier(String arg) {
		txtDateEarlier.clear();
		txtDateEarlier.sendKeys(arg);
	}
	
	
}
