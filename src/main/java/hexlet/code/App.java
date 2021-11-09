package hexlet.code;

import hexlet.code.games.Game;
import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Greet;
import hexlet.code.games.Prime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final int NUMBER_OF_GAMES = 3;

    private static List<Game> gameByNumber(int numberOfGame) {

        printConditionOfGame(numberOfGame);
        List<Game> list = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_GAMES; i++) {
            list.add(getQuestion(numberOfGame));
        }
        return list;
    }

    private static void printConditionOfGame(int numberOfGame) {
        final int numberOfProgressGame  = 5;
        final int numberOfGCDGame       = 4;
        final int numberOfCalcGame      = 3;
        final int numberOfGreetGame     = 2;

        if (numberOfGame == numberOfGreetGame) {
            Greet.printConditionOfGame();
        } else if (numberOfGame == numberOfCalcGame) {
            Calc.printConditionOfGame();
        } else if (numberOfGame == numberOfGCDGame) {
            GCD.printConditionOfGame();
        } else if (numberOfGame == numberOfProgressGame) {
            Progression.printConditionOfGame();
        } else {
            Prime.printConditionOfGame();
        }
    }

    private static Game getQuestion(int numberOfGame) {

        final int numberOfProgressGame  = 5;
        final int numberOfGCDGame       = 4;
        final int numberOfCalcGame      = 3;
        final int numberOfGreetGame     = 2;

        if (numberOfGame == numberOfGreetGame) {
            return Greet.getQuestion();
        } else if (numberOfGame == numberOfCalcGame) {
            return Calc.getQuestion();
        } else if (numberOfGame == numberOfGCDGame) {
            return GCD.getQuestion();
        } else if (numberOfGame == numberOfProgressGame) {
            return Progression.getQuestion();
        } else {
            return Prime.getQuestion();
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
