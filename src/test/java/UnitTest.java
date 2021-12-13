import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

@RunWith(JUnit4ClassRunner.class)
public class UnitTest {
    @Test
    public void contextLoads() {
        Assertions.assertEquals("10 за 3 лабу по PAD", "10 за 3 лабу по PAD");
    }
}
