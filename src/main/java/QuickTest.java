import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class QuickTest {
    public static void main(String[] args) {

        WebDriver driver = Driver.getWebDriver();
        driver.get("https://www.google.com/");
        System.out.println("Test completed");
        System.out.println("One more change");
        driver.quit();
    }
}
