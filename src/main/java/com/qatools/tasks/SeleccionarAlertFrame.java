package com.qatools.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.qatools.userinterface.AlertasEmergentes.CLICK_ME;
import static com.qatools.userinterface.HomePage.OPCION_ALERTS_FRAME_WINDOWS;
import static com.qatools.userinterface.MenuElementsPage.OPCION_ALERTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeleccionarAlertFrame implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(OPCION_ALERTS_FRAME_WINDOWS),
                Click.on(OPCION_ALERTS_FRAME_WINDOWS),
                Click.on(OPCION_ALERTS),
                Click.on(CLICK_ME)
        );

        }

    public static Performable SeleccionarMenuAlerts() {
        return instrumented(SeleccionarAlertFrame.class);
    }
}

