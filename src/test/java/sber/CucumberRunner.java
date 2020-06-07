package sber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"stepsdefs"},
        features = {"src/test/resources/"},
        tags = {"@main"}


)
public class CucumberRunner {

}