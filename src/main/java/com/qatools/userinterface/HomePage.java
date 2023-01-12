package com.qatools.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage  extends PageObject {

    public static final Target OPCION_ELEMENTOS =
            the("opcion elementos")
                    .locatedBy("//div[@class='card-body']/h5[text()='Elements']"
                    );

    public static final Target OPCION_WIDGETS =
            the("opcion widgets")
                    .locatedBy("//div[@class='card-body']/h5[text()='Widgets']"
                    );

    public static final Target OPCION_ALERTS_FRAME_WINDOWS =
            the("opcion alerts")
                    .locatedBy("//div[@class='card-body']/h5[text()='Alerts, Frame & Windows']"
                    );

}
