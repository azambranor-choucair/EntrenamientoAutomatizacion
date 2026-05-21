package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import userinterfaces.WebTablePage;

public class UserAdded implements Question<Boolean> {

    private final String nombre;

    public UserAdded(String nombre) {
        this.nombre = nombre;
    }

    public static UserAdded withName(String nombre) {
        return new UserAdded(nombre);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String tableText = Text.of(WebTablePage.TABLE)
                .answeredBy(actor);

        return tableText.contains(nombre);
    }
}