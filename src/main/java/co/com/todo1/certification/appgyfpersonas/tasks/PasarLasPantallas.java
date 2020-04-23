package co.com.todo1.certification.appgyfpersonas.tasks;

import co.com.todo1.certification.appgyfpersonas.interactions.Swipe;
import co.com.todo1.certification.appgyfpersonas.userinterface.OnboardingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class PasarLasPantallas implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //OnboardingPage.BTN_RELOAD.resolveFor(actor).waitUntilVisible();
            //actor.attemptsTo(Click.on(OnboardingPage.BTN_RELOAD));
       OnboardingPage.BTN_SALTAR.resolveFor(actor).waitUntilVisible();
       actor.attemptsTo(Click.on(OnboardingPage.BTN_SALTAR));

    }

    public static PasarLasPantallas delOnboarding() {
        return Tasks.instrumented(PasarLasPantallas.class);
    }

}
