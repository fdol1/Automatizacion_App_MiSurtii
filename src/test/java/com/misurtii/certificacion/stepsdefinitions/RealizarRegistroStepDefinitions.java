package com.misurtii.certificacion.stepsdefinitions;

import com.misurtii.certificacion.models.RegistroPersonaModel;
import com.misurtii.certificacion.questions.VerificarMensajeDeRegistro;
import com.misurtii.certificacion.tasks.IngresarDatosDeRegistro;
import com.misurtii.certificacion.tasks.RealizarRegistro;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RealizarRegistroStepDefinitions {
    @Given("^que juan ingresa sus credeciales personales$")
    public void queJuanIngresaSusCredecialesPersonales(List<RegistroPersonaModel> Datos) {
        theActorInTheSpotlight().attemptsTo(RealizarRegistro.conDatosPrincipales(Datos.get(0)));
    }
    @When("^se ingresan los datos para el registro$")
    public void seIngresanLosDatosParaElRegistro(List<RegistroPersonaModel> Datos) {
        theActorInTheSpotlight().attemptsTo(IngresarDatosDeRegistro.paraUsuarioNuevo(Datos.get(0)));
    }
    @Then("^Valida el mensaje en pantalla:(.*)$")
    public void validaQueLosDatosIngresadosFueronRegistradosSatisfactoriamente(String mensaje) {
        theActorInTheSpotlight().should(seeThat(VerificarMensajeDeRegistro.enPantalla(mensaje)));
    }
}
