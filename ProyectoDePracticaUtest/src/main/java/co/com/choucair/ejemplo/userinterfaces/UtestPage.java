package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPage {
    public static Target LBL_MESAGGE = Target.the("Mensaje de bienvenida a Utest")
            .located(By.xpath("//div[@class='image-box-header']"));
}
