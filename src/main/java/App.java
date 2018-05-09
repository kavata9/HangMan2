import java.util.Arrays;
 import java.util.Random;
 import java.io.Console;
 import java.util.Scanner;

 public class App {
  public String guessedWord;
  public String myInput;
  //This Shows that it returns a String
    public String words(){
      return "Monday";
    }

    //This Functions will Show the random word
    public String randWords(){
      Random myRandom = new Random();
      String[] myWords = {"Monday", "Tuesday", "Wednesday","Thursday","Friday"};
      int myIndex = myRandom.nextInt(1);

      guessedWord = myWords[myIndex];
      return guessedWord;
    }

    //This test will detrmine if the String will be split
    public String[] splitWords(String guessedWord){
      String[] splitWords = guessedWord.split("");
      return splitWords;
    }

    //This Test will now Compare the user Input and the split result
    public String[] breakupUserInput(String myInput){
      String[] splitUserInputs = myInput.split("");
      return splitUserInputs;
    }

    public static void main(String[] args) {
      //Lets Initialize the random picker
      Random myRandom = new Random();
      String[] myWords = {"Monday", "Tuesday", "Wednesday","Thursday","Friday"};
      int myIndex = myRandom.nextInt(4);
      String theWord = myWords[myIndex];

      //Separate the Word into Characters
      char[] correctWords = theWord.toCharArray();


      //Let the user Interact with the console
      Console myConsole = System.console();
      System.out.println("Hello welcome to my Hangman Game");
      System.out.println("The word that You should guess has a length of "+theWord.length());
      System.out.println("Guess a word to Play.Let's do this !!!");

      //Let the user Put the Input

    //char[] myinputss = myInput.toCharArray();
    Scanner s = new Scanner(System.in);
    //Now Lets Compare
    for(int i=0; i <= theWord.length();i++){
      System.out.println("Enter the Letter you guess");
      char myInput = s.next().charAt(i);
      if (myInput == theWord.charAt(i)) {
        System.out.println("Correct you have %d Chances");
      }
    }

    }
}