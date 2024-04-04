package co.com.choucair.ejemplo.tasks;

import co.com.choucair.ejemplo.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.ejemplo.userinterfaces.AddLocation.*;
import static co.com.choucair.ejemplo.userinterfaces.RegisterPersonalData.BTN_CONTINUAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddYourAdress implements Task {
    private User user;

    public AddYourAdress(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_LIMPIAR),
                // WaitUntil.angularRequestsHaveFinished(),
                WaitUntil.the(TXT_CIUDAD, isVisible()),
                Enter.theValue(user.getCiudad()).into(TXT_CIUDAD),
                WaitUntil.the(SELECCIONAR_CIUDAD, isVisible()),
                Click.on(SELECCIONAR_CIUDAD),
                Enter.theValue(user.getCodigoPostal()).into(TXT_CODIGO_POSTAL),
               // Enter.theValue(user.getPais()).into(TXT_PAIS),
               // Hit.the(Keys.ENTER).into(TXT_PAIS),
                Click.on(BTN_CONTINUAR)


        );
    }

    public static AddYourAdress enUtest(User user) {
        return Tasks.instrumented(AddYourAdress.class, user);
    }
}
