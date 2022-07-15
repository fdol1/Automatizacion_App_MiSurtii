package com.misurtii.certificacion.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiPedidos {

    public final static Target BTN_CREAR_CUENTA = Target.the("Boton para ingresar al menu de registro")
            .locatedForAndroid(By.id(""))
            .locatedForIOS(By.id(""));

    public static String LBL_NOMBRE_PRODUCTO = "//*[@class='android.widget.TextView' and @package='misurtii.grupo.exito' and @text = '%s']";

    public final static Target BTN_MAS = Target.the("Boton para aumentar la cantidad del producto")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btnMas"))
            .locatedForIOS(By.id(""));

    public final static Target BTN_ACEPTAR_CANTIDAD = Target.the("Boton para aceptar la cantidad seleccionada")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btn_aceptar"))
            .locatedForIOS(By.id(""));

    public final static Target IMG_IR_AL_CARRITO = Target.the("Imagen para ir al carrito de compra")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btnCart"))
            .locatedForIOS(By.id(""));
}
    //*[@class='android.widget.TextView' and @package='misurtii.grupo.exito' and @text = 'Aceite vegetal La Sevillana x 1000 ml']
