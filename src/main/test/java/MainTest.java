import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testCheckNumberEven() {
        assertEquals("Even", Main.checkNumber(4));
    }

    @Test
    void testCheckNumberOdd() {
        assertEquals("Odd", Main.checkNumber(5));
    }

    @Test
    void testSumUpToN() {
        assertEquals(15, Main.sumUpToN(5));
    }
}