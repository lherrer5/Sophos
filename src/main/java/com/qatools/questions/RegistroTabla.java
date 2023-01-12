package com.qatools.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.qatools.userinterface.InformacionTabla.VALOR_NUEVO_REGISTRO;

public class RegistroTabla implements Question<Boolean> {

    String valorTabla;

    public  RegistroTabla(String valorTabla){
        this.valorTabla = valorTabla;

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return  VALOR_NUEVO_REGISTRO.of(valorTabla).resolveFor(actor).getText().equalsIgnoreCase(valorTabla);
    }

    public static RegistroTabla esExitosa(String valorTabla){
        return new RegistroTabla(valorTabla);
    }
}
