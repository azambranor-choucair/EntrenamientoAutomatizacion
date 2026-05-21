package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class WebTablePage {

    public static final Target ADD_BUTTON = Target.the("botón add")
            .locatedBy("#addNewRecordButton");

    public static final Target FIRST_NAME = Target.the("campo nombre")
            .locatedBy("#firstName");

    public static final Target LAST_NAME = Target.the("campo apellido")
            .locatedBy("#lastName");

    public static final Target EMAIL = Target.the("campo email")
            .locatedBy("#userEmail");

    public static final Target SUBMIT = Target.the("botón guardar")
            .locatedBy("#submit");

    public static final Target TABLE = Target.the("tabla de usuarios")
            .locatedBy(".rt-table");
}