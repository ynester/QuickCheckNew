import org.openqa.selenium.WebDriver;


public class QuickTest {
    public static void main(String[] args) {

        WebDriver driver = Driver.getWebDriver();
        driver.get("https://www.google.com/");
        System.out.println("Test completed");
        System.out.println("One more change");
        driver.quit();
    }
}
