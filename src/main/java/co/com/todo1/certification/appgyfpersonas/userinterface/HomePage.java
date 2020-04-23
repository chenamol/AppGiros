package co.com.todo1.certification.appgyfpersonas.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target BTN_CREAR_CUENTA = Target.the("botón crear cuenta de ahorro digital")
            .locatedBy("//android.widget.Button[@text='Quiero abrir mi Cuenta de Ahorro Digital']");
}
