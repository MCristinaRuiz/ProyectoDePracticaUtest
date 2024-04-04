package co.com.choucair.ejemplo.tasks;

import co.com.choucair.ejemplo.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.ejemplo.userinterfaces.JoinToday.LNK_JOIN_TODAY;
import static co.com.choucair.ejemplo.userinterfaces.RegisterPersonalData.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CrearUsuario implements Task {
    private User user;

    public CrearUsuario(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LNK_JOIN_TODAY, isVisible()),
                Click.on(LNK_JOIN_TODAY),
                WaitUntil.the(TXT_NOMBRE, isVisible()),
                Enter.theValue(user.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(user.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(user.getEmail()).into(TXT_EMAIL),
                Click.on(TXT_MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(user.getMesNacimiento()).from(TXT_MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(user.getDiaNacimiento()).from(TXT_DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(user.getAnoNacimiento()).from(TXT_ANO_NACIMIENTO),
                Click.on(BTN_CONTINUAR)

        );
    }
    public static CrearUsuario enUTest(User user){
        return Tasks.instrumented(CrearUsuario.class, user);
    }
}


