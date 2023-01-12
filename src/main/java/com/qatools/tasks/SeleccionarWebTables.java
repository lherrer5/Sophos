package com.qatools.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.qatools.userinterface.HomePage.OPCION_ELEMENTOS;
import static com.qatools.userinterface.MenuElementsPage.OPCION_WEB_TABLES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarWebTables implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(OPCION_ELEMENTOS),
                Click.on(OPCION_ELEMENTOS),
                Click.on(OPCION_WEB_TABLES)
        );

    }

    public static Performable SeleccionarMenuElementos() {
        return instrumented(SeleccionarWebTables.class);
    }
}
