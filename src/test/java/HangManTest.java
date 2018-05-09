import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class HangManTest {
@Test
  public void getStringWord() {
    HangManApp word = new HangManApp();
    assertEquals("Test", word.words());
  }
  // This will Test if the random picker works
  @Test
  public void getRandomword() {
    HangManApp words = new HangManApp();
    assertEquals("Gradle", words.randWords());
}