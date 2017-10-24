import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    public static WebDriver webDriver;

    public static WebDriver getWebDriver() {

        if (webDriver == null) {
                ChromeDriverManager.getInstance().setup();
                webDriver = new ChromeDriver();
        }
        return webDriver;
    }
}
