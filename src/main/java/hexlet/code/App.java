package hexlet.code;

import hexlet.code.games.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final int NUMBER_OF_GAMES = 3;

    private static List<Game> gameByNumber(int numberOfGame) {

        final int numberOfPrimeGame     = 6;
        final int numberOfProgressGame  = 5;
        final int numberOfGCDGame       = 4;
        final int numberOfCalcGame      = 3;
        final int numberOfGreetGame     = 2;

        if (numberOfGame == numberOfGreetGame) {
            return Greet.getListOfGame(NUMBER_OF_GAMES);
        } else if (numberOfGame == numberOfCalcGame) {
            return Calc.getListOfGame(NUMBER_OF_GAMES);
        } else if (numberOfGame == numberOfGCDGame) {
            return GCD.getListOfGame(NUMBER_OF_GAMES);
        } else if (numberOfGame == numberOfProgressGame) {
            return Progression.getListOfGame(NUMBER_OF_GAMES);
        } else if (numberOfGame == numberOfPrimeGame) {
            return Prime.getListOfGame(NUMBER_OF_GAMES);
        } else {
            return new ArrayList<Game>();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int usersChoice = sc.nextInt();
        if (usersChoice == 1) {
            Cli.logIn();
        } else if (usersChoice > 1) {
            List<Game> game = gameByNumber(usersChoice);
            Engine.startGame(game);
        }

    }
}
