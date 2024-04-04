package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutYourDevices {

    public static Target SLT_DISPOSITIVO = Target.the("Campo Dispositivo")
            .located(By.xpath("(//span[@aria-label='Select OS'])[1]"));
    public static Target LISTA_DISPOSITIVOS = Target.the("Lista de dispositivos")
            .locatedBy("//div[contains(text(),'{0}')]");
    public static final Target SLT_VERSION = Target.the("Campo versión")
            .located(By.xpath("(//div[@aria-label='Select a Version'])[1] "));
    public static final Target LISTA_VERSION = Target.the("Lista Versión")
            .locatedBy("//span/div[contains(text(),'{0}')]");
    public static final Target SLT_LENGUAJE = Target.the("Campo Lenguaje")
            .locatedBy("//span[@aria-label='Select OS language']");
    public static final Target TXT_LENGUAJE = Target.the("Lista Lenguaje")
            .locatedBy("//input[@placeholder='Select OS language']");
    public static final Target SLT_MOVIL= Target.the("Enter Campo movil")
            .locatedBy("(//span[@class='ui-select-placeholder text-muted'])[1]");
    public static final Target TXT_MOVIL= Target.the("Campo movil")
            .locatedBy("//input[@placeholder='Select Brand']");
    public static final Target SLT_MODELO = Target.the("Enter Campo modelo")
            .located(By.name("handsetModelId"));
    public static final Target TXT_MODELO = Target.the("Campo modelo")
            .located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target SLT_SISTEMA_OPERATIVO = Target.the("Enter Campo sistema operativo ")
            .located(By.xpath("(//span[contains(text(),'Select OS')])[3]"));

    public static final Target TXT_SISTEMA_OPERATIVO= Target.the("Campo sistema operativo")
            .locatedBy("//div[contains(text(),'{0}')]");
    public static final Target BTN_CONTINUAR_ULTIMO_PASO= Target.the("Boton continuar al ultimo paso")
            .locatedBy("//button[@class='btn btn-blue pull-right']");
}
