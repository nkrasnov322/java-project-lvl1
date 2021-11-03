package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Greet {

    private static final int MAX_QUESTIONS_NUMBER = 100;

    public static List<Game> getListOfGame(int number) {
        printConditionOfGame();
        List<Game> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(getQuestion());
        }
        return list;
    }

    private static void printConditionOfGame() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    private static Game getQuestion() {
        Random random = new Random();
        int questionNumber = random.nextInt(MAX_QUESTIONS_NUMBER);
        String answer = questionNumber % 2 == 0 ? "yes" : "no";
        String question = String.valueOf(questionNumber);
        return new Game(question, answer);
    }

}
