package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public final class Progression {

    private static final int NUMBER_OF_ITEMS = 10;
    private static final String CONDITION_OF_GAME = "What number is missing in the progression?";

    public static void startGame() {
        List<Game> games = new ArrayList<>();
        for (int i = 0; i < Engine.NUMBER_OF_GAMES; i++) {
            int firstElement = Utils.generateRandom(0, NUMBER_OF_ITEMS);
            int step = Utils.generateRandom(1, NUMBER_OF_ITEMS);
            int hiddenElement = Utils.generateRandom(1, NUMBER_OF_ITEMS);
            String question = buildQuestion(firstElement, step, hiddenElement);
            String answer = String.valueOf(firstElement + step * (hiddenElement - 1));
            games.add(new Game(question, answer));
        }
        Engine.startGame(games, CONDITION_OF_GAME);
    }

    private static String buildQuestion(int firstElement, int step, int hiddenElement) {

        int lastElement = firstElement;
        String question = String.valueOf(firstElement);
        if (hiddenElement == 1) {
            question = "..";
        }
        for (int i = 2; i <= NUMBER_OF_ITEMS; i++) {
            lastElement = lastElement + step;
            if (i == hiddenElement) {
                question += " ..";
            } else {
                question += " " + lastElement;
            }
        }
        return question;

    }

}
