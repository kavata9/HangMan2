import org.junit.Test;
import static org.junit.Assert.*;
public class HangManTest {
@Test
  public void getStringWord() {
    HangManApp word = new HangManApp();
    assertEquals("Test", word.words());
  }
  @Test
  public void getStringWordrandom() {
    HangManApp word = new HangManApp();
    assertArrayEquals("Project", word.randomword);
  }
}