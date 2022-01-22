package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public final class Progression {

    private static final int NUMBER_OF_ITEMS = 10;
    private static final String CONDITION_OF_GAME = "What number is missing in the progression?";

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
        int firstElement = Utils.generateRandom(0, NUMBER_OF_ITEMS);
        int step = Utils.generateRandom(0, NUMBER_OF_ITEMS);
        int hiddenElement = Utils.generateRandom(1, NUMBER_OF_ITEMS);
        int lastElement = firstElement;
        String question = String.valueOf(firstElement);
        String answer = "";
        if (hiddenElement == 1) {
            question = "..";
            answer = String.valueOf(lastElement);
        }
        for (int i = 2; i <= NUMBER_OF_ITEMS; i++) {
            lastElement = lastElement + step;
            if (i == hiddenElement) {
                answer = String.valueOf(lastElement);
                question += " ..";
            } else {
                question += " " + lastElement;
            }
        }
        return new Game(question, answer);
    }

}
