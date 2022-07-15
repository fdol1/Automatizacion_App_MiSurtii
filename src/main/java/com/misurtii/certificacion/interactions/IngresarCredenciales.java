package com.misurtii.certificacion.interactions;

import com.misurtii.certificacion.exceptions.IngresarCredencialesException;
import com.misurtii.certificacion.interactions.choucair.TakeScreenshot;
import com.misurtii.certificacion.interactions.choucair.Tap;
import com.misurtii.certificacion.models.InicioSesionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.misurtii.certificacion.ui.UiBienvenida.BTN_REGISTRADO;
import static com.misurtii.certificacion.ui.UiInicioDeSesion.*;
import static com.misurtii.certificacion.ui.UiMenuDeInicio.BTN_INICIO_Y_REGISTRO;

public class IngresarCredenciales implements Interaction {

    private final InicioSesionModel inicioSesionModel;

    public IngresarCredenciales(InicioSesionModel inicioSesionModel) {
        this.inicioSesionModel = inicioSesionModel;
    }

    public static IngresarCredenciales paraInicioDeSesion(InicioSesionModel inicioSesionModel){
        return Tasks.instrumented(IngresarCredenciales.class, inicioSesionModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(

                    WaitUntil.the(BTN_INICIO_Y_REGISTRO, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                    Tap.on(BTN_INICIO_Y_REGISTRO),
                    WaitUntil.the(BTN_REGISTRADO, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                    Tap.on(BTN_REGISTRADO),
                    WaitUntil.the(TXT_USUARIO, WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds(),
                    Enter.theValue(inicioSesionModel.getUsuario()).into(TXT_USUARIO),
                    Enter.theValue(inicioSesionModel.getClave()).into(TXT_CLAVE),
                    Tap.on(BTN_INICIAR),
                    EsperarAlertaDeDialogo.duranteTransicion(TXT_MENSAJE),
                    TakeScreenshot.asEvidence()
            );
        }catch (RuntimeException ex){
            throw new IngresarCredencialesException(IngresarCredencialesException.Error(), ex);
        }

    }
}