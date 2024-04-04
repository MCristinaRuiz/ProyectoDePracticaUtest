package co.com.choucair.ejemplo.stepdefinitions;

import co.com.choucair.ejemplo.Exeptions.AccountCreationFailed;
import co.com.choucair.ejemplo.models.User;
import co.com.choucair.ejemplo.questions.Message;
import co.com.choucair.ejemplo.tasks.AddDevices;
import co.com.choucair.ejemplo.tasks.AddYourAdress;
import co.com.choucair.ejemplo.tasks.CrearUsuario;
import co.com.choucair.ejemplo.tasks.CreatePassword;
import co.com.choucair.ejemplo.userinterfaces.MainPage;
import co.com.choucair.ejemplo.utils.KillBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.hamcrest.Matchers;
import org.openqa.selenium.remote.http.UrlTemplate;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static co.com.choucair.ejemplo.userinterfaces.UtestPage.LBL_MESAGGE;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class UtestPracticaStepDefinition {

    @Before
    public void initialConfigurationDektop() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public static void CloseDriver() throws IOException, InterruptedException {
        SerenityWebdriverManager.inThisTestThread().getCurrentDriver().quit();
        KillBrowser.processes(List.of((SerenityWebdriverManager.inThisTestThread().getCurrentDriverName()).split(":")).get(0));
    }
    @DataTableType
    public User user(Map<String, String> entry){
        return new User(
                entry.get("Nombre"),
                entry.get("Apellido"),
                entry.get("Email"),
                entry.get("Mes Nacimiento"),
                entry.get("Dia Nacimiento"),
                entry.get("Ano Nacimiento"),
                entry.get("Ciudad"),
                entry.get("Codigo postal"),
                entry.get("Pais"),
                entry.get("Computador"),
                entry.get("Version"),
                entry.get("Lenguaje"),
                entry.get("Dispositivo"),
                entry.get("Modelo"),
                entry.get("Sistema operativo"),
                entry.get("Contrasena"),
                entry.get("Confirmar Contrasena")
        );
    }

    @Dado("que {} ingresa a la pagina web de uTest")
    public void queCristinaIngresaALaPaginaWebDeUTest(String Cristina) {
        theActorCalled(Cristina);
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().the(MainPage.class));

    }
    @Cuando("diligencie el formulario de registro exitosamente")
    public void diligencieElFormularioDeRegistroExitosamente(User user) {
        theActorInTheSpotlight().attemptsTo(
                CrearUsuario.enUTest(user),
                AddYourAdress.enUtest(user),
                AddDevices.inUtes(user),
                CreatePassword.inUtest(user)
        );
    }
    @Entonces("podra comenzar con uTest y ver el mensaje de bienvenida {}")
    public void podraComenzarConUTestYVerElMensajeDeBienvenida(String mensage) {
        theActorInTheSpotlight().should(
                //esta forma es con una exepción, se debe eliminar el mensaje del feature y el parametro
               //GivenWhenThen.seeThat(Message.welcomeMessage(), Matchers.equalTo(true))
                               // .orComplainWith(AccountCreationFailed.class)
                seeThat(Text.of(LBL_MESAGGE), is(mensage))
        );
    }
}
