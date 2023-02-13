package is.serenity.demo.steps;

import is.serenity.demo.pageobjects.CustomersPageObjects;
import is.serenity.demo.pageobjects.HomePageObjects;
import is.serenity.demo.pageobjects.NewCustomerPageObjects;
import is.serenity.demo.utils.ReplaceLocator;
import is.serenity.demo.utils.Validations;
import is.serenity.demo.utils.Waits;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CustomerCreationSteps extends PageObject {

    NewCustomerPageObjects newCustomerObjects;
    CustomersPageObjects customerObjects;
    HomePageObjects homeObjects;
    Validations validation;
    ReplaceLocator replaceLocator;
    Waits wait = new Waits();


    @Step
    public void clickNorthwind() {
        homeObjects.getDriver().findElement(homeObjects.getBtnNorthwind()).click();

    }

    @Step
    public void clickCustomers() {
        homeObjects.getDriver().findElement(homeObjects.getBtnCustomers()).click();


    }

    @Step
    public void clickNewCustomer() {
        homeObjects.getDriver().findElement(customerObjects.getBtnNewCustomer()).click();


    }

    @Step
    public void clickSave() {
        newCustomerObjects.getDriver().findElement(newCustomerObjects.getBtnSave()).click();

    }

    @Step
    public void validateCreationError() {
        validation.validateObjectPresence(newCustomerObjects.getBanError());

    }


    @Step
    public void inputCustomerId(String customerId) {
        newCustomerObjects.getDriver().findElement(newCustomerObjects.getTxtCustomerId()).sendKeys(customerId);


    }

    @Step
    public void inputCompanyName(String companyName) {
        newCustomerObjects.getDriver().findElement(newCustomerObjects.getTxtCompanyName()).sendKeys(companyName);

    }

    @Step
    public void validateCreationSuccess(String customerId) {
        newCustomerObjects.getDriver().findElement(customerObjects.getTxtFilter()).sendKeys(customerId);
        By item = replaceLocator.replace(customerObjects.getIdValue(), "Replace", customerId);
        validation.validateObjectPresence(item);


    }


}
