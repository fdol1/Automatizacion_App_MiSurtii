package com.misurtii.certificacion.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiInicioDeSesion {

    public final static Target TXT_USUARIO = Target.the("Campo para ingresar el usuario")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txtUsuario"))
            .locatedForIOS(By.id(""));
    public final static Target TXT_CLAVE = Target.the("Campo para ingresar la clave")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txtPassword"))
            .locatedForIOS(By.id(""));
    public final static Target BTN_INICIAR = Target.the("Boton para iniciar sesion")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btnLogin"))
            .locatedForIOS(By.id(""));

    public final static Target TXT_MENSAJE = Target.the("Mensaje que se prensenta al dar tap en iniciar")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txtMensaje"))
            .locatedForIOS(By.id(""));
}