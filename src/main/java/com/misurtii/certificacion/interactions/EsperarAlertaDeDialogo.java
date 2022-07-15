package com.misurtii.certificacion.interactions;

import com.misurtii.certificacion.exceptions.EsperarAlertaDeDialogoException;
import com.misurtii.certificacion.interactions.choucair.TakeScreenshot;
import com.misurtii.certificacion.interactions.choucair.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class EsperarAlertaDeDialogo implements Interaction {

    private final Target elementoAEsperar;

    public EsperarAlertaDeDialogo(Target elementoAEsperar) {
        this.elementoAEsperar = elementoAEsperar;
    }

    public static EsperarAlertaDeDialogo duranteTransicion(Target elementoAEsperar){
        return Tasks.instrumented(EsperarAlertaDeDialogo.class, elementoAEsperar);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            do {
                if(elementoAEsperar.resolveFor(actor).isVisible()){
                    actor.attemptsTo(
                            Tap.on(elementoAEsperar),
                            TakeScreenshot.asEvidence()
                    );
                    break;
                }
            }while (!elementoAEsperar.resolveFor(actor).isVisible());
        }catch (RuntimeException ex){
            throw new EsperarAlertaDeDialogoException(EsperarAlertaDeDialogoException.Error(),ex);
        }
    }
}
