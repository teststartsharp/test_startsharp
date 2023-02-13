package is.serenity.demo.utils;

import org.openqa.selenium.By;

public class ReplaceLocator {

    public static By replace(String string, String replace, String option){
        By xpath = By.xpath(string.replace(replace, option));
        return xpath;
    }

    public static String replaceText(String string, String replace, String option){
        String text = string.replace(replace,option);
        return text;
    }

}
