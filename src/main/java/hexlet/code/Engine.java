package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    private static final int NUMBER_OF_GAMES = 3;

    private static Game gameByNumber(int numberOfGame) {

        final int numberOfPrimeGame     = 6;
        final int numberOfProgressGame  = 5;
        final int numberOfGCDGame       = 4;
        final int numberOfCalcGame      = 3;
        final int numberOfGreetGame     = 2;


        if (numberOfGame == numberOfGreetGame) {
            return new Greet();
        } else if (numberOfGame == numberOfCalcGame) {
            return new Calc();
        } else if (numberOfGame == numberOfGCDGame) {
            return new GCD();
        } else if (numberOfGame == numberOfProgressGame) {
            return new Progression();
        } else if (numberOfGame == numberOfPrimeGame) {
            return new Prime();
        }
        else {
            return null;
        }
    }

    public static void startGame(int numberOfGame) {

        String userName = Cli.logIn();
        Scanner sc = new Scanner(System.in);

        Game game = gameByNumber(numberOfGame);
        game.startGame();
        for (int i = 0; i < NUMBER_OF_GAMES; i++) {
            System.out.println("Question: " + game.getQuestion());
            System.out.print("Your answer: ");
            String answer = sc.next();
            boolean isCorrectAnswer = game.checkUserAnswer(answer);
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
