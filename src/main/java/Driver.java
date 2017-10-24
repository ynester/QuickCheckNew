import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    public static WebDriver webDriver;

    public static WebDriver getWebDriver() throws MalformedURLException {


        if (webDriver == null) {
            Capabilities chromeCapabilities = DesiredCapabilities.chrome();
            try {
                webDriver = new RemoteWebDriver(new URL("http://localhost:32769/wd/hub"), chromeCapabilities);

//
//            ChromeDriverManager.getInstance().setup();
//            webDriver = new ChromeDriver();

            } catch (MalformedURLException ex) {
                ex.printStackTrace();
            }
        }
        return webDriver;
    }
}
