package cucumber2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions (features={"src/test/resources/footer/footer.feature"} ,glue = {"defination"} ,plugin = {"html:busa/saikiran.html"})
public class runner2    {

}
