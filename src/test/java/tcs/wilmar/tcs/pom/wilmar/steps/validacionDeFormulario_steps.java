package tcs.wilmar.tcs.pom.wilmar.steps;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import net.thucydides.core.annotations.Step;
import tcs.wilmar.tcs.pom.wilmar.pageObjects.Login_pageObject;
import tcs.wilmar.tcs.pom.wilmar.pageObjects.validacionDeFormulario_pageObject;

public class validacionDeFormulario_steps {	
	validacionDeFormulario_pageObject PgObj;
	Login_pageObject Login_pageObject;

	@Step
    public void  Iniciar_sesion(String usuario, String contrasena) {
	Login_pageObject.ingresar_usuario(usuario);
	Login_pageObject.ingresar_Contraseña(contrasena);
	Login_pageObject.Click_en_boton_ingresar();
	}
	
	@Step
	public void seleccionar_formularios() {
		PgObj.seleccionar_formularios();
		PgObj.seleccionar_validationform();
	}
	
	@Step
	public void readEcxel_and_fill_one_form(int arg1) throws InterruptedException, IOException {
		
		
	    File src=new File("src/test/resources/ecxelFiles/dataEcxel.xlsx");
	    FileInputStream fis=new FileInputStream(src);
	    XSSFWorkbook srcBook= new XSSFWorkbook(fis);
	    XSSFSheet sourceSheet = srcBook.getSheetAt(0);

	    
	    XSSFRow sourceRow = sourceSheet.getRow(arg1-1);
	    
	    XSSFCell username=sourceRow.getCell(0);
	    XSSFCell password=sourceRow.getCell(1);
	    
	    String userExcel = username.getStringCellValue();
	    String pwExcel = password.getStringCellValue();
	    
	    System.out.println("The username is" +userExcel);
	    System.out.println("The password is" +pwExcel);
	    
	    //log.info("The username on " +row + " is: "+userExcel);
	    //log.info("The password on "+row+ " is: "+pwExcel);

		
		/*
		PgObj.diligenciar_campo_required(required);
		PgObj.selectSport();
		PgObj.optionSport(select);
		PgObj.multipleSelectSport(multiple_select);
		PgObj.diligenciar_campo_Url(url);
		//PgObj.diligenciar_campo_email(mail);
		PgObj.generar_correo_aleatorio();
		PgObj.diligenciar_campo_password(password);
		PgObj.diligenciar_campo_confirm_password(confirm_password);;
		//PgObj.diligenciar_campo_minimum_size(minimum_field_size);
		PgObj.generar_telefono_aleatorio();
		PgObj.diligenciar_campo_maximum_size(maximum_field_size);
		PgObj.diligenciar_campo_number(number);
		PgObj.diligenciar_campo_ip(ip);
		PgObj.diligenciar_campo_date(date);
		PgObj.diligenciar_campo_date_earlier(date_earlier);
		Thread.sleep(36000);
		*/
				}
}
