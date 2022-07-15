package com.misurtii.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.misurtii.certificacion.ui.UiMenuPrincipal.LBL_MENSAJE;

public class VerificarMensaje implements Question<Boolean> {

    private final String mensaje;

    public VerificarMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public  static  VerificarMensaje enPantalla(String mensaje){
        return new VerificarMensaje(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_MENSAJE, WebElementStateMatchers.isEnabled()).forNoMoreThan(8).seconds()
        );
        return mensaje.equals(Text.of(LBL_MENSAJE).viewedBy(actor).asString());
    }
}