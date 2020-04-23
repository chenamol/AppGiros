package co.com.todo1.certification.appgyfpersonas.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AutorizacionesInicialesPage {

    public static Target  CHK_TERMINOS = Target.the("checkbox de terminos y condiciones")
            .locatedBy("//android.widget.CheckBox[@resource-id='b3-AcceptTermsCheckbox']");

       public static Target  RDB_NO_PEP = Target.the("Radio Button para persona no expuesta públicamente")
            .locatedBy("//android.widget.CheckBox[@resource-id='b3-NotPublicPersonCheckBox']");

    public static Target  RDB_SI_PEP = Target.the("Radio Button para persona expuesta públicamente")
            .locatedBy("//android.widget.CheckBox[@resource-id='b3-PublicPersonCheckBox']");

    public static Target  BTN_CONTINUAR = Target.the("Botón para seguir a la siguiente pantalla")
            .locatedBy("//android.widget.Button[@text='Continuar']");

    public static Target TXT_CEDULA = Target.the("Input para ingresar la cédula del ciudadano")
            .locatedBy("//android.widget.EditText[@resource-id='b3-b1-Input_input']");
}
