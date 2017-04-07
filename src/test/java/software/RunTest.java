package software;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)





@CucumberOptions( format = {"pretty", "html:target/html", "json:target/output.json"} ,
        features = "C:\\Users\\Mehul\\IdeaProjects\\Scruwfix5\\src\\test\\Resource\\Register.feature")

public class RunTest
{


}
