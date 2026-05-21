package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import userinterfaces.FormPage;

public class ConfirmationModal implements Question<Boolean> {

    private final String nombre;

    public ConfirmationModal(String nombre) {
        this.nombre = nombre;
    }

    public static ConfirmationModal containsUser(String nombre) {
        return new ConfirmationModal(nombre);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String modalText = Text.of(FormPage.MODAL_BODY)
                .answeredBy(actor);

        return modalText.contains(nombre);
    }
}