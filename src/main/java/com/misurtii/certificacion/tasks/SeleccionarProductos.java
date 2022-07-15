package com.misurtii.certificacion.tasks;

import com.misurtii.certificacion.exceptions.SeleccionarProductosException;
import com.misurtii.certificacion.interactions.AumentarCantidad;
import com.misurtii.certificacion.interactions.EsperarAlertaDeDialogo;
import com.misurtii.certificacion.interactions.EsperarElemento;
import com.misurtii.certificacion.interactions.choucair.Tap;
import com.misurtii.certificacion.models.PedidoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.misurtii.certificacion.ui.UiAlertaDeDialogo.BTN_ACEPTAR_MENSAJE;
import static com.misurtii.certificacion.ui.UiFinalizarOrdenDePedido.*;
import static com.misurtii.certificacion.ui.UiInicioDeSesion.TXT_MENSAJE;
import static com.misurtii.certificacion.ui.UiPedidos.*;

public class SeleccionarProductos implements Task {

    private final PedidoModel pedidoModel;

    public SeleccionarProductos(PedidoModel pedidoModel) {
        this.pedidoModel = pedidoModel;
    }

    public static SeleccionarProductos paraFinalizarLaCompra(PedidoModel pedidoModel) {
        return Tasks.instrumented(SeleccionarProductos.class, pedidoModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    EsperarElemento.duranteTransicion(TXT_MENSAJE),
                    WaitUntil.the(IMG_IR_AL_CARRITO, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                    Click.on(String.format(LBL_NOMBRE_PRODUCTO,pedidoModel.getNombreProducto())),
                    AumentarCantidad.delProductoSeleccionado(pedidoModel.getCantidad()),
                    Tap.on(BTN_ACEPTAR_CANTIDAD),
                    Tap.on(IMG_IR_AL_CARRITO),
                    EsperarAlertaDeDialogo.duranteTransicion(BTN_ACEPTAR_MENSAJE),
                    Tap.on(BTN_FINALIZAR_PEDIDO),
                    Tap.on(SCL_SELECCIONAR_DIA_DE_ENTREGA),
                    Click.on(String.format(LBL_DIA_DE_ENTREGA,pedidoModel.getDiaEntrega())),
                    Tap.on(BTN_ACEPTAR_RESUMEN)
            );
        }catch (RuntimeException ex){
            throw new SeleccionarProductosException(SeleccionarProductosException.Error(),ex);
        }
    }
}