package co.com.choucair.ejemplo.tasks;

import co.com.choucair.ejemplo.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucair.ejemplo.userinterfaces.AboutYourDevices.*;
import static co.com.choucair.ejemplo.userinterfaces.RegisterPersonalData.BTN_CONTINUAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddDevices implements Task {
    private final User user;

    public AddDevices (User user){
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SLT_DISPOSITIVO),
                WaitUntil.the(LISTA_DISPOSITIVOS.of(user.getComputador()), isVisible()),
                Click.on( LISTA_DISPOSITIVOS.of(user.getComputador() )),

                Click.on(SLT_VERSION),
                //WaitUntil.the(LISTA_VERSION.of(user.getVersion()), isVisible()),
                Click.on(LISTA_VERSION.of(user.getVersion())),

                Click.on(SLT_LENGUAJE),
                Enter.keyValues(user.getLenguaje()).into(TXT_LENGUAJE).thenHit(Keys.ENTER),

                Click.on(SLT_MOVIL),
                Enter.keyValues(user.getDispositivo()).into(TXT_MOVIL).thenHit(Keys.ENTER),

                Click.on(SLT_MODELO),
                Enter.keyValues(user.getModelo()).into(TXT_MODELO).thenHit(Keys.ENTER),

                Click.on(SLT_SISTEMA_OPERATIVO),
                Click.on(TXT_SISTEMA_OPERATIVO.of(user.getSistemaOperativo())),
             //   Enter.keyValues(user.getSistemaOperativo()).into(TXT_SISTEMA_OPERATIVO).thenHit(Keys.ENTER),

                Click.on(BTN_CONTINUAR_ULTIMO_PASO)
                );
    }
    public static AddDevices inUtes(User user){
        return Tasks.instrumented(AddDevices.class, user);
    }
}
