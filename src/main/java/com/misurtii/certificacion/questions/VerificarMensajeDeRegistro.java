package com.misurtii.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.misurtii.certificacion.ui.UiRegistroDeUsuario.LBL_MENSAJE_DE_REGISTRO;

public class VerificarMensajeDeRegistro implements Question<Boolean> {

    private final String mensaje;

    public VerificarMensajeDeRegistro(String mensaje) {
        this.mensaje = mensaje;
    }

    public  static  VerificarMensajeDeRegistro enPantalla(String mensaje){
        return new VerificarMensajeDeRegistro(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_MENSAJE_DE_REGISTRO, WebElementStateMatchers.isVisible()).forNoMoreThan(8).seconds()
        );
        System.out.println("*********" + Text.of(LBL_MENSAJE_DE_REGISTRO).viewedBy(actor).asString() + "+++" + mensaje);
        return mensaje.equals(Text.of(LBL_MENSAJE_DE_REGISTRO).viewedBy(actor).asString());
    }
}