package com.misurtii.certificacion.tasks;

import com.misurtii.certificacion.interactions.IngresarCredenciales;
import com.misurtii.certificacion.interactions.choucair.TakeScreenshot;
import com.misurtii.certificacion.exceptions.IniciarSesionException;
import com.misurtii.certificacion.models.InicioSesionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class IniciarSesion implements Task {

    private final InicioSesionModel inicioSesionModelData;

    public IniciarSesion(InicioSesionModel inicioSesionModelData){
        this.inicioSesionModelData = inicioSesionModelData;
    }

    public static IniciarSesion conLasCredencialesDeUsuario(InicioSesionModel inicioSesionModelData){
        return Tasks.instrumented(IniciarSesion.class, inicioSesionModelData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    IngresarCredenciales.paraInicioDeSesion(inicioSesionModelData),
                    TakeScreenshot.asEvidence()
            );
        }catch (RuntimeException eX){
            throw new IniciarSesionException(IniciarSesionException.Error(),eX);
        }
    }
}