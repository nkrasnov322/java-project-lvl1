package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Calc {

    private static final int MAX_QUESTIONS_NUMBER = 100;
    private static final byte NUMBERS_OF_OPERATIONS = 3;
    private static final String CONDITION_OF_GAME = "What is the result of the expression?";

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

    private static Game getQuestion() {
        Random random = new Random();
        String answer = "";
        String question = "";
        int questionNumber1 = random.nextInt(MAX_QUESTIONS_NUMBER);
        int questionNumber2 = random.nextInt(MAX_QUESTIONS_NUMBER);
        int numberOfOperation = random.nextInt(NUMBERS_OF_OPERATIONS);
        String operation = "";
        if (numberOfOperation == 0) {
            operation = "+";
            answer = String.valueOf(questionNumber1 + questionNumber2);
        } else if (numberOfOperation == 1) {
            operation = "-";
            answer = String.valueOf(questionNumber1 - questionNumber2);
        } else {
            operation = "*";
            answer = String.valueOf(questionNumber1 * questionNumber2);
        }
        question = String.valueOf(questionNumber1) + " " + operation + " " + String.valueOf(questionNumber2);
        return new Game(question, answer);
    }

}
