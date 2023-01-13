package com.qatools.userinterface;

import io.vavr.CheckedRunnable;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class AceptarAlerta extends PageObject {

    public static Performable accept() {
        Performable test = new Performable() {
            @Override
            public <T extends Actor> void performAs(T actor) {
                CheckedRunnable checkedRunnable = () -> BrowseTheWeb.as(actor)
                        .getDriver()
                        .switchTo()
                        .alert()
                        .accept();
                try {
                    checkedRunnable.run();
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        };
        return Task.where("click", test);
    }
}
