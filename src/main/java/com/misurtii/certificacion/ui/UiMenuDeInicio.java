package com.misurtii.certificacion.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiMenuDeInicio {

    public final static Target BTN_INICIO_Y_REGISTRO = Target.the("Boton para ingresar al menu de inicio de sesion y registro")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btnDrawer"))
            .locatedForIOS(By.id(""));
}