package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormPage {

    public static final Target FIRST_NAME = Target.the("campo nombre")
            .locatedBy("//input[@id='firstName']");

    public static final Target LAST_NAME = Target.the("campo apellido")
            .locatedBy("//input[@id='lastName']");

    public static final Target EMAIL = Target.the("campo email")
            .locatedBy("//input[@id='userEmail']");

    public static final Target GENDER = Target.the("selección género masculino")
            .locatedBy("//label[text()='Male']");

    public static final Target MOBILE = Target.the("Número")
            .locatedBy("//input[@id='userNumber']");

    public static final Target SUBMIT = Target.the("botón enviar formulario")
            .locatedBy("//button[@id='submit']");

    public static final Target MODAL = Target.the("modal de confirmación")
            .locatedBy(".modal-content");

    public static final Target MODAL_BODY = Target.the("contenido del modal")
            .locatedBy(".modal-body");

    public static final Target DATE_INPUT = Target.the("campo fecha")
            .locatedBy("//input[@id='dateOfBirthInput']");

    public static final Target SUBJECTS = Target.the("campo subjects")
            .locatedBy("#subjectsInput");

    public static final Target HOBBY_SPORTS = Target.the("hobby sports")
            .locatedBy("//label[text()='Sports']");

    public static final Target ADDRESS = Target.the("campo dirección")
            .locatedBy("#currentAddress");

    public static final Target STATE = Target.the("estado")
            .locatedBy("#state");

    public static final Target CITY = Target.the("ciudad")
            .locatedBy("#city");

    public static final Target STATE_OPTION = Target.the("opción NCR")
            .locatedBy("//div[text()='NCR']");

    public static final Target CITY_OPTION = Target.the("opción Delhi")
            .locatedBy("//div[text()='Delhi']");

}