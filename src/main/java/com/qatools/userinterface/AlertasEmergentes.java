package com.qatools.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


import static net.serenitybdd.screenplay.targets.Target.the;

public class AlertasEmergentes extends PageObject {
    public static final Target CLICK_ME =
            the("seleccionar click me 1")
                    .locatedBy("//*[@id='alertButton']");

}
