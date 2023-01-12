package com.qatools.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class FormularioWebTablePage extends PageObject {
    ///firstName

    public static final Target INPUT_FIRST_NAME =
            the("ingresasr nombre")
                    .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME =
            the("ingresasr apellido")
                    .located(By.id("lastName"));

    public static final Target INPUT_EMAIL =
            the("ingresasr email")
                    .located(By.id("userEmail"));

    public static final Target INPUT_AGE =
            the("ingresasr edad")
                    .located(By.id("age"));

    public static final Target INPUT_SALARY =
            the("ingresasr salario")
                    .located(By.id("salary"));

    public static final Target INPUT_DEPARTAMENT =
            the("ingresasr departamento")
                    .located(By.id("department"));

    public static final Target BOTON_REGISTRAR =
            the("registrar")
                    .located(By.id("submit"));




}
