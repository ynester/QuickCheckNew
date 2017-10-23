import org.junit.Assert;
import org.junit.Test;

public class QuickTest {
    @Test
    public void passTest() {
        Assert.assertTrue("Test", true);
    }

    @Test
    public void failedTest() {
        Assert.assertFalse("Test Failed", false);
    }
}
