package com.misurtii.certificacion.stepsdefinitions;

import com.misurtii.certificacion.models.InicioSesionModel;
import com.misurtii.certificacion.questions.VerificarMensaje;
import com.misurtii.certificacion.tasks.AbreLaApp;
import com.misurtii.certificacion.tasks.IniciarSesion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinition {

    @Given("^que (.*) abre la app de Misurtii$")
    public void queJuanAbreLaAppDeMisurtii(String juan) {
        theActorCalled(juan).wasAbleTo(AbreLaApp.deMiSurtii());
    }

    @Given("^Iniciar sesion con sus datos$")
    public void iniciarSesionConSusDatos(List<InicioSesionModel> credencialesUsuarioModelList) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.conLasCredencialesDeUsuario(credencialesUsuarioModelList.get(0)));
    }

    @Then("^Verifica el mensaje en el menu principal:(.*)$")
    public void verificaElMensajeEnElMenuPrincipal(String mensaje) {
        theActorInTheSpotlight().should(seeThat(VerificarMensaje.enPantalla(mensaje)));
    }
}