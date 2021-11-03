package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Prime {

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
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    private static Game getQuestion() {
        Random random = new Random();
        int questionNumber = random.nextInt(MAX_QUESTIONS_NUMBER);
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
