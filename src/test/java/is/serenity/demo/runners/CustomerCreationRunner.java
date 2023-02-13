package is.serenity.demo.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import is.serenity.demo.models.RunnerClass;
import is.serenity.demo.utils.BeforeSuite;
import is.serenity.demo.utils.DataToFeature;
import org.junit.runner.RunWith;

import java.io.IOException;

import static is.serenity.demo.utils.ClassType.RUNNER_CLASS;

@RunWith(RunnerClass.class)
@CucumberOptions(features = "src/test/resources/is.serenity.demo.features/customerCreation.feature",
        glue = "is.serenity.demo.stepdefinitions",
       // tags = "@Case1,@Case2",
        snippets = SnippetType.CAMELCASE)
public class CustomerCreationRunner {

    public CustomerCreationRunner() {
        throw new IllegalStateException(RUNNER_CLASS);
    }

    @BeforeSuite
    public static void test () throws IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/is.serenity.demo.features/customerCreation.feature");
    }
}
