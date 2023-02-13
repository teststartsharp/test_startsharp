package is.serenity.demo.stepdefinitions;

import cucumber.api.java.es.*;
import is.serenity.demo.models.LoginUserModel;
import is.serenity.demo.steps.LoginSteps;

import java.util.List;

public class LoginStepDefinitions {


    LoginSteps loginSteps;

    @Dado("^Que voy a la pagina de inicio de sesion de startsharp$")
    public void queVoyALaPaginaDeInicioDeSesionDeStartsharp() {
       loginSteps.openApp();

    }

    @Cuando("^Ingreso mi usuario$")
    public void ingresoMiUsuario(List<LoginUserModel> loginList) {
        loginSteps.inputUsername(loginList.get(0).getUser());

    }

    @Cuando("^Ingreso mi clave$")
    public void ingresoMiClave(List<LoginUserModel> loginList) {
        loginSteps.inputPassword(loginList.get(0).getPassword());
    }

    @Cuando("^Selecciono el boton de iniciar sesion$")
    public void seleccionoElBotonDeIniciarSesion() {
        loginSteps.login();

    }

    @Entonces("^Valido el inicio de sesion correcto$")
    public void validoElInicioDeSesionCorrecto() {
        loginSteps.validateLogin();

    }




}
