package com.qatools.stepdefinitions;



import com.qatools.interactions.Abrir;
import com.qatools.questions.RegistroTabla;
import com.qatools.tasks.CrearNuevoRegistro;
import com.qatools.tasks.SeleccionarWebTables;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class interactuarElementos {

    public String firstname = "jaimito";
    public String lastName = "perez";
    public String email = "jaimito@gmail.com";
    public String age = "23";
    public String salary = "1000";
    public String departament = "TI";



    @Dado("^que el usuario esta en la pagina de QA tool (.*)$")
    public void queElUsuarioEstaEnLaPaginaDeQATool(String url) {
        theActorCalled("juanito").wasAbleTo(
                Abrir.elNavegador()
        );

    }

    @Cuando("^agrega un registro en el elemento webTable$")
    public void agregaUnRegistrooEnElElementoWebTable() {
        withCurrentActor(SeleccionarWebTables.SeleccionarMenuElementos());
        withCurrentActor(CrearNuevoRegistro.nuevoRegistro(firstname,lastName,email,age,salary,departament));
    }

    @Entonces("^el usuario puede ver el registro creado en la tabla$")
    public void elUsuarioPuedeVerElRegistroCreadoEnLaTabla() {
        theActorInTheSpotlight()
                .should(seeThat(RegistroTabla.esExitosa(firstname)));
    }

}
