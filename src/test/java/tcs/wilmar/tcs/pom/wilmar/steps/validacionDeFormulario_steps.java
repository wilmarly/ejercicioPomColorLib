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

	    
	    XSSFRow sourceRow = sourceSheet.getRow(arg1);
	    
	    XSSFCell required=sourceRow.getCell(0);
	    XSSFCell select=sourceRow.getCell(1);
	    XSSFCell multipleSelectSport=sourceRow.getCell(2);
	    XSSFCell url=sourceRow.getCell(3);
	    XSSFCell mail=sourceRow.getCell(4);
	    XSSFCell password=sourceRow.getCell(5);
	    XSSFCell confirm_password=sourceRow.getCell(6);
	    /*XSSFCell minimum_field_size=sourceRow.getCell(7);
	    XSSFCell maximum_field_size=sourceRow.getCell(8);
	    XSSFCell number=sourceRow.getCell(9);
	    XSSFCell ip=sourceRow.getCell(10);
	    XSSFCell date=sourceRow.getCell(11);
	    XSSFCell date_earlier=sourceRow.getCell(12);*/
	    
	    String txtRequired = required.getStringCellValue();
	    String txtSelect = select.getStringCellValue();
	    String txtMultipleSelectSport = multipleSelectSport.getStringCellValue();
	    String txtUrl = url.getStringCellValue();
	    String txtMail = mail.getStringCellValue();
	    String txtPassword = password.getStringCellValue();
	    String txtConfirmPasword = confirm_password.getStringCellValue();
	    /*String txtMinimumFieldSize = minimum_field_size.getStringCellValue();
	    String txtMaximumFieldSize = number.getStringCellValue();
	    String txtNumber = number.getStringCellValue();
	    String txtIp = number.getStringCellValue();
	    String txtDate = date.getStringCellValue();
	    String txtDateEarlier = date.getStringCellValue();*/
	   
	    
	    PgObj.diligenciar_campo_required(txtRequired);
	    PgObj.selectSport();
	    PgObj.optionSport(txtSelect);
	    PgObj.multipleSelectSport(txtMultipleSelectSport);
	    PgObj.diligenciar_campo_Url(txtUrl);
		//PgObj.diligenciar_campo_email(txtMail);
		PgObj.generar_correo_aleatorio();
		PgObj.diligenciar_campo_password(txtPassword);
		PgObj.diligenciar_campo_confirm_password(txtConfirmPasword);
		/*//PgObj.diligenciar_campo_minimum_size(txtMinimumFieldSize);
		PgObj.generar_telefono_aleatorio();
		PgObj.diligenciar_campo_maximum_size(txtMaximumFieldSize);
		PgObj.diligenciar_campo_number(txtNumber);
		PgObj.diligenciar_campo_ip(txtIp);
		PgObj.diligenciar_campo_date(txtDate);
		PgObj.diligenciar_campo_date_earlier(txtDateEarlier);
		Thread.sleep(36000);*/
		

				}
}
