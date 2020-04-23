package co.com.todo1.certification.appgyfpersonas.questions;

import co.com.todo1.certification.appgyfpersonas.userinterface.DummysPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarAutorizacionesIniciales implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DummysPage.MSG_AUTOINICIALES).viewedBy(actor).asString();
    }

    public static ValidarAutorizacionesIniciales completadas(){
        return new ValidarAutorizacionesIniciales();
    }
}
