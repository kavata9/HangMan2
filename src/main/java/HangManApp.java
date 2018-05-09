import java.util.Random;


public class HangManApp{

    public String randomWord;

    //Test to check if a string is returned

    public String Words(){

        return "Monday";

    }
    //Function to check if words are being randomized
    public String randomize(){

      String [] myWords = {"Monday", "Tuesday", "Wednesday","Thursday","Friday"};

      Random myRandomizedWord = new Random();

      int indexedWord = myRandomizedWord.nextInt(1);

      randomWord = myWords[indexedWord];

      return randomWord;
  }
  //Function to check if words are converted to characters
  public String [] convertToChar(String randomWord){
    String [] CharWord = randomWord.split("");
    return CharWord;
}
//Function to Break User input
public String [] convertUIToChar(String userInput){
  String [] splitUserInput = userInput.split("");
  return splitUserInput;
  }

}