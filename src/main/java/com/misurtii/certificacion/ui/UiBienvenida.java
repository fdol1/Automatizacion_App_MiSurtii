package com.misurtii.certificacion.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiBienvenida {
    public final static Target BTN_REGISTRADO = Target.the("Boton para ingredar al menu de inicio de sesion")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btnRegistrado"))
            .locatedForIOS(By.id(""));

    public final static Target BTN_CREAR_CUENTA = Target.the("Boton para ingresar al menu de registro")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btnCrearCuenta"))
            .locatedForIOS(By.id(""));

}