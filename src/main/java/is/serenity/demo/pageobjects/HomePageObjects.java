package is.serenity.demo.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class HomePageObjects extends PageObject {

    By btnNorthwind = By.xpath("(//span[@class='s-sidebar-link-text'])[2]");

    By btnCustomers = By.xpath("(//span[@class='s-sidebar-link-text'])[3]");

    public By getBtnNorthwind() {
        return btnNorthwind;
    }

    public By getBtnCustomers() {
        return btnCustomers;
    }
}
