package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public final class Greet {

    private static final String CONDITION_OF_GAME = "Answer 'yes' if number even otherwise answer 'no'.";

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
        int questionNumber = Utils.generateRandom(1, Utils.MAX_QUESTIONS_NUMBER);
        String answer = questionNumber % 2 == 0 ? "yes" : "no";
        String question = String.valueOf(questionNumber);
        return new Game(question, answer);
    }

}
