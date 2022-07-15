package com.misurtii.certificacion.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiAlertaDeDialogo {

    public final static Target BTN_ACEPTAR_MENSAJE = Target.the("Boton para aceptar la alerta de dialogo")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btnAceptarMensaje"))
            .locatedForIOS(By.id(""));

}
