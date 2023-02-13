package is.serenity.demo.utils;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Validations extends PageObject {

    public void validateObjectPresence (By by){
        Assert.assertTrue(this.find(by).isPresent());

    }




}
