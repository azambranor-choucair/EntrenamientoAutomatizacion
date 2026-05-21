package tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import userinterfaces.WebTablePage;

public class AddUser implements Task {

    private final String nombre;
    private final String apellido;
    private final String correo;

    public AddUser(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public static AddUser withData(String nombre, String apellido, String correo) {
        return Tasks.instrumented(AddUser.class, nombre, apellido, correo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(


                WaitUntil.the(WebTablePage.ADD_BUTTON, isVisible()).forNoMoreThan(10).seconds(),

                Click.on(WebTablePage.ADD_BUTTON),

                WaitUntil.the(WebTablePage.FIRST_NAME, isVisible()).forNoMoreThan(10).seconds(),

                Enter.theValue(nombre).into(WebTablePage.FIRST_NAME),
                Enter.theValue(apellido).into(WebTablePage.LAST_NAME),
                Enter.theValue(correo).into(WebTablePage.EMAIL),

                Click.on(WebTablePage.SUBMIT)
        );
    }
}