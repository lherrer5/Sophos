package com.qatools.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class InformacionTabla extends PageObject {



    public static final Target VALOR_NUEVO_REGISTRO =
            the("Boton para adicionar el producto seleccionado al carrito")
                    .locatedBy("//div[@class='rt-tbody']/div[@role='rowgroup']/div/div[text()='{0}']");
}
