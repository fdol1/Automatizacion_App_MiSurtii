package com.misurtii.certificacion.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiMenuPrincipal {

    public final static Target LBL_MENSAJE = Target.the("Mensaje que se visualiza al iniciar sesion")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/lblBienvenido"))
            .locatedForIOS(By.id(""));

    public final static Target BTN_PEDIDOS = Target.the("Boton para ingresar al menu de pedidos")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btnPedidos"))
            .locatedForIOS(By.id(""));
}
