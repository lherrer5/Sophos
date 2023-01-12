package com.qatools.stepdefinitions;


import com.qatools.interactions.Abrir;
import com.qatools.tasks.SeleccionarDatePicker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class stepSelectDate {

    @Given("que el usuario sigue en la pagina de QA tool (.*)$")
    public void queElUsuarioSigueEnLaPaginaDeQAToolHttpsDemoqaCom(String url) {
        theActorCalled("juanito").wasAbleTo(
                Abrir.elNavegador()
        );
    }

    @When("entra a Date picker y Select Date y Date And Time")
    public void entraADatePickerYSelectDateYDateAndTime() {
        withCurrentActor(SeleccionarDatePicker.SeleccionarMenuWidgets());
    }

    @Then("el usuario ve su fecha y tiempo escogido")
    public void elUsuarioVeSuFechaYTiempoEscogido() {
    }
}
