import java.util.Random;
import java.io.*;


public class HangManApp{

    Console myConsole = System.console();
    int score;
    int guesses;
    int attempts;

    public void playGame(){
        attempts = 9;
        App start = new App();
        start.startGame();
        String selectedDay = start.getWords();
        char[] DaysOfTheWeek = selectedDay.toCharArray();
        char[] weekday = new char[DaysOfTheWeek.length];
        for(int d=0;d<DaysOfTheWeek.length;d++){
            weekday[d] = '_';
        }
        String correctDay = new String(weekday);
        StringBuilder answer = new StringBuilder(correctDay);
        for(int a=0;a<10;a++){
            System.out.println("You have " + attempts + " attempts left.\r\n Please guess a letter: ");
            String guessedLetter = myConsole.readLine();
            char letter = guessedLetter.charAt(0); 
            System.out.println("selected letter: " + letter);
            for(int j=0;j<DaysOfTheWeek.length;j++){
                if(letter == DaysOfTheWeek[j]){
                    answer.setCharAt(j, letter);
                    System.out.println(answer + "\r\n");
                    score++;
                }
            }
            attempts--;
            guesses++;
            if(score==DaysOfTheWeek.length){
                System.out.println("Congratulations you guessed it right!!. The day is " + answer);
                a=10;
            }
            if(guesses==10){
                System.out.println("You failed to get the right guess.start again.");
            }

        }
    }
}