package com.misurtii.certificacion.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UiRegistroDeUsuario {

    public final static Target TXT_CODIGO_PLAN_AMIGOS = Target.the("Campo para ingresar el codigo de amigos")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txtCodigoReferido"))
            .locatedForIOS(By.id(""));

    public final static Target TXT_NOMBRE = Target.the("Campo para ingresar el nombre")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txtNombre"))
            .locatedForIOS(By.id(""));

    public final static Target TXT_APELLIDO = Target.the("Campo para ingresar el apellido")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txtApellido"))
            .locatedForIOS(By.id(""));

    public final static Target TXT_CELULAR = Target.the("Campo para ingresar el celular")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txtCelular"))
            .locatedForIOS(By.id(""));

    public final static Target CBX_TIPO_CEDULA = Target.the("Campo para ingresar el tipo de cedula")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/tvClientData"))
            .locatedForIOS(By.id(""));

    public static String LBL_TIPO_CEDULA = "//*[@class='android.widget.TextView' and @package='misurtii.grupo.exito' and @text = '%s']";

    public final static Target TXT_NUMERO_DOCUMENTO = Target.the("Campo para ingresar numero de documento")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txt_documento"))
            .locatedForIOS(By.id(""));

    public final static Target TXT_CORREO = Target.the("Campo para ingresar el correo")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txt_email"))
            .locatedForIOS(By.id(""));

    public final static Target TXT_CLAVE = Target.the("Campo para ingresar la clave")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txt_contrasenia"))
            .locatedForIOS(By.id(""));

    public final static Target TXT_CONFIRMAR_CLAVE = Target.the("Campo para ingresar la confirmacion de la clave")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txt_confirmar_contrasena"))
            .locatedForIOS(By.id(""));

    public final static Target CBX_ZONA = Target.the("Campo para ingresar la zona o region")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/spn_zona"))
            .locatedForIOS(By.id(""));

    public static String LBL_ZONA = "//*[@class='android.widget.TextView' and @package='misurtii.grupo.exito' and @text = '%s']";

    public final static Target CBX_CIUDAD = Target.the("Campo para ingresar la ciudad")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/spn_ciudad"))
            .locatedForIOS(By.id(""));

    public static String LBL_CIUDAD = "//*[@class='android.widget.TextView' and @package='misurtii.grupo.exito' and @text = '%s']";

    public final static Target TXT_DIRECCION = Target.the("Campo para ingresar la direccion")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txt_direccion"))
            .locatedForIOS(By.id(""));

    public final static Target TXT_DETALLE_DIRECCION = Target.the("Campo para ingresar detalle de direccion")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txt_complemento"))
            .locatedForIOS(By.id(""));

    public final static Target TXT_BARRIO = Target.the("Campo para ingresar el barrio")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txt_barrio"))
            .locatedForIOS(By.id(""));

    public final static Target CKBX_HABEAS_DATA = Target.the("Campo para aceptar terminos y condiciones")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/cb_habeas_data"))
            .locatedForIOS(By.id(""));

    public final static Target CKBX_MANEJO_DE_DATOS = Target.the("Campo para aceptar terminos y condiciones")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/cb_info_comercial"))
            .locatedForIOS(By.id(""));

    public final static Target BTN_REGISTRARSE = Target.the("Boton para aceptar registro")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/btnRegistrarse"))
            .locatedForIOS(By.id(""));

    public final static Target LBL_MENSAJE_DE_REGISTRO = Target.the("Mensaje emergente al realizar un registro")
            .locatedForAndroid(By.id("misurtii.grupo.exito:id/txtMensaje"))
            .locatedForIOS(By.id(""));
}
