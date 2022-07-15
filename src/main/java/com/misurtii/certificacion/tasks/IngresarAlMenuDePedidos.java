package com.misurtii.certificacion.tasks;

import com.misurtii.certificacion.exceptions.IngresarDatosDeRegistroException;
import com.misurtii.certificacion.interactions.choucair.TakeScreenshot;
import com.misurtii.certificacion.interactions.choucair.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.misurtii.certificacion.ui.UiMenuPrincipal.BTN_PEDIDOS;

public class IngresarAlMenuDePedidos implements Task {

    public IngresarAlMenuDePedidos() {
    }

    public static IngresarAlMenuDePedidos paraRealizarUno(){
        return Tasks.instrumented(IngresarAlMenuDePedidos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    WaitUntil.the(BTN_PEDIDOS, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                    Tap.on(BTN_PEDIDOS),
                    TakeScreenshot.asEvidence()
            );
        }catch (RuntimeException ex){
            throw new IngresarDatosDeRegistroException(IngresarDatosDeRegistroException.Error(), ex);
        }
    }
}
