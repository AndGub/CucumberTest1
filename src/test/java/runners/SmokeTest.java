package runners;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps",
        tags = "@smoketest, @smoketest2",
        plugin = {"json:target/cucumber.json"}
)

public class SmokeTest {
    @BeforeClass
    static public void setupTimeout()
    {
        Configuration.timeout = 10000;
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        Configuration.browser = "chrome";
    }

}
