import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    private static int ties;
    private static int player1Wins;
    private static int player2Wins;

    /**
     * This is the main method. Command-line arguments are passed through the args parameter, which is an array of Strings. This allows for text to be inpoutted and outputted
     * onto the terminal. Here you will call all other methods.
     */
    public static void main(String[] args) {
        //test change 2
    }

    /**
     * A simple title
     */
    public static void generateTitle() {
    }

    /**
     * asks the player to choose between a single player or two player game and calls the
     * appropriate method
     */
    public static void startGame() {
    }

    /**
     * A single player game mode that allows the player to play with a bot that generates
     * a random number between 1 to 3 as its choice.
     */
    public static void singlePlayerGame() {
    }

    /**
     * a two player game mode. Each player must choose a number from 1 to 3.
     */
    public static void twoPlayerGame() {
    }

    /**
     * Contains the logic of who wins. The score is also incremented here.
     *
     * @param player1 The first players option as an integer 1 to 3
     * @param player2 The second player option or the bot as an integer 1 to 3
     */
    public static void GameLogic(int player1, int player2){
    }

    /**
     * @param gameType 1 for a single player game mode and 2 for two player game mode
     */
    public static void checkEndGame(int gameType){
    }

    /**
     * Getter method to get the value of ties used for testing
     */
    public static int getTies() {
        return ties;
    }
    /**
     * Getter method to get the value of player 1 wins used for testing
     */
    public static int getPlayer1Wins() {
        return player1Wins;
    }
    /**
     * Getter method to get the value of player 2 wins used for testing
     */
    public static int getPlayer2Wins() {
        return player2Wins;
    }
}
