package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GCD {

    private static final int MAX_QUESTIONS_NUMBER = 100;
    private static final String CONDITION_OF_GAME = "Find the greatest common divisor of given numbers.";

    private static String getConditionOfGame() {
        return CONDITION_OF_GAME;
    }

    public static void startGame(final int numbersOfGame) {
        List<Game> games = new ArrayList<>();
        String condition = getConditionOfGame();
        for (int i = 0; i < numbersOfGame; i++) {
            games.add(getQuestion());
        }
        Engine.startGame(games, condition);
    }

    private static int findGCD(int num1, int num2) {
        int minNum = Math.min(num1, num2);
        int gcd = 1;
        for (int i = 2; i <= minNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static Game getQuestion() {
        Random random = new Random();
        int questionNumber1 = random.nextInt(MAX_QUESTIONS_NUMBER) + 1;
        int questionNumber2 = random.nextInt(MAX_QUESTIONS_NUMBER) + 1;
        String answer = String.valueOf(findGCD(questionNumber1, questionNumber2));
        String question = questionNumber1 + " " + questionNumber2;
        return new Game(question, answer);
    }

}
