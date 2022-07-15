package com.misurtii.certificacion.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiFinalizarOrdenDePedido {

    public final static Target BTN_FINALIZAR_PEDIDO = Target.the("Finaliza la orden del pedido")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btnFinalizar"))
            .locatedForIOS(By.id(""));

    public final static Target SCL_SELECCIONAR_DIA_DE_ENTREGA = Target.the("Seleccionar el dia de la entrega")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/spnDiaEntrega"))
            .locatedForIOS(By.id(""));

    public static String LBL_DIA_DE_ENTREGA = "//*[@class='android.widget.TextView' and @package='misurtii.grupo.exito' and [@text = '%s']";

    public final static Target BTN_ACEPTAR_DIA_DE_ENTREGA = Target.the("Boton para aceptar el dia seleccionada para la entrega")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btn_dialogo_aceptar"))
            .locatedForIOS(By.id(""));

    public final static Target BTN_ACEPTAR_RESUMEN = Target.the("Boton para aceptar el resumen del pedido")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btnCerrar"))
            .locatedForIOS(By.id(""));

    public final static Target LBL_MENSAJE_PEDIDO = Target.the("Mensaje prensentado al registrarse un pedido")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/lblMsg"))
            .locatedForIOS(By.id(""));
}