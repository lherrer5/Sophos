package com.qatools.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class DatePicker extends PageObject {
    public static final Target CUADRO_FECHA =
            the("seleccionar cuadro")
                    .locatedBy("//*[@id='datePickerMonthYearInput']");
    public static final Target FECHA_ESCOGIDA =
            the("escoger fecha")
                    .locatedBy("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[6]");
    public static final Target DATE_TIME =
            the("click cuadro")
                    .locatedBy("//*[@id='dateAndTimePickerInput']");

    public static final Target HORA_FECHA =
            the("escoger hora")
                    .locatedBy("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[58]");


}
