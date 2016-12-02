package game;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by cloudera on 12/2/16.
 */
public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        Player player = new Player();

        // set name
        System.out.println("Enter your name...");
        player.setName(reader.next());

        System.out.println("Enter a max value to start the game");
        int maxValue = reader.nextInt(); // Scans the next token of the input as an int.

        GuessGameServiceImpl guessGameService = new GuessGameServiceImpl();
        guessGameService.play(player, maxValue);

        guessGameService.printBestScore(player);
    }
}



