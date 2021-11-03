package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Game;
import hexlet.code.games.Greet;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Engine {
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

    public static void startGame(int numberOfGame) {

        String userName = Cli.logIn();
        Scanner sc = new Scanner(System.in);

        List<Game> games = gameByNumber(numberOfGame);

        for (Game game: games) {
            System.out.println("Question: " + game.getQuestion());
            System.out.print("Your answer: ");
            String answer = sc.next();
            boolean isCorrectAnswer = answer.equals(game.getAnswer());
            if (isCorrectAnswer) {
                System.out.println("Correct!");
            } else {
                String correctAnswer = game.getAnswer();
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                System.out.println();
                return;
            }
        }
        sc.close();
        System.out.println("Congratulations, " + userName + "!");
    }

}
