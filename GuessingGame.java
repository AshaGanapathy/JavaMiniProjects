package client;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    Scanner scanner;
    public GuessingGame() {
        scanner = new Scanner(System.in);
    }
    
    public void run(){
        int min = 1;
        int max = 1000;
        int randomNumber = generateRandomNumber(max,min);
        System.out.println("Guess a number between "+min+" and "+max);
        int guessedNumber = scanner.nextInt();
        
        while(randomNumber != guessedNumber){            
            if(randomNumber > guessedNumber){
               System.out.println("Try again with a higher number"); 
                guessedNumber = scanner.nextInt();
                }
            else{
                System.out.println("Try again with a lower number");
                guessedNumber = scanner.nextInt();
            }            
        }  
        System.out.println("You have guessed the correct number");
    }

    public static void main(String[] args) {
        GuessingGame guessingGame = new GuessingGame();
        guessingGame.run();
    }

    private int generateRandomNumber(int max, int min) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
