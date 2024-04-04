package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinToday {
    public static final Target LNK_JOIN_TODAY = Target.the("Boton join today ")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
