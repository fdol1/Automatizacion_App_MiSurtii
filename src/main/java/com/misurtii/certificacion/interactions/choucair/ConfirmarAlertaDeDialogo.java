package com.misurtii.certificacion.interactions.choucair;

import com.misurtii.certificacion.interactions.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmarAlertaDeDialogo implements Interaction {

    Target BTN_SI;

    public ConfirmarAlertaDeDialogo() {
    }

    public static ConfirmarAlertaDeDialogo enPantalla(){
        return new ConfirmarAlertaDeDialogo();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                EsperarElemento.duranteTransicion(BTN_SI),
                Tap.on(BTN_SI)
        );
    }
}
