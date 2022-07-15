package com.misurtii.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.misurtii.certificacion.ui.UiFinalizarOrdenDePedido.LBL_MENSAJE_PEDIDO;
import static com.misurtii.certificacion.ui.UiMenuPrincipal.LBL_MENSAJE;

public class VerificarMensajeDePedido implements Question<Boolean> {

    private final String mensaje;

    public VerificarMensajeDePedido(String mensaje) {
        this.mensaje = mensaje;
    }

    public  static VerificarMensajeDePedido exitoso(String mensaje){
        return new VerificarMensajeDePedido(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_MENSAJE_PEDIDO, WebElementStateMatchers.isEnabled()).forNoMoreThan(8).seconds()
        );
        return mensaje.equals(Text.of(LBL_MENSAJE_PEDIDO).viewedBy(actor).asString());
    }
}