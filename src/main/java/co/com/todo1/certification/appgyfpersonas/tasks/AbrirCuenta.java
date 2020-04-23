package co.com.todo1.certification.appgyfpersonas.tasks;

import co.com.todo1.certification.appgyfpersonas.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirCuenta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Click.on(HomePage.BTN_CREAR_CUENTA));
    }

    public static AbrirCuenta deAhorrosDigital (){
        return Tasks.instrumented(AbrirCuenta.class);
    }
}
