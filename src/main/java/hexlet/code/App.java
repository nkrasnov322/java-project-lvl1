package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Greet;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    private static final int NUMBER_OF_GAMES = 3;

    private static void startGame(int numberOfGame) {

        final int numberOfProgressGame  = 5;
        final int numberOfGCDGame       = 4;
        final int numberOfCalcGame      = 3;
        final int numberOfGreetGame     = 2;

        switch (numberOfGame) {
            case numberOfGreetGame:
                Greet.startGame(NUMBER_OF_GAMES);
                break;
            case numberOfCalcGame:
                Calc.startGame(NUMBER_OF_GAMES);
                break;
            case numberOfGCDGame:
                GCD.startGame(NUMBER_OF_GAMES);
                break;
            case numberOfProgressGame:
                Progression.startGame(NUMBER_OF_GAMES);
                break;
            default:
                Prime.startGame(NUMBER_OF_GAMES);
                break;
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
            startGame(usersChoice);
        }

    }
}
