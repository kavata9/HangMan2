import org.junit.*;
import static org.junit.Assert.*;


public class HangManTest{
    //Test if the word returns a string
    @Test
    public void game_WillReturnUsAString(){
        HangManApp playHangman = new HangManApp();
        assertEquals("Monday", playHangman.Words());
    }
     //Test to check if the words are randomly selected
     @Test
     public void game_WillRandomlyWords(){
         HangManApp playHangman = new HangManApp();
         assertEquals("Monday", playHangman.randomize());
     }
 
  }