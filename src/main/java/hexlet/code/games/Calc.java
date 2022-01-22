package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public final class Calc {

    private static final String CONDITION_OF_GAME = "What is the result of the expression?";

    private static String getConditionOfGame() {
        return CONDITION_OF_GAME;
    }

    public static void startGame(String username) {
        List<Game> games = new ArrayList<>();
        String condition = getConditionOfGame();
        for (int i = 0; i < Engine.NUMBER_OF_GAMES; i++) {
            games.add(getQuestion());
        }
        Engine.startGame(games, condition, username);
    }

    private static Game getQuestion() {

        String answer = "";
        String question = "";
        int questionNumber1 = Utils.generateRandom(0, Utils.MAX_QUESTIONS_NUMBER);
        int questionNumber2 = Utils.generateRandom(0, Utils.MAX_QUESTIONS_NUMBER);
        int numberOfOperation = Utils.generateRandom(0, Utils.NUMBERS_OF_OPERATIONS);
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
