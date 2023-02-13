package is.serenity.demo.steps;

import is.serenity.demo.pageobjects.LoginPageObjects;
import is.serenity.demo.utils.Validations;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LoginSteps extends PageObject {

    LoginPageObjects loginObjects;
    Validations validation;


    @Step
    public void openApp(){
        loginObjects.open();

    }

    @Step
    public void inputUsername(String user){
        loginObjects.getDriver().findElement(loginObjects.getTxtUsername()).clear();
        loginObjects.getDriver().findElement(loginObjects.getTxtUsername()).sendKeys(user);
    }

    @Step
    public void inputPassword(String password){
        loginObjects.getDriver().findElement(loginObjects.getTxtPassword()).clear();
        loginObjects.getDriver().findElement(loginObjects.getTxtPassword()).sendKeys(password);
    }

    @Step
    public void login(){
        loginObjects.getDriver().findElement(loginObjects.getBtnLogin()).click();
    }

    @Step
    public void validateLogin(){
        validation.validateObjectPresence(loginObjects.getImgUser());
    }









}
