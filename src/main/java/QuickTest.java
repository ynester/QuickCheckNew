import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;


public class QuickTest {
    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = Driver.getWebDriver();
        driver.get("https://www.google.com/");
        System.out.println("Test completed");
        System.out.println("One more change");
        driver.quit();
    }
}
