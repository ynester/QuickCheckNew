import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class QuickTest {

//    @Test
//    public void passTest() {
//        Assert.assertTrue("Test", true);
//    }
//
    @Test
    public void failedTest() {
        Assert.assertFalse("Test Failed", true);
    }
    @Test
    public void test() throws InterruptedException, MalformedURLException {
        WebDriver driver = Driver.getWebDriver();
        boolean check;
        driver.get("http://cellone.ntent.com/#");
        driver.findElement(By.xpath("//span[@class='icon-weather-icon']")).click();
        Thread.sleep(2000);
        check = !driver.findElements(By.xpath("//section[@class='weatherSection bg6x  widget']")).isEmpty();
        Assert.assertTrue("Test weather widget",check);
    }
}
