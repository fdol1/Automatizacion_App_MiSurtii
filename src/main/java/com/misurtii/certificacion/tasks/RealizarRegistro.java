package com.misurtii.certificacion.tasks;

import com.misurtii.certificacion.interactions.EsperarAlertaDeDialogo;
import com.misurtii.certificacion.interactions.choucair.Tap;
import com.misurtii.certificacion.models.RegistroPersonaModel;
import com.misurtii.certificacion.interactions.choucair.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.misurtii.certificacion.ui.UiAlertaDeDialogo.BTN_ACEPTAR_MENSAJE;
import static com.misurtii.certificacion.ui.UiBienvenida.BTN_CREAR_CUENTA;
import static com.misurtii.certificacion.ui.UiMenuDeInicio.BTN_INICIO_Y_REGISTRO;
import static com.misurtii.certificacion.ui.UiTipoDeCliente.BTN_CONTINUAR_REGISTRO;
import static com.misurtii.certificacion.ui.UiTipoDeCliente.LBL_PERSONA_NATURAL;

public class RealizarRegistro implements Task {

    private RegistroPersonaModel registroPersona;

    public RealizarRegistro(RegistroPersonaModel registroPersona) {
        this.registroPersona = registroPersona;
    }

    public static RealizarRegistro conDatosPrincipales(RegistroPersonaModel registroPersona){
        return Tasks.instrumented(RealizarRegistro.class, registroPersona);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_INICIO_Y_REGISTRO, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                Tap.on(BTN_INICIO_Y_REGISTRO),
                Tap.on(BTN_CREAR_CUENTA),
                Tap.on(LBL_PERSONA_NATURAL),
                Tap.on(BTN_CONTINUAR_REGISTRO),
                EsperarAlertaDeDialogo.duranteTransicion(BTN_ACEPTAR_MENSAJE),
                TakeScreenshot.asEvidence()
        );
    }
}