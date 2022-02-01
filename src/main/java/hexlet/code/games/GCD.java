package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class GCD {

    private static final String CONDITION_OF_GAME = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        List<Game> games = new ArrayList<>();
        for (int i = 0; i < Engine.NUMBER_OF_GAMES; i++) {
            int questionNumber1 = Utils.generateRandom(1, Utils.MAX_QUESTIONS_NUMBER);
            int questionNumber2 = Utils.generateRandom(1, Utils.MAX_QUESTIONS_NUMBER);
            // получение ответа и вопроса в одну строку,
            // поэтому не стал выносить в отдельные функции
            String answer = String.valueOf(findGCD(questionNumber1, questionNumber2));
            String question = questionNumber1 + " " + questionNumber2;
            games.add(new Game(question, answer));
        }
        Engine.startGame(games, CONDITION_OF_GAME);
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

}
