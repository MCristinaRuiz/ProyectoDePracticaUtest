package co.com.choucair.ejemplo.questions;

import co.com.choucair.ejemplo.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.ejemplo.userinterfaces.UtestPage.LBL_MESAGGE;

@Subject("Get the welcome message to utest")
public class Message implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String message = Text.of(LBL_MESAGGE).answeredBy(actor).toString();

        return Constant.MESSAGE.getConstant().equals(message);
    }
public static Message welcomeMessage(){
        return new Message();
}

}
