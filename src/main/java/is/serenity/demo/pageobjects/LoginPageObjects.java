package is.serenity.demo.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.serenity.is/")
public class LoginPageObjects extends PageObject {

    By txtUsername = By.xpath("//input[@name='Username']");

    By txtPassword = By.xpath("//input[@name='Password']");

    By btnLogin = By.xpath("//button[@id='LoginPanel0_LoginButton']");

    By imgUser = By.xpath("//i[@class='s-sidebar-band-icon fa fa-user']");

    public By getTxtUsername() {
        return txtUsername;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getImgUser() {
        return imgUser;
    }
}
