package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public final class Calc {

    private static final String CONDITION_OF_GAME = "What is the result of the expression?";

    public static void startGame() throws Exception {
        List<Game> games = new ArrayList<>();
        for (int i = 0; i < Engine.NUMBER_OF_GAMES; i++) {
            int questionNumber1 = Utils.generateRandom(0, Utils.MAX_QUESTIONS_NUMBER);
            int questionNumber2 = Utils.generateRandom(0, Utils.MAX_QUESTIONS_NUMBER);
            int numberOfOperation = Utils.generateRandom(0, Utils.NUMBERS_OF_OPERATIONS);
            String answer = calculate(questionNumber1, questionNumber2, numberOfOperation);
            String question = buildQuestion(questionNumber1, questionNumber2, numberOfOperation);
            games.add(new Game(question, answer));
        }
        Engine.startGame(games, CONDITION_OF_GAME);
    }

    private static String buildQuestion(int number1, int number2, int numOperation) throws Exception {
        String operation = switch (numOperation) {
            case 0 -> " + ";
            case 1 -> " - ";
            case 2 -> " * ";
            default -> throw new Exception("Неизвестный номер операции");
        };
        return number1 + operation + number2;
    }

    private static String calculate(int number1, int number2, int numOperation) throws Exception {
        int result = switch (numOperation) {
            case 0 -> number1 + number2;
            case 1 -> number1 - number2;
            case 2 -> number1 * number2;
            default -> throw new Exception("Неизвестный номер операции");
        };
        return String.valueOf(result);
    }
}
