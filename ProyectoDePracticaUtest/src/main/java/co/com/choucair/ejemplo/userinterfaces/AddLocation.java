package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddLocation {
    public static Target BTN_LIMPIAR = Target.the("Boton limpiar campo")
            .located(By.xpath("//button[@class='clear-btn']"));
    public static Target TXT_CIUDAD = Target.the("Campo ciudad")
            .located(By.xpath("//div[@class='infix infix-overflow-hidden']/input[1]"));
    public static Target SELECCIONAR_CIUDAD = Target.the("Campo seleccionar ciudad")
            .located(By.xpath("//div[contains(@class,'option')]"));

    public static Target TXT_CODIGO_POSTAL= Target.the("Campo código postal")
            .located(By.name("zip"));
    public static Target TXT_PAIS = Target.the("Campo Pais")
            .located(By.xpath("(//span[contains(@class,'btn btn-default form-control ui-select-toggle')])[2]"));

}
