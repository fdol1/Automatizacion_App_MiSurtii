package com.misurtii.certificacion.interactions;

import com.misurtii.certificacion.exceptions.AumentarCantidadException;
import com.misurtii.certificacion.interactions.choucair.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static com.misurtii.certificacion.ui.UiPedidos.BTN_MAS;

public class AumentarCantidad implements Interaction {

    private final String cantidad;

    public AumentarCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public static AumentarCantidad delProductoSeleccionado(String cantidad){
        return Tasks.instrumented(AumentarCantidad.class, cantidad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            int contador = 1;
            while (Integer.parseInt(cantidad)<=contador){
                actor.attemptsTo(
                        Tap.on(BTN_MAS)
                );
                contador++;
            }
        }catch (RuntimeException ex){
            throw new AumentarCantidadException(AumentarCantidadException.Error(),ex);
        }
    }
}
