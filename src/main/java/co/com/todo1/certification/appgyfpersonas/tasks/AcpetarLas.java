package co.com.todo1.certification.appgyfpersonas.tasks;

import co.com.todo1.certification.appgyfpersonas.userinterface.AutorizacionesInicialesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AcpetarLas implements Task {

    String cedula;

    public AcpetarLas(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AutorizacionesInicialesPage.TXT_CEDULA.resolveFor(actor).waitUntilEnabled();
        actor.attemptsTo(
                Enter.theValue(cedula).into(AutorizacionesInicialesPage.TXT_CEDULA),
                Click.on(AutorizacionesInicialesPage.CHK_TERMINOS),
                Click.on(AutorizacionesInicialesPage.RDB_NO_PEP),
                Click.on(AutorizacionesInicialesPage.BTN_CONTINUAR));
    }

    public static AcpetarLas autorizacionesIniciales(String cedula){
        return Tasks.instrumented(AcpetarLas.class, cedula);
    }
}
