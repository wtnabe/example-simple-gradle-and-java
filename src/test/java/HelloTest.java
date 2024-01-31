import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HelloTest {
  @Test
  public void TestHelloMain () {
    assertNotNull(new Hello());
  }
}
