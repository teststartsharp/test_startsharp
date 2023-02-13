package is.serenity.demo.stepdefinitions;

import cucumber.api.java.es.*;
import is.serenity.demo.models.CustomerCreationUserModel;
import is.serenity.demo.steps.CustomerCreationSteps;

import java.util.List;

public class CustomerCreationStepDefinitions {

CustomerCreationSteps customerCreationSteps;




    @Cuando("^Despliego el modulo northwind$")
    public void despliegoElModuloNorthwind() {
       customerCreationSteps.clickNorthwind();
    }

    @Cuando("^Selecciono customers$")
    public void seleccionoCustomers() {
        customerCreationSteps.clickCustomers();

    }

    @Cuando("^Selecciono newCustomer$")
    public void seleccionoNewcustomer() {
        customerCreationSteps.clickNewCustomer();

    }

    @Cuando("^Selecciono save$")
    public void seleccionoSave() {
        customerCreationSteps.clickSave();

    }

    @Entonces("^Valido alerta de error al crear un nuevo cliente$")
    public void validoAlertaDeErrorAlCrearUnNuevoCliente(){
        customerCreationSteps.validateCreationError();

    }


    @Cuando("^Ingreso customer id$")
    public void ingresoCustomerId(List<CustomerCreationUserModel>customerCreationList) {
        customerCreationSteps.inputCustomerId(customerCreationList.get(0).getCustomerId());



    }

    @Cuando("^Ingreso company name$")
    public void ingresoCompanyName(List<CustomerCreationUserModel>customerCreationList) {
        customerCreationSteps.inputCompanyName(customerCreationList.get(0).getCompanyName());

    }

    @Entonces("^Valido correcta creacion del cliente$")
    public void validoCorrectaCreacionDelCliente(List<CustomerCreationUserModel>customerCreationList) {
        customerCreationSteps.validateCreationSuccess(customerCreationList.get(0).getCustomerId());


    }
}
