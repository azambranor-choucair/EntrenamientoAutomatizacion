package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import net.serenitybdd.screenplay.actors.*;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import tasks.FillForm;
import questions.ConfirmationModal;

public class FormStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario abre el formulario de registro")
    public void abrirFormulario() {
        OnStage.theActorCalled("Usuario").wasAbleTo(
                Open.url("https://demoqa.com/automation-practice-form")
        );
    }

    @When("diligencia el formulario con {string} {string} {string} {string} {string} {string}")
    public void diligenciarFormulario(String nombre, String apellido, String correo, String numero, String asignatura, String direccion) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                FillForm.withData(nombre, apellido, correo, numero, asignatura, direccion)
        );
    }

    @Then("debería ver el modal de confirmación con {string}")
    public void validarResultado(String nombre) {

        OnStage.theActorInTheSpotlight().should(
                seeThat(ConfirmationModal.containsUser(nombre))
        );
    }
}