package com.qatools.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class WebTablesPage  extends PageObject {

    public static final Target BOTON_ADICIONAR_REGISTRO =
            the("adicionar registro")
                    .locatedBy("//*[@id='addNewRecordButton']");
}
