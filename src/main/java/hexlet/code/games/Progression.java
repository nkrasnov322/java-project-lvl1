package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Progression {

    private static final int NUMBER_OF_ITEMS = 10;

    public static List<Game> getListOfGame(int number) {
        printConditionOfGame();
        List<Game> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(getQuestion());
        }
        return list;
    }

    private static void printConditionOfGame() {
        System.out.println("What number is missing in the progression?");
    }

    private static Game getQuestion() {
        Random random = new Random();
        int firstElement = random.nextInt(NUMBER_OF_ITEMS);
        int step = random.nextInt(NUMBER_OF_ITEMS);
        int hiddenElement = random.nextInt(NUMBER_OF_ITEMS) + 1;
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
