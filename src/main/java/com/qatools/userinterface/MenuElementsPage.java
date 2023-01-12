package com.qatools.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class MenuElementsPage  extends PageObject {

    public static final Target OPCION_WEB_TABLES =
            the("opcion web tables")
                    .locatedBy("//li/span[text()='Web Tables']");

    public static final Target OPCION_DATE_PICKER =
            the("opcion Date Picker")
                    .locatedBy("//li/span[text()='Date Picker']");

    public static final Target OPCION_ALERTS =
            the("opcion Alerts")
                    .locatedBy("//li/span[text()='Alerts']");
}
