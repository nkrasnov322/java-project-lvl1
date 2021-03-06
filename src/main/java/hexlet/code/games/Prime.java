package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public final class Prime {

    private static final String CONDITION_OF_GAME = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void startGame() {
        List<Game> games = new ArrayList<>();
        for (int i = 0; i < Engine.NUMBER_OF_GAMES; i++) {
            int questionNumber = Utils.generateRandom(0, Utils.MAX_QUESTIONS_NUMBER);
            String question = String.valueOf(questionNumber);
            String answer = makeAnswer(questionNumber);
            games.add(new Game(question, answer));
        }
        Engine.startGame(games, CONDITION_OF_GAME);
    }

    private static String makeAnswer(int questionNumber) {

        for (int i = 2; i < questionNumber; i++) {
            if (questionNumber % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

}
