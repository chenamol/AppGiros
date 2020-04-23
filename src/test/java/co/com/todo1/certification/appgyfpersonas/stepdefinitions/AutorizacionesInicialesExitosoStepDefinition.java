package co.com.todo1.certification.appgyfpersonas.stepdefinitions;
import co.com.todo1.certification.appgyfpersonas.models.DatosCiudadano.*;
import co.com.todo1.certification.appgyfpersonas.models.DatosCiudadano;
import co.com.todo1.certification.appgyfpersonas.questions.ValidarAutorizacionesIniciales;
import co.com.todo1.certification.appgyfpersonas.tasks.AbrirCuenta;
import co.com.todo1.certification.appgyfpersonas.tasks.AcpetarLas;
import co.com.todo1.certification.appgyfpersonas.tasks.PasarLasPantallas;
import co.com.todo1.certification.appgyfpersonas.utils.LaApp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.regex.Matcher;

public class AutorizacionesInicialesExitosoStepDefinition {

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Ciudadano");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(LaApp.enElCelular().getMyDriver()));
    }

    @Given("^El ciudadano se encuentra en la pagina inicial de la App$")
    public void elCiudadanoSeEncuentraEnLaPaginaInicialDeLaApp() {
        OnStage.theActorInTheSpotlight().wasAbleTo(PasarLasPantallas.delOnboarding());
    }


    @When("^El ciudadano indica que desea crear su cuenta de ahorro digital$")
    public void elCiudadanoIndicaQueDeseaCrearSuCuentaDeAhorroDigital() {
            OnStage.theActorInTheSpotlight().attemptsTo(AbrirCuenta.deAhorrosDigital());
    }

    @When("^El ciudadano acepta las autorizaciones iniciales$")
    public void elCiudadanoAceptaLasAutorizacionesIniciales(List<DatosCiudadano> DatosCiudadano) {
        OnStage.theActorInTheSpotlight().attemptsTo(AcpetarLas.autorizacionesIniciales(DatosCiudadano.get(0).getCedula()));
    }

    @Then("^El puede continuar y visualizar el mensaje (.*)$")
    public void elPuedeContinuarYVisualizarElMensajeMomentoDeLasFotos(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarAutorizacionesIniciales.completadas(), Matchers.is(mensaje)));
    }


}