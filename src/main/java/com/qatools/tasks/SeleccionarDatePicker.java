package com.qatools.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.qatools.userinterface.HomePage.OPCION_WIDGETS;
import static com.qatools.userinterface.MenuElementsPage.OPCION_DATE_PICKER;
import static com.qatools.userinterface.DatePicker.CUADRO_FECHA;
import static com.qatools.userinterface.DatePicker.FECHA_ESCOGIDA;
import static com.qatools.userinterface.DatePicker.DATE_TIME;
import static com.qatools.userinterface.DatePicker.HORA_FECHA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarDatePicker implements Task {
@Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(OPCION_WIDGETS),
                Click.on(OPCION_WIDGETS),
                Scroll.to(OPCION_DATE_PICKER),
                Click.on(OPCION_DATE_PICKER),
               Click.on(CUADRO_FECHA),
               Click.on(FECHA_ESCOGIDA),
              Click.on(DATE_TIME),
             Click.on(HORA_FECHA)
        );
    }
    public static Performable SeleccionarMenuWidgets() {
        return instrumented(SeleccionarDatePicker.class);
    }

}

