package co.com.choucair.ejemplo.tasks;

import co.com.choucair.ejemplo.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SetCheckbox;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.ejemplo.userinterfaces.TheLastStep.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreatePassword implements Task {

    private final User user;
    public CreatePassword (User user){
        this.user = user;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(user.getContrasena()).into(TXT_CONTRASENA),
                Enter.keyValues(user.getConfirmarContrasena()).into(TXT_CONFIRMAR_CONTRASENA),
                SetCheckbox.of(CBX_MANTENERME_AL_DIA).toTrue(),
                SetCheckbox.of(CBX_ACEPTAR_POLITICAS).toTrue(),
                SetCheckbox.of(CBX_ACEPTAR_TERMINOS_DE_USOCBX_ACEPTAR_TERMINOS_DE_USO).toTrue(),
               // WaitUntil.the(CBX_ACEPTAR_POLITICAS, isVisible()),

                //Scroll.to(BTN_TERMINAR_SECCION),
                Click.on(BTN_TERMINAR_SECCION)
        );
    }
    public static CreatePassword inUtest(User user){
        return Tasks.instrumented(CreatePassword.class, user);
    }
}
