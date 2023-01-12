package com.qatools.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.qatools.userinterface.FormularioWebTablePage.*;
import static com.qatools.userinterface.WebTablesPage.BOTON_ADICIONAR_REGISTRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class CrearNuevoRegistro  implements Task {

    private  String firstName;
    private  String lastName;
    private  String email;
    private  String age;
    private  String salary;
    private  String departament;

    public CrearNuevoRegistro(String firstName,String lastName,String email,String age,String salary,String departament){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.departament = departament;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_ADICIONAR_REGISTRO,isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_ADICIONAR_REGISTRO),
                Enter.theValue(firstName).into(INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(INPUT_LAST_NAME),
                Enter.theValue(email).into(INPUT_EMAIL),
                Enter.theValue(age).into(INPUT_AGE),
                Enter.theValue(salary).into(INPUT_SALARY),
                Enter.theValue(departament).into(INPUT_DEPARTAMENT),
                Click.on(BOTON_REGISTRAR)
        );
    }

    public static Performable nuevoRegistro(String firstName,String lastName,String email,String age,String salary,String departament){
        return instrumented(CrearNuevoRegistro.class,firstName,lastName,email,age,salary,departament);
    }
}
