package tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.actions.Hit;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import userinterfaces.FormPage;

public class FillForm implements Task {

    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String numero;
    private final String asignatura;
    private final String direccion;

    public FillForm(String nombre, String apellido, String correo,  String numero, String asignatura, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numero = numero;
        this.asignatura = asignatura;
        this.direccion = direccion;
    }

    public static FillForm withData(String nombre, String apellido, String correo, String numero, String asignatura, String direccion) {
        return Tasks.instrumented(FillForm.class, nombre, apellido, correo, numero, asignatura, direccion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(FormPage.FIRST_NAME, isVisible()).forNoMoreThan(10).seconds(),

                Click.on(FormPage.FIRST_NAME),
                SendKeys.of(nombre).into(FormPage.FIRST_NAME),

                Click.on(FormPage.LAST_NAME),
                SendKeys.of(apellido).into(FormPage.LAST_NAME),

                Click.on(FormPage.EMAIL),
                SendKeys.of(correo).into(FormPage.EMAIL),

                Click.on(FormPage.GENDER),

                Click.on(FormPage.MOBILE),
                SendKeys.of(numero).into(FormPage.MOBILE),

                Click.on(FormPage.DATE_INPUT),
                Hit.the(Keys.ENTER).into(FormPage.DATE_INPUT),

                Click.on(FormPage.SUBJECTS),
                SendKeys.of(asignatura).into(FormPage.SUBJECTS),
                Hit.the(Keys.ENTER).into(FormPage.SUBJECTS),

                Scroll.to(FormPage.HOBBY_SPORTS),
                Click.on(FormPage.HOBBY_SPORTS),

                Scroll.to(FormPage.ADDRESS),
                Click.on(FormPage.ADDRESS),
                SendKeys.of(direccion).into(FormPage.ADDRESS),

                Scroll.to(FormPage.STATE),
                Click.on(FormPage.STATE),
                Click.on(FormPage.STATE_OPTION),

                Click.on(FormPage.CITY),
                Click.on(FormPage.CITY_OPTION),

                Scroll.to(FormPage.SUBMIT),
                WaitUntil.the(FormPage.SUBMIT, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(FormPage.SUBMIT)
        );    }

}
