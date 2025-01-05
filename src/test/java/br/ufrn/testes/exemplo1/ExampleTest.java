import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExampleTest {

  @Test
  public void testSum() {
    Example example = new Example();
    assertEquals(5, example.sum(2, 3));
    assertEquals(0, example.sum(-1, 1));
    assertEquals(-3, example.sum(-1, -2));
  }
}