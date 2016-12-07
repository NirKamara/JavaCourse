package game;

import java.io.IOException;
import java.util.*;
import java.io.DataInputStream;

/**
 * Created by student14 on 30/11/2016.
 */
public class GuessGameServiceImpl implements GuessGameService {

    public void play(Player player, int max) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in

        // random number
        Random randomNum = new Random();
        int randomInt = randomNum.nextInt(max);

        // loop till user guess the number
        int playerGuess = -1;
        int numOfGuesses = 0;

        while (playerGuess != randomInt) {
            System.out.println("Enter number:"); 
            playerGuess = reader.nextInt();
            numOfGuesses++;

            System.out.println("Your guess number was: " + Integer.toString(playerGuess) + "\n");

            if (playerGuess == randomInt) {
                System.out.println("BINGO!!! That's the number!");
                player.setRetry(playerGuess);
            }


            else if (playerGuess > randomInt)
                System.out.println("Your number was bigger than the random number");
            else
                System.out.println("Your number was smaller than the random number");

            System.out.println("Number of retries: " + Integer.toString(numOfGuesses) + "\n");
        }
    }

    public void printBestScore(Player player) {
        System.out.println("Best player Score: " + Collections.max(player.getRetries()));
    }

    public void printBestScore(List<Player> players) {

    }


    // write the num or retries somewhere

        // create player class with ID, Name and score
}
