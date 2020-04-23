package co.com.todo1.certification.appgyfpersonas.interactions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class Swipe implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        int puntoXMedio = BrowseTheWeb.as(actor).getDriver().manage().window().getSize().getWidth()/2;
        int puntoYMedio = BrowseTheWeb.as(actor).getDriver().manage().window().getSize().getHeight()/2;

        int cuartoX = puntoXMedio/2;
        new TouchAction((PerformsTouchActions)BrowseTheWeb.as(actor).getDriver())
                .press(PointOption.point(puntoYMedio,puntoXMedio))
                .moveTo(PointOption.point(puntoYMedio, cuartoX))
                .release()
                .perform();
    }

    public static Swipe horizontal(){
        return Tasks.instrumented(Swipe.class);
    }
}
