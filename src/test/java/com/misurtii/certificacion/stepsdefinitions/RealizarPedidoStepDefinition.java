package com.misurtii.certificacion.stepsdefinitions;

import com.misurtii.certificacion.models.PedidoModel;
import com.misurtii.certificacion.questions.VerificarMensajeDePedido;
import com.misurtii.certificacion.tasks.IngresarAlMenuDePedidos;
import com.misurtii.certificacion.tasks.SeleccionarProductos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RealizarPedidoStepDefinition {

    @Given("^que juan quiere realizar un pedido$")
    public void queJuanQuiereRealizarUnPedido() {
        theActorInTheSpotlight().attemptsTo(IngresarAlMenuDePedidos.paraRealizarUno());
    }

    @When("^selecciona los productos deseados$")
    public void seleccionaLosProductosDeseados(List<PedidoModel> pedidoModels) {
        theActorInTheSpotlight().attemptsTo(SeleccionarProductos.paraFinalizarLaCompra(pedidoModels.get(0)));
    }

    @Then("^podra verificar el mensaje:(.*)$")
    public void podraVerificarElMensajeMensaje(String mensaje) {
        theActorInTheSpotlight().should(seeThat(VerificarMensajeDePedido.exitoso(mensaje)));
    }
}