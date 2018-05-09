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
     //Test to see if Words are Split into Characters
    @Test
    public void game_WillMakeWordsCharacters(){
        HangManApp playHangman = new HangManApp();
        String [] charWord = {"M","o","n","d","a","y"};
        assertEquals(charWord, playHangman.convertToChar("Monday"));
    }
    @Test
    public void game_WillMakeUserInputCharacters(){
        HangManApp playHangMan = new HangManApp();
        String [] charWord = {"M","o","n","d","a","y"};
        assertEquals(charWord, playHangMan.convertUIToChar("Monday"));
    }
  }