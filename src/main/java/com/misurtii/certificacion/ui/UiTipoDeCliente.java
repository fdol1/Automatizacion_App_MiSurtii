package com.misurtii.certificacion.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiTipoDeCliente {

    public final static Target LBL_PERSONA_NATURAL = Target.the("Campo para ingresar el tipo de usuario")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/radio_natural"))
            .locatedForIOS(By.id(""));

    public final static Target BTN_CONTINUAR_REGISTRO = Target.the("Boton para continuar el registro")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btn_continuar"))
            .locatedForIOS(By.id(""));
}

