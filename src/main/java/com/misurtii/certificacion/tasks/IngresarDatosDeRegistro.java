package com.misurtii.certificacion.tasks;

import com.misurtii.certificacion.exceptions.IngresarDatosDeRegistroException;
import com.misurtii.certificacion.interactions.choucair.SwipeByCoordinates;
import com.misurtii.certificacion.interactions.choucair.Tap;
import com.misurtii.certificacion.models.RegistroPersonaModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.misurtii.certificacion.ui.UiRegistroDeUsuario.*;

public class IngresarDatosDeRegistro implements Task {

    private final RegistroPersonaModel registroPersona;

    public IngresarDatosDeRegistro(RegistroPersonaModel registroPersona) {
        this.registroPersona = registroPersona;
    }

    public static IngresarDatosDeRegistro paraUsuarioNuevo(RegistroPersonaModel registroPersona) {
        return Tasks.instrumented(IngresarDatosDeRegistro.class, registroPersona);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    WaitUntil.the(TXT_CODIGO_PLAN_AMIGOS, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                    //Enter.theValue(registroPersona.getCodigoAmigo()).into(TXT_CODIGO_PLAN_AMIGOS),
                    Enter.theValue(registroPersona.getNombre()).into(TXT_NOMBRE),
                    Enter.theValue(registroPersona.getApellido()).into(TXT_APELLIDO),
                    Enter.theValue(registroPersona.getCelular()).into(TXT_CELULAR),
                    Tap.on(CBX_TIPO_CEDULA),
                    Click.on(String.format(LBL_TIPO_CEDULA, registroPersona.getTipodocumento())),
                    Enter.theValue(registroPersona.getNumdocumento()).into(TXT_NUMERO_DOCUMENTO),
                    Enter.theValue(registroPersona.getCorreo()).into(TXT_CORREO),
                    Enter.theValue(registroPersona.getClave()).into(TXT_CLAVE),
                    Enter.theValue(registroPersona.getClave()).into(TXT_CONFIRMAR_CLAVE),
                    SwipeByCoordinates.prueba(357, 397, 0, 0),
                    SwipeByCoordinates.prueba(357, 397, 0, 0),
                    Tap.on(CBX_ZONA),
                    Click.on(String.format(LBL_ZONA, registroPersona.getZona())),
                    Tap.on(CBX_CIUDAD),
                    Click.on(String.format(LBL_CIUDAD, registroPersona.getCiudad())),
                    SwipeByCoordinates.prueba(357, 397, 0, 0),
                    SwipeByCoordinates.prueba(357, 397, 0, 0),
                    Enter.theValue(registroPersona.getDireccion()).into(TXT_DIRECCION),
                    Enter.theValue(registroPersona.getLocalidad()).into(TXT_DETALLE_DIRECCION),
                    Enter.theValue(registroPersona.getLocalidad()).into(TXT_BARRIO),
                    Tap.on(CKBX_HABEAS_DATA),
                    Tap.on(CKBX_MANEJO_DE_DATOS),
                    Tap.on(BTN_REGISTRARSE)
            );
        } catch (RuntimeException ex) {
            throw new IngresarDatosDeRegistroException(IngresarDatosDeRegistroException.Error(), ex);
        }
    }
}