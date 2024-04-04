package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPersonalData {

    public static final Target TXT_NOMBRE = Target.the("Campo nombre")
            .located(By.id("firstName"));
    public static final Target TXT_APELLIDO = Target.the("Campo apellido")
            .located(By.id("lastName"));
    public static final Target TXT_EMAIL= Target.the("Campo email")
            .located(By.id("email"));
    public static Target TXT_MES_NACIMIENTO = Target.the("Campo mes de nacimiento")
            .locatedBy("//select[@id='birthMonth']");
    public static Target TXT_DIA_NACIMIENTO = Target.the("Campo dia de nacimiento")
            .locatedBy("//select[@id='birthDay']");
    public static Target TXT_ANO_NACIMIENTO = Target.the("Campo año de nacimiento")
            .locatedBy("//select[@id='birthYear']");
    public static Target BTN_CONTINUAR = Target.the("Boton continuar")
            .located(By.xpath("//button[@class='btn btn-blue']"));

private void RegisterPersonalDat(){}
}
