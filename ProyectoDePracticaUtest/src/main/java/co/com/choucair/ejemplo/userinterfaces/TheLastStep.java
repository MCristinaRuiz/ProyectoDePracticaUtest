package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TheLastStep {


    public static final Target TXT_CONTRASENA = Target.the("Campo contrasena").
            located(By.id("password"));
    public static final Target TXT_CONFIRMAR_CONTRASENA = Target.the("Campo confirmar contrasena").
            located(By.id("confirmPassword"));
    public static final Target CBX_MANTENERME_AL_DIA = Target.the("checbox amantenerme al dia con correos").
            located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target CBX_ACEPTAR_TERMINOS_DE_USOCBX_ACEPTAR_TERMINOS_DE_USO = Target.the("checbox aceptar terminos de uso").
            located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static final Target CBX_ACEPTAR_POLITICAS = Target.the("checbox aceptar politicas de privacidad").
            located(By.id("privacySetting"));

    public static final Target BTN_TERMINAR_SECCION = Target.the("Boton continuar para terminar sección").
            located(By.xpath("//button/span[contains(text(),'Complete Setu')]"));
}
