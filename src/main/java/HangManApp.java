import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.io.Console;
// This checks that the function should return a string data
public class HangManApp {
  private String guessedWord;
  private String myInput;

  public String words() {
    return "Gradle";
  }

  // This Functions will Show the random word
  public String randWords() {
    Random myRandom = new Random();
    String[] myWords = { "Gradle", "HangMan", "Build", "Peace" };
    int myIndex = myRandom.nextInt(1);

    guessedWord = myWords[myIndex];
    return guessedWord;
  }
}