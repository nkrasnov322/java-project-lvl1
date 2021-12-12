package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Prime {

    private static final int MAX_QUESTIONS_NUMBER = 100;
    private static final String CONDITION_OF_GAME = "Answer 'yes' if number even otherwise answer 'no'.";

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
        int questionNumber = random.nextInt(MAX_QUESTIONS_NUMBER) + 1;
        String answer = "yes";
        for (int i = 2; i < questionNumber; i++) {
            if (questionNumber % i == 0) {
                answer = "no";
                break;
            }
        }
        String question = String.valueOf(questionNumber);
        return new Game(question, answer);
    }

}
