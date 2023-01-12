package com.qatools.stepdefinitions;

import com.qatools.interactions.Abrir;
import com.qatools.tasks.SeleccionarAlertFrame;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class stepAlert {

    @Given("que el usuario continua en la pagina de QA tool (.*)$")
    public void queElUsuarioContinuaEnLaPaginaDeQAToolHttpsDemoqaCom(String url) {
        theActorCalled("juanito").wasAbleTo(
                Abrir.elNavegador()
        );
    }
    @When("entra a opcion Alerts presiona click me y aceptar")
    public void entraAOpcionAlertsPresionaClickMeYAceptar() {
        withCurrentActor(SeleccionarAlertFrame.SeleccionarMenuAlerts());
    }

    @Then("el usuario sale de la ventana")
    public void elUsuarioSaleDeLaVentana() {
    }
}
